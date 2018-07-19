package com.fil.supply;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Requirement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rid;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="pid")
	private Part part;
	private int qty;
	private String status;
	
	public Requirement(){}
	

	public Requirement(int rid, Part part, int qty, String status) {
		super();
		this.rid = rid;
		this.part = part;
		this.qty = qty;
		this.status = status;
	}
	public Requirement(Part part,int qty){
		this.part=part;
		this.qty=qty;
		this.status="notfulfilled";
	}


	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
