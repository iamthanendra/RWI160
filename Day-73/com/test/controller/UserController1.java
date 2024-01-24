package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController1 {

	@PostMapping("/userReg")
//	public void doRegister(HttpServletRequest request)
//	public void doRegister(String name, String mobile, String password, String email)
	public String doRegister(@RequestParam("name") String fullName, @RequestParam("mobile") String mobileNo, @RequestParam("password") String userPassword, @RequestParam("email") String userEmail, Model map)
	{
		//request.getParameter();
		
		map.addAttribute("name", fullName);
		map.addAttribute("mobile", mobileNo);
		map.addAttribute("password", userPassword);
		map.addAttribute("email", userEmail);
		
		return "index";
	}
	

	//http://localhost:8081/get/ram
	//http://localhost:8081/get/1
	//http://localhost:8081/get/id
	@GetMapping("/get/{id}/{name}")
//	public String getUser(@PathVariable("id") int id, @PathVariable("name") String name, Model map)
	public String getUser(@PathVariable int id, @PathVariable String name, Model map)
	{
		map.addAttribute("id", id);
		map.addAttribute("name", name);
		return "index";
	}
}
