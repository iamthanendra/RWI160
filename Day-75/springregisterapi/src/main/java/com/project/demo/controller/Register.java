package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entity.User;
import com.project.demo.repository.UserRepository;
import com.project.demo.services.UserServices;
import com.project.demo.services.UserServicesImp;



@RestController
public class Register {
	@Autowired
	UserServicesImp userServicesImp;
	
	@PostMapping("/register")
	public User doRegisUser(@RequestBody @ModelAttribute User user)
	{
		System.out.println(user);
		userServicesImp.userRegister(user);
		
		return user;
	}
}
