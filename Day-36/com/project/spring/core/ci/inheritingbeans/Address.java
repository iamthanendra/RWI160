package com.project.spring.core.ci.inheritingbeans;

public class Address {
	private String addressLine,city,state,country;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String addressLine, String city, String state, String country) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	
}
