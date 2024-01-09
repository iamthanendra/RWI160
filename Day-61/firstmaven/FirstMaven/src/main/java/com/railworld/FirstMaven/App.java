package com.railworld.FirstMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	
    	Session session = factory.openSession();
    	
    	Book eyan = new Book();
//    	eyan.setId(1);
    	eyan.setName("anku");
    	eyan.setAuthor("kharat");
    	eyan.setPrice(400);
    	
    	Transaction t = session.beginTransaction();
    	session.save(eyan);
    	
//    	Book eyan1 = new Book();
////    	eyan1.setId(182);
//    	eyan1.setName("konohamuro1");
//    	eyan1.setAuthor("Fuji Yariyaman");
//    	eyan1.setPrice(599);
//    	session.save(eyan1);
    	
//
//    	eyan.setId(182);
    	eyan.setName("vk");
    	eyan.setAuthor("sai");
    	eyan.setPrice(5090);
    	
    	session.save(eyan);
    	
    	t.commit();
    	
    	factory.close();
    	session.close();
    }
}
