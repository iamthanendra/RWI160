package com.project.spring.core.si.collections4;

import java.util.Map;

public class Questions {
	private int id;
	private String name;
	private Map<String, String> answers;
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
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Questions [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}
}
