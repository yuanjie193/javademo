package com.controller;

import com.service.UserService;
import com.service.UserServiceImpl;

public class UserController {
    UserService us = new UserServiceImpl();
    public  int register(String username,String password){
        int i =  us.register(username, password);
        return i;
    }
}
