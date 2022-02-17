package com.ait;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Student ob=(Student) ctx.getBean("s1");
		System.out.println(ob);
		
		//Student ob2=(Student) ctx.getBean("s2");
		//System.out.println(ob2);
		

	}

}
