package com.mapping.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Answers {
	
	@Id
	@GeneratedValue
	private int id;
	private String answerName;
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	
	

}
