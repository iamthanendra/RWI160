package com.authentication.services;

import org.springframework.http.ResponseEntity;

import com.authentication.model.User;

import jakarta.servlet.http.HttpSession;

public interface UserServices {
	public ResponseEntity<String> registerUser(User user);
	public ResponseEntity<String> loginUser(User user, HttpSession session);
	public ResponseEntity<String> logoutUser(HttpSession session);
}
