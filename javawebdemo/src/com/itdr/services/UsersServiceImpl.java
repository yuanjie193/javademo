package com.itdr.services;

import com.itdr.dao.UsersDao;
import com.itdr.pojo.Users;

public class UsersServiceImpl implements UsersService {
    UsersDao ud = new UsersDao();
    @Override
    public int register(String username, String password) {
        if(username == null || username.equals("")){
            return 0;
        }
        if(password == null || password.equals("")){
            return 0;
        }
        //用户名是否存在
        Users u = ud.selectByUsername(username);
        if(u != null){
            return 0;
        }
        int a =  ud.insertByUsernameAndPassword(username,password);
        return a;
    }
}
