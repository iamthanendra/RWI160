package com.mapping.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Emp {

	@Id @GeneratedValue
	private int id;
	private String empName;
	
	@ManyToMany
//	@JoinTable(name="emp_learn", joinColumns= { @JoinColumn(name="eid") }
//	, inverseJoinColumns = { @JoinColumn(name="pid")})
	List<Projects> assignedProject;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int id, String empName, List<Projects> assignedProject) {
		super();
		this.id = id;
		this.empName = empName;
		this.assignedProject = assignedProject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Projects> getAssignedProject() {
		return assignedProject;
	}

	public void setAssignedProject(List<Projects> assignedProject) {
		this.assignedProject = assignedProject;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", empName=" + empName + ", assignedProject=" + assignedProject + "]";
	}
	
	
}
