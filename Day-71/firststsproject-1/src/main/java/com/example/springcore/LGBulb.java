package com.example.springcore;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "lg")
public class LGBulb implements Bulb{

	@Override
	public String getBulb() {
		return "LGBulb";
		
	}
}
