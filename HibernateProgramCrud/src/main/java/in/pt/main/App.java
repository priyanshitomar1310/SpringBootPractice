package in.pt.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.pt.entities.User;

public class App {

    public static void main(String[] args) {

        User user = new User();

        user.setUserId(102);
        user.setAge(25);
        user.setName("Himanshi Tomar");
        user.setEmailId("himanshitomar1709@gmail.com");
        user.setPassword("Panno@1709");

        Configuration cfg = new Configuration();
        cfg.configure("in/pt/config/hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        // INSERT OPERATION
        try {

            session.save(user);
            transaction.commit();

            System.out.println("Data inserted successfully");

        } catch (Exception e) {

            transaction.rollback();
            e.printStackTrace();

            System.out.println("Error Occurred");
        }

        session.close();
        sessionFactory.close();
    }
}