package com.reference;

public class Student {
	private String studentName;
	private String address;
	private Teacher mentor;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Teacher getMentor() {
		return mentor;
	}
	public void setMentor(Teacher mentor) {
		this.mentor = mentor;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", address=" + address + ", mentor=" + mentor + "]";
	}
	
}
