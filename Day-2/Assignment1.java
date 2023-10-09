/* We Have to Create Employee Class and Take Inputs from users
 * we have to take 5 employee Inputs
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Iterator;

class Employee
{
    String eid, ename, joining_date;
    Employee(String eid, String ename, String joining_date)
    {
        this.eid = eid;
        this.ename = ename;
        this.joining_date = joining_date;
    }
    void display()
    {
        System.out.println("Eid : "+eid);
        System.out.println("Ename : "+ename);
        System.out.println("Joining Date : "+joining_date);
    }
}

class Drive
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        
        
        LinkedList<Employee> emp = new LinkedList<Employee>();
        
        System.out.println("Enter 5 Employee Details : ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter Details : ");
            System.out.print("Employee Id : ");
            String eid = rd.readLine();
            System.out.print("Employee name : ");
            String ename = rd.readLine();
            System.out.print("Employee Joining Date : ");
            String joining_date = rd.readLine();
            emp.add(new Employee(eid, ename, joining_date));
        }
        
        Iterator<Employee> e_itr = emp.iterator();
        
        System.out.println("-------------------------------");
        System.out.println("Details are : ");
        System.out.println("-------------------------------");
        
        while(e_itr.hasNext())
        {
            Employee temp = e_itr.next();
            temp.display();
        }
        
    }
}


