package com.trash.service;

import com.trash.dao.UsersDao;

public class UsersServiceImpl implements UsersService{
    private UsersDao ud = new UsersDao();
    @Override
    public void register(String uName) {
        if(uName == null || uName.equals("")){
           return;
        }
        ud.selectByUName(uName);
    }
}
