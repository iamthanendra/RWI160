package com.test.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;


public class App1 {
	public static void main(String[] args)
	{
		try {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
	   Address a = new Address();
       a.setStreet("street1");
       a.setCity("DEHLI");
       a.setOpen(true);
        a.setX(1332.18);
        FileInputStream fls = new FileInputStream("src/main/java/11602236_21004063.jpg");
        byte[] data = new byte[fls.available()];
        fls.read(data);
        a.setImage(data);
       
       System.out.println(a);
       session.save(a);
       tx.commit();
       session.close();
	   }
		   catch(IOException e)
			{
			   System.out.println(e);
			   e.printStackTrace();
			}

		   catch(Exception e)
			{
			   e.printStackTrace();
			}
		
	}

}
