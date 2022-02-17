package com.tqpp.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	
	@Id
	private int sid;
	private String sname;
	private int persent;
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
	public int getPersent() {
		return persent;
	}
	public void setPersent(int persent) {
		this.persent = persent;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String city;
	public Student(int sid, String sname, int persent, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.persent = persent;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
