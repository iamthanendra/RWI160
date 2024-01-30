package com.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.implementation.UserServicesImp;

import jakarta.servlet.http.HttpSession;

@RestController
public class LogoutController {
	@Autowired
	UserServicesImp userServicesImp;
	
	@GetMapping("/logout")
	public ResponseEntity<String> logoutUser(HttpSession session)
	{
		try {
			System.out.println(session);
			System.out.println(session.getAttribute("user"));
			
			session.removeAttribute("user");
			return new ResponseEntity<>("Log out", HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<>("Some Error Occurs", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
