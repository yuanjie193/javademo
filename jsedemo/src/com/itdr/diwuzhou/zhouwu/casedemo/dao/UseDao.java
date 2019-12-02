package com.itdr.diwuzhou.zhouwu.casedemo.dao;

import com.itdr.cs2.User;
import com.itdr.diwuzhou.zhouwu.casedemo.pojo.Users;

public class UseDao {
   private static Users[] us;
    static {
        us=new Users[10];
    }
    //判断用户是否存在
    public Users userExits(String name){
        //非空判断
        for (int i = 0; i < us.length; i++) {
            if(us[i]!=null){
                if(us[i].getUname().equals(name)){
                    return us[i];
                }
            }
        }
        return null;
    }

    //把用户数据放入数组
    public int add(Users users){
        for (int i = 0; i < us.length; i++) {
            if(us[i]==null){
                us[i]=users;
                return 1;
            }
        }
        return 0;
    }
    //用户进行登录
    public int login(String uname,String psd){
        for (int i = 0; i < us.length; i++) {
            if(us[i]!=null){
                if(us[i].getUname().equals(uname)&&us[i].getUpsd().equals(psd)){
                    return 1;
                }
            }
        }
        return -1;
    }
}
