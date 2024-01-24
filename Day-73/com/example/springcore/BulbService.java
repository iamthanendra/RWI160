package com.example.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BulbService {
	@Autowired
	@Qualifier("su")
	Bulb bulb;
	
	public String getBulb()
	{
		return bulb.getBulb();
	}
}