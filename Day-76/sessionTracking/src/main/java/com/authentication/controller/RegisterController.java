package com.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.implementation.UserServicesImp;
import com.authentication.model.User;

@RestController
public class RegisterController {
	
	@Autowired
	UserServicesImp userServicesImp;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user)
	{
		return userServicesImp.registerUser(user);
	}
}
