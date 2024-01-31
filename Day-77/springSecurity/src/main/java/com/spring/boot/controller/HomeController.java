package com.spring.boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	
	@PreAuthorize("hasRole('NORMAL')") // @EnableMethodSecurity(prePostEnabled = true) with SecurityConfig
	@GetMapping("/normal")
	public ResponseEntity<String> normalUser()
	{
		return new ResponseEntity<String>("Yes, I'm normal User", HttpStatus.OK);
	}

	@GetMapping("/public") 
	public ResponseEntity<String> publicUser()
	{
		return new ResponseEntity<String>("Yes, I'm public User", HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')") // @EnableMethodSecurity(prePostEnabled = true) with SecurityConfig
	@GetMapping("/admin")
	public ResponseEntity<String> adminUser()
	{
		return new ResponseEntity<String>("Yes, I'm <b>Admin</b>", HttpStatus.OK);
	}
}
