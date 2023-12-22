package com.project.practice.springcore;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/project/practice/springcore/config.xml");
    	
    	Employee emp = (Employee)context.getBean("emp");
    	System.out.println(emp);
    	
    	Employee emp1 = context.getBean("emp1", Employee.class);
    	
    	System.out.println(emp1);
    	
    	Employee emp2 = context.getBean("emp2", Employee.class);
    	System.out.print(emp2);
    	
    	EmployeeList employeeList = context.getBean("emplist", EmployeeList.class);
    	System.out.println(employeeList);
    	
    }
}
