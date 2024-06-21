package com.Hibernate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration config = new  Configuration();
       config.configure("hibernate.cfg.xml");
       
       SessionFactory factory = config.buildSessionFactory();
       
       Session session = factory.openSession();
       
       
       Employees emp1= new Employees();
       emp1.setEmployeId(11);
       emp1.setEmpName("Reiner");
       
       
       Employees emp2= new Employees();
       emp2.setEmployeId(22);
       emp2.setEmpName("Sabina");
       
       
       
       Projects p1 = new Projects();
       p1.setProjectId(1);
       p1.setProjectName("Fix the light");
       
       List<Employees> empList = new ArrayList<>();
       
       empList.add(emp1);
       empList.add(emp2);
       
       p1.setEmployeesList(empList);
       
       
       
       Projects p2 = new Projects();
       p2.setProjectId(2);
       p2.setProjectName("Manage housing");
       p2.setEmployeesList(empList);
       
       
       
       List<Projects> projectList = new ArrayList();
       projectList.add(p1);
       projectList.add(p2);
       
       emp1.setProjects(projectList);
       emp2.setProjects(projectList);
       
       Transaction trans = session.beginTransaction();
       session.save(emp1);
       session.save(emp2);
       
       session.save(p1);
       session.save(p2);
       
       trans.commit();
       session.close();
       
       
    }
}
