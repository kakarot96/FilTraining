package com.fil.supply;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="supply")
public class Supply{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int supid;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="sid")
	private Supplier supplier;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="pid")
	private Part part;
	
	@Column
	private int qty;
	@Column
	private Date supdate;
	
	public Supply(){}

	public Supply(int supid, Supplier supplier, Part part, int qty, Date supdate) {
		super();
		this.supid = supid;
		this.supplier = supplier;
		this.part = part;
		this.qty = qty;
		this.supdate = supdate;
	}

	public Supply(Supplier supplier, Part part, int qty, Date supdate) {
		super();
		this.supplier = supplier;
		this.part = part;
		this.qty = qty;
		this.supdate = supdate;
	}

	public int getSupid() {
		return supid;
	}

	public void setSupid(int supid) {
		this.supid = supid;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
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

	public Date getSupdate() {
		return supdate;
	}

	public void setSupdate(Date supdate) {
		this.supdate = supdate;
	}
	
	
	
	public String toString(){
		return supid+":"+supplier.getSid()+":"+part.getPid()+":"+qty+":"+supdate;
	}
}
