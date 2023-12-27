package com.project.spring.core.si.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/project/spring/core/si/pojo/config.xml");
		
		Employee e1 = (Employee)context.getBean("emp1");
		System.out.println(e1);

		Employee e2 = context.getBean("emp2", Employee.class);
		System.out.println(e2);
		
		Employee e3 = context.getBean("emp3", Employee.class);
		System.out.println(e3);
	}

}
