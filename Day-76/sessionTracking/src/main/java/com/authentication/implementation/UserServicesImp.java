package com.authentication.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.authentication.model.User;
import com.authentication.repo.UserRepository;
import com.authentication.services.UserServices;

import jakarta.servlet.http.HttpSession;

@Service
public class UserServicesImp implements UserServices{
	
	@Autowired
	UserRepository userRepository;
	
	public ResponseEntity<String> registerUser(User user)
	{
		try {
			
			//Checking Password and confirm password is same or not
			if(!user.getPassword().equals(user.getConfirmpassword()))
			{
				return new ResponseEntity<>("Password & Confirm Password is not Same", HttpStatus.BAD_REQUEST);
			}
			
			//checking user is already registed or not
			if(userRepository.getById(user.getEmail()) == null)
			{
				return new ResponseEntity<>("User Already Registereds", HttpStatus.INTERNAL_SERVER_ERROR);
			}
				
			if(userRepository.save(user) != null)
			{
				return new ResponseEntity<>("Your Id Created Successfull", HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<>("Some Error Occurs", HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<>("User Already Registereds", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	public ResponseEntity<String> loginUser(User user, HttpSession session)
	{
		try {
			User existingUser = userRepository.getOne(user.getEmail());
			
			//checking user exists or not
			if(existingUser == null)
			{
				return new ResponseEntity<>("User is not registered", HttpStatus.BAD_REQUEST);
			}
			
			//Checking email and password 
			if(existingUser.getEmail().equals(user.getEmail()) && existingUser.getPassword().equals(user.getPassword()))
			{
				session.setAttribute("user", existingUser);
				return new ResponseEntity<>("Succesfully Login" , HttpStatus.OK);
			}
			else
			{
				// response status 401
				return new ResponseEntity<>("Id or password may be wrong", HttpStatus.UNAUTHORIZED);
			}
		}
		catch(Exception e)
		{
			return new ResponseEntity<>("User is not registered", HttpStatus.BAD_REQUEST);
		}
		
	}
	public ResponseEntity<String> logoutUser( HttpSession session)
	{
		return null;
	}

}
