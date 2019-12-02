package com.itdr.fifth_week.zhouwu.casedemo.service;

import com.itdr.fifth_week.zhouwu.casedemo.dao.UseDao;
import com.itdr.fifth_week.zhouwu.casedemo.pojo.Users;

public class UseService {
    private   UseDao ud =new UseDao();
    public String register(String uname,String upsd){
       //非空判断
        if(uname==null && upsd==null){
            return null;
        }
        //判断数据是否存在
        Users u = ud.userExits(uname);
        if(u!=null){
            return "注册失败";
        }
        //注册用户
        Users us= new Users();
         us.setUname(uname);
         us.setUpsd(uname);
         int a =ud.add(us);
         if(a==-1){
             return "注册失败";
         }
        return "注册成功";
    }
    //用户进行登录
    public String login(String uname,String psd){
        if(uname==null && psd==null){
            return "登录失败";
        }
        int a= ud.login(uname,psd);
        if(a==-1){
            return "登录失败" ;
        }
        return "登录成功";
    }
    //用户进行注销
}
