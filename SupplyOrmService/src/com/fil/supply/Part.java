package com.fil.supply;

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
@Table(name="part")
public class Part {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	@Column
	private String pname;
	@Column
	private String color;
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="pid")
	private List<Supply> supplies;
	
	public List<Supply> getSupplies() {
		return supplies;
	}

	public void setSupplies(List<Supply> supplies) {
		this.supplies = supplies;
	}

	public Part(){}
	
	public Part(String pname, String color) {
		super();
		this.pname = pname;
		this.color = color;
	}
	public Part(int pid, String pname, String color) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.color = color;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
}
