package com.project.spring.core.si.collections3;

public class Answers {
	private int id;
	private String name;
	private String by;

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

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public Answers() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Answers [id=" + id + ", name=" + name + ", by=" + by + "]";
	}

}
