package com.telusko.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hello {

    public static void main(String[] args){

        Alien a1 = new Alien();
        a1.setAge(41);
        a1.setId(104);
        a1.setName("Cristiano");

        a1.setTech("GOAT");

        // hibernate save with a1 object
        Configuration config = new Configuration();
        config.addAnnotatedClass(com.telusko.hibernateDemo.Alien.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        //CREATE a record
        //session.persist(a1);

        // FETCH a record
        //Alien a2 = session.get(Alien.class, "101");

         //session.update(a1);

        // session.merge(a1);

        //System.out.println("Name : " + a2.getName() + " Age : "+a2.getAge()+ " Tech : "+a2.getTech());

        // DELETE a record

        Alien a2 = session.get(Alien.class, 104);

        session.remove(a2);

        transaction.commit();

        session.close();
        factory.close();
    }
}
