package com.project.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Register {
	
	@PostMapping("/register")
	public User doRegisUser(@RequestBody @ModelAttribute User user)
	{
		System.out.println(user);
		return user;
	}
}
