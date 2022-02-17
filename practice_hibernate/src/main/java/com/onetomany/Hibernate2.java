package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate2 {

	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t1=s.beginTransaction();
		
		Department d1=new Department(1,"entc");
		Department d2=new Department(2,"civil");
		
		s.save(d1);
		s.save(d2);
		
		Student s1=new Student(11,"om",78,d1);
		Student s2=new Student(12,"yash",85,d1);
		Student s3=new Student(13,"ria",96,d1);
		
		s.save(s1);
		s.save(s2);
		s.save(s3);
		
		List<Student> al1=new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		
		Student s4=new Student(11,"jay",74,d2);
		Student s5=new Student(11,"rani",88,d2);
		Student s6=new Student(11,"puja",58,d2);
		
		s.save(s4);
		s.save(s5);
		s.save(s6);
		
		List<Student> al2=new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		
		
		
		
		t1.commit();
		
		

	}

}
