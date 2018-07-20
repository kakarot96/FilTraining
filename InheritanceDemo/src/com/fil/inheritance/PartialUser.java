package com.fil.inheritance;

import javax.persistence.Entity;

@Entity
public class PartialUser extends User {

	private int hourlyFee;

	
	public PartialUser(){}
	public PartialUser(int userid, int hourlyFee) {
		super(userid);
		this.hourlyFee = hourlyFee;
	}



	public int getHourlyFee() {
		return hourlyFee;
	}



	public void setHourlyFee(int hourlyFee) {
		this.hourlyFee = hourlyFee;
	}

	
	
}
