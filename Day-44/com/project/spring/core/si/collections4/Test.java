package com.project.spring.core.si.collections4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/project/spring/core/si/collections4/config.xml");
		Questions que1 = context.getBean("ques1", Questions.class);
		
		System.out.println(que1);
	}

}
