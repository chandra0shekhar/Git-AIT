package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empname;
	private String emailid;
	
	@OneToOne
	private BankAccount bankaccount;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public BankAccount getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}
	public Employee(int empid, String empname, String emailid, BankAccount bankaccount) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emailid = emailid;
		this.bankaccount = bankaccount;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", emailid=" + emailid + ", bankaccount="
				+ bankaccount + "]";
	}
	
	
	

}
