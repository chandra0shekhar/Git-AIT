package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount {
	
	@Id
	private int accountid;
	private long accountnumber;
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public BankAccount(int accountid, long accountnumber) {
		super();
		this.accountid = accountid;
		this.accountnumber = accountnumber;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BankAccount [accountid=" + accountid + ", accountnumber=" + accountnumber + "]";
	}
	
	
	

}
