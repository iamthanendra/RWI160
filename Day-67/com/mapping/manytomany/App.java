package com.mapping.manytomany;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		try( SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
				Session session = factory.openSession() )
		{
			Emp thanendra = new Emp();
			thanendra.setEmpName("Thanendra");
			
			Emp tushar = new Emp();
			tushar.setEmpName("Tushar");
			
			Emp e1 = new Emp();
			e1.setEmpName("E1");
			
			Projects library = new Projects();
			library.setProjectName("Library Management System");
			library.setWorkingEmployee(Arrays.asList(thanendra, tushar, e1));
			
			Projects ecommerce = new Projects();
			ecommerce.setProjectName("Ecommerce");
			ecommerce.setWorkingEmployee(Arrays.asList(thanendra, tushar));
			
			Projects systemdesign = new Projects();
			systemdesign.setProjectName("System Design");
			systemdesign.setWorkingEmployee(Arrays.asList(tushar, e1));
			
			Projects frontend = new Projects();
			frontend.setProjectName("Froentend");
			frontend.setWorkingEmployee(Arrays.asList(thanendra, e1));
			
			thanendra.setAssignedProject(Arrays.asList(library,ecommerce, systemdesign, frontend ));
			tushar.setAssignedProject(Arrays.asList(library, ecommerce, systemdesign));
			e1.setAssignedProject(Arrays.asList(library, frontend));
			
			Transaction tx = session.beginTransaction();
			
			
			session.save(thanendra);
			session.save(tushar);
			session.save(e1);
			session.save(library);
			session.save(ecommerce);
			session.save(systemdesign);
			session.save(frontend);
			
			tx.commit();
			
			/*select emp.id, emp.empName, projects.id, projects.projectName from emp, projects, emp_projects where emp.id = emp
			_projects.Emp_id and projects.id = emp_projects.assignedProject_id;
			*/
			
		}
	}

}
