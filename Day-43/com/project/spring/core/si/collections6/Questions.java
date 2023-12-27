package com.project.spring.core.si.collections6;

import java.util.Map;

public class Questions {
	private int id;
	private String name;
	private Map<Answer,User> answers;
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
	public Map<Answer, User> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Answer, User> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Questions [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
}
