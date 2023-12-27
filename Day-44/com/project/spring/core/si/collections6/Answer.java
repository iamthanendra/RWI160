package com.project.spring.core.si.collections6;

import java.util.Date;

public class Answer {
	private int id;
	private String answer;
	private Date postalDate;
	
	public Date getPostalDate() {
		return postalDate;
	}
	public void setPostalDate(Date postalDate) {
		this.postalDate = postalDate;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", postalDate=" + postalDate + "]";
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
