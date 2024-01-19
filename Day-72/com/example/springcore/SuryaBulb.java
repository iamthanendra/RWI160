package com.example.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("su")
public class SuryaBulb implements  Bulb{

	@Override
	public String getBulb() {
		// TODO Auto-generated method stub
		return "SuryaBulb";
	}
	
}
