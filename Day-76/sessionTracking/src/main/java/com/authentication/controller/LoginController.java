package com.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.implementation.UserServicesImp;
import com.authentication.model.User;

import jakarta.servlet.http.HttpSession;

@RestController
public class LoginController {
	@Autowired
	UserServicesImp userServicesImp;
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody User user, HttpSession session)
	{
		return userServicesImp.loginUser(user , session);
	}
}
