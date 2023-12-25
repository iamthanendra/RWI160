package com.project.spring.core.si.collections2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/project/spring/core/si/collections2/config.xml");
		Questions ques = context.getBean("ques1", Questions.class);
		
		System.out.print(ques);
	}
}
