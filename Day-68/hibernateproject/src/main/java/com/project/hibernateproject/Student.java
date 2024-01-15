package com.project.hibernateproject;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int studentRollNo;
	private String studentName;
	private int studentAge;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="courseId")  
////	private List<Course> registeredCourse;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentRollNo, String studentName, int studentAge) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentRollNo=" + studentRollNo + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ "]";
	}




	
}
