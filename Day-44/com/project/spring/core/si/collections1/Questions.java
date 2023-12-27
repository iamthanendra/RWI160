package com.project.spring.core.si.collections1;

import java.util.List;
import java.util.Iterator;

public class Questions {

	private int id;
	private String name;
	private List<String> answers;
	
	public Questions() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
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
