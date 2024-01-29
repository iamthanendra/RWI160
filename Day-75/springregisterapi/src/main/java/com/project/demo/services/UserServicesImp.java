package com.project.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entity.User;
import com.project.demo.repository.UserRepository;
//import com.project.demo.services.UserServicesImp;


@Service
public class UserServicesImp {

    @Autowired
    private UserRepository userRepository;
    
    public void userRegister(User user)
    {
    	userRepository.save(user);
    }

    public boolean isUserExist(String email, String password) {
    	try {

        	if(userRepository.getById(email.trim()) == null ) return false;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    	
    	User user = (User)userRepository.getById(email.trim());

    	if(user.getUserEmail() == email.trim() && user.getUserPassword() == password.trim()) return true;
    	else return false;
    	
    }
    
    
}