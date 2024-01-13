package com.mapping.manytomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Projects {
	@Id @GeneratedValue
	private int id;
	private String projectName;
	
	@ManyToMany
	List<Emp> workingEmployee;

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projects(int id, String projectName, List<Emp> workingEmployee) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.workingEmployee = workingEmployee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getWorkingEmployee() {
		return workingEmployee;
	}

	public void setWorkingEmployee(List<Emp> workingEmployee) {
		this.workingEmployee = workingEmployee;
	}

	@Override
	public String toString() {
		return "Projects [id=" + id + ", projectName=" + projectName + ", workingEmployee=" + workingEmployee + "]";
	}
}
