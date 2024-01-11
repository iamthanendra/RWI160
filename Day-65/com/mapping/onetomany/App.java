package com.mapping.onetomany;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session  = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Questions q1 = new Questions();
		q1.setQname("What is Java");
		
		
		List<Answers> answers = new LinkedList<>();
		
		Answers answer1 = new Answers();
		answer1.setAnswerName("Object Oriented");
		
		Answers answer2 = new Answers();
		answer2.setAnswerName("Programming Language");
		
		answers.add(answer1);
		answers.add(answer2);
		
		q1.setAnswers(answers);
		
		session.save(q1);
		session.save(answer1);
		session.save(answer2);
		
		tx.commit();
	}

}
