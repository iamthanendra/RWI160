package com.authentication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/track-session")
public class TrackSession {
	
	
	
	@PostMapping
	public ResponseEntity<String> trackSession(HttpSession session)
	{
		if(session.getAttribute("user") == null)
		{
			return new ResponseEntity<String>("You need to login again", HttpStatus.UNAUTHORIZED);
		}
		else
		{
			return new ResponseEntity<String>("You are autherized", HttpStatus.OK);
		}
	}
	
	@GetMapping
	public ResponseEntity<String> trackSession1(HttpSession session)
	{
		return trackSession(session);
	}
}
