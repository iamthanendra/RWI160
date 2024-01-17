package com.project.spring.core.ci.pojo;

public class Employee {
	private int id;
	private String name;
	private Address Address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}


	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, Address=%s]", id, name, Address);
	}
}
