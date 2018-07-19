package com.fil.supply;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Quote {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int qid;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="sid")
	private Supplier supplier;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="rid")
	private Requirement requirement;

	private double price;

	
	public Quote(){}


	public Quote(int qid, Supplier supplier, Requirement requirement, double price) {
		super();
		this.qid = qid;
		this.supplier = supplier;
		this.requirement = requirement;
		this.price = price;
	}
	public Quote(Supplier supplier,Requirement requirement,double price){
		this.supplier=supplier;
		this.requirement=requirement;
		this.price=price;
	}

	public int getQid() {
		return qid;
	}


	public void setQid(int qid) {
		this.qid = qid;
	}


	public Supplier getSupplier() {
		return supplier;
	}


	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}


	public Requirement getRequirement() {
		return requirement;
	}


	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String toString(){
		return qid+":"+supplier.getSid()+":"+requirement.getRid()+":"+price;
	}
}
