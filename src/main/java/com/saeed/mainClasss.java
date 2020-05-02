package com.saeed;

import com.saeed.dao.DAO.UserSignUpImplDAO;
import com.saeed.model.SignUp;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mainClasss {

    public static void main(String[] args) {

        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();*/

        /*SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .buildSessionFactory();

        SignUp signUp = new SignUp();

        Transaction transaction = null;
        Session session = sessionFactory.getCurrentSession();
        transaction = session.beginTransaction();
        session.save(signUp);
        transaction.commit();*/

        SessionFactory sessionFactory = new Configuration()
                .configure("WEB-INF/hibernate.cfg.xml")
                .addAnnotatedClass(SignUp.class)
                .addAnnotatedClass(UserSignUpImplDAO.class)
                .addAnnotatedClass(SignUpBean.class)
                .buildSessionFactory();


    }

}
