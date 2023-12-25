package com.project.spring.core.ci.collections1;

public class Address {
	private String no;

	@Override
	public String toString() {
		return String.format("Address [no=%s]", no);
	}

	public Address(String no) {
		super();
		this.no = no;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}
