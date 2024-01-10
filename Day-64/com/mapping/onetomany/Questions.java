package com.mapping.onetomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Questions {

	@Id
	@GeneratedValue
	private int id;
	private String qname;
	@OneToMany
	private List<Answers> answers;
	
}
