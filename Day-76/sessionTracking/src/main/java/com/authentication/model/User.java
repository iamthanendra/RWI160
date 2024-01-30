package com.authentication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class User {

	@Id
	private String email;
	private String name, password;
	
	@Transient
	private String confirmpassword;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String email, String name, String password, String confirmpassword) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmPassword) {
		this.confirmpassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", password=" + password + ", confirmPassword="
				+ confirmpassword + "]";
	}
	
}
