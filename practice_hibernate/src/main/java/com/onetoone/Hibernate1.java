package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate1 {
	
	public static void main(String[] args) {
		
		
		Configuration con=new Configuration();
		con.configure();
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t1=s.beginTransaction();
		
		BankAccount b1=new BankAccount(101, 1234567890);
		BankAccount b2=new BankAccount(102, 1234567891);
		
		Employee e1=new Employee(1, "shekhar", "shekhar@gmail.com", b1);
		Employee e2=new Employee(2, "niket", "niket@gmail.com", b2);
		
		s.save(b1);
		s.save(b2);
		s.save(e1);
		s.save(e2);
		
		t1.commit();
	}

}
