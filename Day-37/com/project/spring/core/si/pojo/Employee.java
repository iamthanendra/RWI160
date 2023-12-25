package com.project.spring.core.si.pojo;

public class Employee implements Person{
	private String empName;
	private String empId;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}
	
}
