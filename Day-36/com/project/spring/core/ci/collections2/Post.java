package com.project.spring.core.ci.collections2;

public class Post {
	private String desination;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(String desination) {
		super();
		this.desination = desination;
	}

	@Override
	public String toString() {
		return String.format("Post [desination=%s]", desination);
	}
}
