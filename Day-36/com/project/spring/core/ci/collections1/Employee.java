package com.project.spring.core.ci.collections1;

import java.util.List;

public class Employee {
	private String name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	private List<Address> contactno;
	public Employee(String name, List<Address> contactno) {
		super();
		this.name = name;
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return String.format("Employee [name=%s, contactno=%s]", name, contactno);
	}
	
}
