package com.test.controller;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	@Autowired
	JdbcTemplate jdbc;

	@RequestMapping(value="/login", method = RequestMethod.POST)
//	@PostMapping(value = "/login")
//	public ModelAndView doLogin(String email, String password)
	public ModelAndView doLogin(HttpServletRequest req, HttpServletResponse res, HttpSession session)
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		System.out.println("Logged In");
//		return "index";
		
//		ModelAndView modelandview = new ModelAndView("index");
//		modelandview.addObject("email", email);
//		modelandview.addObject("password", password);
		
		ModelAndView modelandview = new ModelAndView("index");
		User user = new User(email, password);
		modelandview.addObject("user", user);
		
		return modelandview;
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
//	@GetMapping(value="/register")
	public ModelAndView doRegister(HttpServletRequest req, HttpServletResponse res, HttpSession session)
	{
		//create table user (name varchar2(10), email varchar2(20), password varchar2(20), mobileno varchar2(20));
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String password = req.getParameter("password");
		
		ModelAndView modelandview = new ModelAndView("index");
//		modelandview.addObject("user", user);
		
		//jdbc.execute("insert into user values ('"+name+"', '"+email+"', '"+mobile+"', '"+password+"')");
		
		String query = "insert into user values (?, ?, ?, ?)";
		
		boolean flag = jdbc.execute(query, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, mobile);
				ps.setString(4, password);
				
				return ps.execute();
			}
		});
		
		session.setAttribute("msg", "Data Added Successfully");
		
		return modelandview;
	}
}