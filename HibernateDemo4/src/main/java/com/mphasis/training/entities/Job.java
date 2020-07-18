package com.mphasis.training.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Job {
	@Id
	private int jcode;
	
	private String jname;
	
	@OneToMany(mappedBy="jobs",fetch=FetchType.EAGER)
	private List <Employee> employee=new ArrayList<>();

	public int getJcode() {
		return jcode;
	}

	public void setJcode(int jcode) {
		this.jcode = jcode;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	

}
