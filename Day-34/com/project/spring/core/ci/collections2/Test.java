package com.project.spring.core.ci.collections2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context 
			= new ClassPathXmlApplicationContext("com/project/spring/core/ci/collections2/config.xml");
		
		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.print(emp1);
	}

}
