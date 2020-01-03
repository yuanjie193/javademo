package com.trash.controller;

import com.trash.service.UsersService;
import com.trash.service.UsersServiceImpl;

public class UsersController {
private UsersService us = new UsersServiceImpl();
    public void register(String uName){
         us.register(uName);
    }
}
