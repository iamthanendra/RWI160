package com.mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

;

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
    	Transaction t = session.beginTransaction();
    	
    	Employee thanendra = new Employee();
    	thanendra.setId(160);
    	thanendra.setName("Thanendra Kashyap");
    	thanendra.setEmail("thanendrakashyap0007@gmail.com");
    	
    	Address address = new Address();
//    	address.setId(120);
    	address.setAddressId(1);
    	address.setAddressLine1("Bilaspur");
    	address.setCity("BSP");
    	
    	address.setPincode(495330);
    	address.setState("CG");
    	
    	thanendra.setAddress(address);
    	
    	session.save(thanendra);
    	session.save(address);
    	
    	t.commit();
    }
}
