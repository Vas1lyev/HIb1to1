package ru.vasilyev.springcourse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.vasilyev.springcourse.model.Director;
import ru.vasilyev.springcourse.model.School;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Configuration cfg = new Configuration()
                .addAnnotatedClass(Director.class)
                .addAnnotatedClass(School.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        try {
            session.beginTransaction();

            // First exercise
//            School school = session.get(School.class, 1);
//            System.out.println(school.getDirector());
//
//            Director director = session.get(Director.class, 3);
//            System.out.println(director.getSchool());

            // Second exercise

//            Director director = new Director("test director", 55);
//            School school = new School("Test school");
//            director.setSchool(school);
//            session.save(director);

            // Third exercise
//            Director director = new Director("Another director", 66);
//            School school = session.get(School.class, 6);
//
//            session.save(director);
//            school.setDirector(director);

            // Fourth exercise

//            School school = session.get(School.class, 6);
//            Director director = session.get(Director.class, 1);
//
//            director.setSchool(school);

            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }
}
