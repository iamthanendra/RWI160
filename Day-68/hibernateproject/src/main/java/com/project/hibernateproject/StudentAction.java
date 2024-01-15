package com.project.hibernateproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class StudentAction {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	private static void showAllData()
	{
		try(SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session session = factory.openSession())
		{

			String query = "from Student";
			Query q = session.createQuery(query);
//			q.setParameter("x", "Rahul");
			
			List<Student> list = (List<Student>) q.list();
			
			System.out.println("--------------------------------------------------");
			
			list.forEach((e)->{
				System.out.println(e.getStudentRollNo()+"\t:\t"+e.getStudentName()+"\t:\t"+e.getStudentAge());
			});
			

			System.out.println("--------------------------------------------------");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteStudent() throws IOException
	{
		try(SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session session = factory.openSession())
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Roll No : ");
			int temp = Integer.parseInt(reader.readLine());
			
			Student st = (Student)session.get(Student.class, temp);
			
			if(st == null)
			{
				System.out.println("Roll not exist");
				return;
			}
			

			
			Transaction tx = session.beginTransaction();
			
			session.delete(st);
			tx.commit();
			
			System.out.println("Student Updated Successfully");	
			showAllData();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	private static void updateStudent() throws IOException
	{
		try(SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session session = factory.openSession())
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Roll No : ");
			int temp = Integer.parseInt(reader.readLine());
			
			Student st = (Student)session.get(Student.class, temp);
			
			if(st == null)
			{
				System.out.println("Roll not exist");
				return;
			}
			
			st.setStudentRollNo(temp);
			System.out.println("Want to update Student Name (1 for Yes) : ");
			int choice = Integer.parseInt(reader.readLine());
			if(choice == 1) {

				System.out.print("Enter Name No : ");
				String name = reader.readLine();
				st.setStudentName(name);
			}

			System.out.println("Want to update Student Age (1 for Yes) : ");
			choice = Integer.parseInt(reader.readLine());
			if(choice == 1) {
				System.out.print("Enter Age : ");
				int age = Integer.parseInt(reader.readLine());
				st.setStudentAge(age);
			}
			
			Transaction tx = session.beginTransaction();
			
			session.update(st);
			tx.commit();
			
			System.out.println("Student Updated Successfully");
			showAllData();
			
		}
	}
	private static void addStudent() throws IOException
	{
		try(SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session session = factory.openSession())
		{
			Scanner sc = new Scanner(System.in);
			
			Student student = new Student();
			System.out.print("Enter Roll No : ");
			int temp = Integer.parseInt(reader.readLine());
			
			Student st = (Student)session.get(Student.class, temp);
			
			if(st != null)
			{
				System.out.println("Roll no already exist");
				return;
			}

			System.out.print("Enter Age : ");
			int age = Integer.parseInt(reader.readLine());
			student.setStudentAge(age);
			
			student.setStudentRollNo(temp);
			System.out.print("Enter Name No : ");
			String name = reader.readLine();
			student.setStudentName(name);

			
			Transaction tx = session.beginTransaction();
			
			session.save(student);
			tx.commit();
			
			System.out.println("Student Data Saved Successfully");
			showAllData();
			
			return;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void displayOptions()
	{
		try(Scanner sc = new Scanner(System.in)){
			int choice = 0;
			do {
				System.out.println("Enter Choice");
				System.out.println("1. Add Data");
				System.out.println("2. Update Data");
				System.out.println("3. Delete Data");
				System.out.println("4. Show All Data");
				System.out.println("5. Exit");
				
				choice  = Integer.parseInt(reader.readLine());
				
				if(choice == 1)
				{
					addStudent();
					
				}else if(choice == 2)
				{
					updateStudent();
				}else if(choice == 3)
				{
					deleteStudent();
				}
				else if(choice == 4)
				{
					showAllData();
				}
				

			}while(choice != 5);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String... args) {
		// TODO Auto-generated method stub
		displayOptions();
	}


}