package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

//@RestController = @Controller + @ResponseBody
//will create controller class and all method response in form of json

@Controller
public class UserController2 {
	
	@PostMapping("/storeData")
	public String doRegister(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam String mobile,
			@RequestParam String password, Model model
			)
	{
		User user = new User(name, email, password, mobile);
		
		model.addAttribute("user",user);
		
		return "index";
	}
	
	@ModelAttribute
	public void commanMsg(Model model)
	{
		model.addAttribute("msg", "Data Added");
		model.addAttribute("title", "Welcome");
		System.out.println("Comman Attribute");
	}
	
	@PostMapping("/storeData1")
	public String doRegister1(@ModelAttribute User user, Model model) //autowired 
	//reference should be same as class name in pascalcase
//	public String doRegister1(@ModelAttribute("userObj") User user)
	{
		
		return "index";
	}
	
	@ResponseBody //send data in form JSON
	@PostMapping("/getUserData1")
	//@RequestBody is user to take Data in form of JSON
	public User showUser(@RequestBody @ModelAttribute User user)
	{
		System.out.println("User Received...");
		System.out.println(user);
		
		return user;
	}

}