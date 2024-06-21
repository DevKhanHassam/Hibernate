package com.ORM.Hibernate;

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
    	
    	Configuration config  = new Configuration();
    	config.configure("hibernate.cfg.xml");
    	SessionFactory sessionFactory = config.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
//        Student obj = new Student();
//        
//        obj.setRollNo(31);
//        obj.setStudentName("fem");
//        obj.setStudentAddress("Thuringen");
//        
//        Transaction trans = session.beginTransaction();
//        session.save(obj);
//       trans.commit();
//        
    	
    	
//    	Student student1 = session.get(Student.class,32);  //get and load do same
    	Student student2 = session.load(Student.class,32);
    	System.out.println(student2);
    	session.close();
    }
}
