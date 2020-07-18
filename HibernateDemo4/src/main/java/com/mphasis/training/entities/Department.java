package com.mphasis.training.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int dcode;
	
	@Column(length=12)
	private String dname;
	
	@ManyToOne
	@JoinColumn(name="lcode")
	private Location loc=new Location();
	
	@OneToMany(mappedBy="dep",fetch=FetchType.EAGER)
	private List<Employee> emps=new ArrayList<>();
	
	

	public int getDcode() {
		return dcode;
	}

	public void setDcode(int dcode) {
		this.dcode = dcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}


}
