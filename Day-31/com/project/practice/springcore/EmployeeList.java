package com.project.practice.springcore;

import java.util.List;

public class EmployeeList {
	private List<Employee> employeeList;

	@Override
	public String toString() {
		return "EmployeeList [employeeList=" + employeeList + "]";
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public EmployeeList(List<Employee> employeeList) {
		super();
		this.employeeList = employeeList;
	}

	public EmployeeList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
