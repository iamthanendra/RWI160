package com.reference;

public class Teacher {
	private String teacherName;
	private String email;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", email=" + email + "]";
	}
	
}
