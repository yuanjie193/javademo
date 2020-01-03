package com.service;

import com.dao.Userdao;
import com.pojo.Users;

public class UserServiceImpl implements UserService {
    Userdao ud = new Userdao();
    @Override
    public int register(String username, String password) {
        if(username == null || username.equals("")){
            return 0;
        }
        if(password == null || password.equals("")){
            return 0;
        }
         Users u =  ud.selectByUsername(username);
        if(u!=null){
            return 0;
        }
        int i = ud.insertByUsernameAndPassword2(username,password);
        return i;
    }
}
