package com.self.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        System.out.println(factory);

        Transaction t = session.beginTransaction();

        userdetails e1 = new userdetails();

//        e1.setId(160);
        e1.setFirstName("thanendra");
        e1.setLastName("kashyap");

        session.save(e1);
        t.commit();
        System.out.println("successfully saved");

        session.close();
        factory.close();
    }
}
