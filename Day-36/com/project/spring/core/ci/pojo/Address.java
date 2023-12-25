package com.project.spring.core.ci.pojo;

public class Address {
	private String street;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return String.format("Address [street=%s, city=%s]", street, city);
	}
}