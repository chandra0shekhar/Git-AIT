package com.ait;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Student implements InitializingBean,DisposableBean{
	private int sid;
	private String sname;
	private int percent;
	@Autowired
	private Course course;
	
	public Student(int sid, String sname, int percent, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.course = course;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public Student(int sid, String sname, int percent) {
		super();
		System.out.println("in parameterised constructor");
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
	}
	public Student() {
		
		super();
		System.out.println("in default constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", course=" + course + "]";
	}
	public void destroy() throws Exception {
		System.out.println("in destroy methode");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("in ater properties methode");
		
	}
	
	
	

}
