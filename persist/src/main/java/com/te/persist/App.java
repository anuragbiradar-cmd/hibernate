package com.te.persist;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	Laptop laptop = new Laptop();
    	laptop.setLaptopName("hp");
    	laptop.setLid(2);
    	
    	Laptop laptop2 = new Laptop();
    	laptop2.setLid(3);
    	laptop2.setLaptopName("dell");
    	
    	ArrayList<Laptop> lapList = new ArrayList<Laptop>();
    	lapList.add(laptop);
    	lapList.add(laptop2);
    	StudentName stud=new StudentName();
    	stud.setFirstName("ramesh");
    	stud.setMiddleName("bapu");
    	stud.setLasName("bodke");
    	Student student = new Student();
    	student.setName(stud);
    	student.setPhone("12345678");
    	student.setRoll(2);
    	student.setLaptop(lapList);
    	
    	
    	laptop.setStud(student);
    	laptop2.setStud(student);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
//       Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
//       SessionFactory sf = con.buildSessionFactory();
//       Session session = sf.openSession();
//       Transaction tx = session.beginTransaction();
//       session.save(student);
//       tx.commit();
//    	Configuration a = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//    	SessionFactory sf = a.buildSessionFactory();
//    	Session openSession = sf.openSession();
//    	Transaction tx = openSession.getTransaction();
//    	tx.begin();
  // Object student2=  (Student)openSession.get(Student.class,2);
//    	openSession.save(laptop);
//    	openSession.save(laptop2);
//    	openSession.save(student);
  //  	System.out.println(((Student) student2).getName());
    	
//   	Student student2 = openSession.get(Student.class, 2);
//    	tx.commit();
//   	System.out.println(student2);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	Query q1 = session.createQuery("from Student");
    	tx.commit();
    	List<Student> list = q1.list();
    	for(Student l: list) {
    		System.out.println(l);
    	}
    	
    	
    	
    
    }
}
