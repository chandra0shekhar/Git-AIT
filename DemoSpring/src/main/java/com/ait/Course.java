package com.ait;

import org.springframework.stereotype.Component;

@Component
public class Course {
	
	private String coursename;
	private int fees;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String coursename, int fees) {
		super();
		this.coursename = coursename;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [coursename=" + coursename + ", fees=" + fees + "]";
	}
	

}
