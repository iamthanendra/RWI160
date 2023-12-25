package com.project.spring.core.si.collections2;

import java.util.List;
import java.util.Iterator;

public class Questions {

	private int id;
	private String name;
	private List<Answers> answers;
	
	public Questions() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	@Override
	public String toString() {
		StringBuilder returnTemplate = new StringBuilder();
		returnTemplate.append(this.id+"  "+this.name+"\nAnswers are :\n");
		
		Iterator itr = answers.iterator();
		while(itr.hasNext())
		{
			returnTemplate.append(itr.next()+"\n");
		}
		
		return returnTemplate.toString();
	}

}
