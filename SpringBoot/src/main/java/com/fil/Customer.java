package com.fil;

public class Customer {
	public String firstname;
	public String lastname;
	
	public Customer(){}
	public Customer(String aID, String name) {
		super();
		this.firstname = aID;
		this.lastname = name;
	}
	public String getAID() {
		return firstname;
	}
	public void setAID(String aID) {
		this.firstname = aID;
	}
	public String getName() {
		return lastname;
	}
	public void setName(String name) {
		this.lastname = name;
	}

}
