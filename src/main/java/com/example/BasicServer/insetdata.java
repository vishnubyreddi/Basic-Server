package com.example.BasicServer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import entites.Login;

public class insetdata {

    public static void main(String[] args) {

        // Initialize the SessionFactory using the HibernateUtil class
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Login login = new Login();
        login.setId(1);
        login.setUsername("Vishnu");
        login.setPassword("Vishnu@123");
        session.save(login);

        transaction.commit();
        session.close();
    }
}