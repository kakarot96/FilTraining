package com.fil.inheritance;

import javax.persistence.Entity;

@Entity
public class RegularUser extends User {

	
	private int monthlyFee;
	
	public RegularUser(){}
	public RegularUser(int userid, int monthlyFee) {
		super(userid);
		this.monthlyFee = monthlyFee;
	}
	
	

	public int getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(int monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	
	
}
