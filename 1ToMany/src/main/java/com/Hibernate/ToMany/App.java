package com.Hibernate.ToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration config = new Configuration();
       config.configure("hibernate.cfg.xml");
       
       SessionFactory factory = config.buildSessionFactory();
       
       Session session = factory.openSession();
       
      
//       Questions q = new Questions();
//       q.setQuestion_id(1);
//       q.setQuestion("What is your name?");
//       
//       Answers ans1 = new Answers();
//       ans1.setAnswer_id(1);
//       ans1.setAnswer("My name is Hassam");
//       ans1.setQuestions(q);
//       
//       Answers ans2 = new Answers();
//       ans2.setAnswer_id(2);
//       ans2.setAnswer("My name is Hassam Khan");
//       ans2.setQuestions(q);
//       
//       List<Answers> answerList = new ArrayList<>();
//       answerList.add(ans1);
//       answerList.add(ans2);
//       
//       q.setAnswers(answerList);
//       
//      org.hibernate.Transaction t = session.beginTransaction();
//      
//      session.save(q);
//      session.save(ans1);
//      session.save(ans2);
//      
//      t.commit();
       
//      Questions questions =(Questions)session.get(Questions.class,1);
//      System.out.println(questions.getQuestion());
//      for(Answers x:questions.getAnswers())
//      {
//    	  System.out.println(x.getAnswer());
//      }
       
       
       Answers ansOut =(Answers)session.get(Answers.class, 1);
       System.out.println("========================================");
       System.out.println(ansOut.getQuestions().getQuestion());
    	   
      session.close();
      
      
      
      
       
       
       
       
       
       
    }
}
