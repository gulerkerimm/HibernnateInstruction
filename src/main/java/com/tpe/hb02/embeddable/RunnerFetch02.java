package com.tpe.hb02.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch02 {
    public static void main(String[] args) {

        Configuration config=new Configuration().configure().addAnnotatedClass(com.tpe.hb02.embeddable.Student02.class);
        SessionFactory sf=config.buildSessionFactory();
        Session session =sf.openSession();

        //id:1002 olan ögrencinin tüm bilgilerini görelim

         com.tpe.hb02.embeddable.Student02 student=session.get(com.tpe.hb02.embeddable.Student02.class,1002);
        System.out.println(student);

        //öğrencinin adresini görelim
        System.out.println(student.getAddress());


        session.close();
        sf.close();





    }
}