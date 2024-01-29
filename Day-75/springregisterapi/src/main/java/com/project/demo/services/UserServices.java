package com.project.demo.services;

import org.springframework.stereotype.Service;

import com.project.demo.entity.User;

public interface UserServices {
    public void userRegister(User user);
    public boolean isUserExist(String email, String password);
}
