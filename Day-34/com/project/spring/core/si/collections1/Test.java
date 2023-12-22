package com.project.spring.core.si.collections1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/project/spring/core/si/collections1/config.xml");
		Questions ques = (Questions)context.getBean("ques1");
		
		System.out.print(ques);
	}
}
