package com.model;

import java.sql.Date;

public class Student {
	private int sid;
	private String sname;
	private int persent;
	private Date birthdate;
	private String city;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student( int sid2, String nm, int percent, String city) {
		super();
		this.sid=sid2;
		this.sname = nm;
		this.persent = percent;
		
		this.city = city;
	}
	public Student(int sid, String sname, int persent, Date birthdate, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.persent = persent;
		this.birthdate = birthdate;
		this.city = city;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int i) {
		this.sid = i;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPersent() {
		return persent;
	}
	public void setPersent(int persent) {
		this.persent = persent;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", persent=" + persent + ", birthdate=" + birthdate
				+ ", city=" + city + "]";
	}

	public void setSid(String string) {
		// TODO Auto-generated method stub
		
	}
}
