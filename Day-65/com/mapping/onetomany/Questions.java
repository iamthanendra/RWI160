package com.mapping.onetomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Questions {

	@Id
	@GeneratedValue
	private int id;
	private String qname;
	@OneToMany //will create new table for questions and answers
	@JoinColumn(name="qid") //will add new column as qid in Question Table  
	private List<Answers> answers;
	
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	// Automatic Generated
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	
}
