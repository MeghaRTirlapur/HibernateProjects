package com.mphasis.training.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int eid;

	@Column(length=12)
	private String ename;
	private Date doj;
	private double salary;
	private int bonus;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="mgrno")
	//private Employee mgrno;
	private Employee manager;
	@OneToMany(mappedBy = "manager")
	private Set<Employee> admin=new HashSet<Employee>();
	
	@ManyToOne
	@JoinColumn(name="jcode")
	private Job jobs =new Job();
	
	
	
	@ManyToOne
	@JoinColumn(name="dcode")
	private Department dep =new Department();



	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public Date getDoj() {
		return doj;
	}



	public void setDoj(Date doj) {
		this.doj = doj;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getBonus() {
		return bonus;
	}



	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

	public Employee getManager() {
		return manager;
	}



	public void setManager(Employee manager) {
		this.manager = manager;
	}



	public Job getJobs() {
		return jobs;
	}



	public void setJobs(Job jobs) {
		this.jobs = jobs;
	}



	public Department getDep() {
		return dep;
	}



	public void setDep(Department dep) {
		this.dep = dep;
	}
	
	
	
	

}
