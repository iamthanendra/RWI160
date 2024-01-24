package com.test.controller;

public class User {
	private String name, email, password, mobileno;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	


	public User(String name, String email, String password, String mobileno) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", mobileno=" + mobileno + "]";
	}
	
	
}
