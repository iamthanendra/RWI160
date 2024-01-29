package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entity.User;
import com.project.demo.services.UserServicesImp;

@RestController
public class UserLoginController {

    @Autowired
    private UserServicesImp userServicesImp;

    @PostMapping("/login") // Specify a more descriptive endpoint path
    public ResponseEntity<String> isAuthorized(@RequestBody @ModelAttribute User user) {
        // Check if the user exists by email
        if (userServicesImp.isUserExist(user.getUserEmail(), user.getUserPassword())) {
        	System.out.print("Authenticated");
        	return ResponseEntity.ok("Authentication successful");
        } else {
            // Perform additional authentication logic if needed
        	System.out.print("Not Found");
        	return ResponseEntity.notFound().build();
            // Return a success response
        }
    }
    
//    @PostMapping("/login") 
//    public String isAuthorized(@RequestBody User user)
//    {
//    	if (!userServicesImp.isUserExist(user.getUserEmail(), user.getUserPassword())) {
//          return "false";
//      } else {
//          // Perform additional authentication logic if needed
//
//          // Return a success response
//          return "true";
//      }
//    }
}
