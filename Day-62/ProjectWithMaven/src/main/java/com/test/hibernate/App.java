package com.test.hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder; 

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        
        System.out.println(factory);
        
        Transaction t = session.beginTransaction();
        
        Employee e1 = new Employee();
        
        e1.setId(160);
        e1.setFirstName("Thanendra");
        e1.setLastName("Kashyap");
        
        session.save(e1);  
        t.commit();  
        System.out.println("successfully saved");    
        factory.close();  
        session.close();  
    }
}
