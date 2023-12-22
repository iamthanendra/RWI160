package com.project.spring.core.ci.collections2;

import java.util.Map;

public class Employee {
	private int id;
	private String name;
	private Map<Year, Post> experience;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Map<Year, Post> experience) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", experience=")
				.append(experience).append("]");
		return builder.toString();
	} 
}
