package com.fil.supply;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="supplier")

public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	
	
	@Column
	private String sname;
	
	@Column
	private String city;
	@Column
	private Date date;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="sid")
	private List<Supply> supplies;
	
	
	private double rating;
	

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Supplier(){}
	
	public Supplier(int sid, String sname, String city, Date date) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.date = date;
	}
	public Supplier(String sname, String city, Date date) {
		// TODO Auto-generated constructor stub
		super();
		this.sname = sname;
		this.city = city;
		this.date = date;
	}

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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	 public String toString(){
		 return sid+":"+sname+":"+city+":"+rating;
	 }
	 public List<Supply> getSupplies() {
			return supplies;
		}

		public void setSupplies(List<Supply> supplies) {
			this.supplies = supplies;
		}
	
}
