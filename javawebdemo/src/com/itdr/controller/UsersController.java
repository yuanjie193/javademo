package com.itdr.controller;

import com.itdr.services.UsersService;
import com.itdr.services.UsersServiceImpl;

public class UsersController {
    UsersService us = new UsersServiceImpl();
    public int register(String username,String password){
       int register =  us.register(username,password);
        return register ;
    }
}
