package com.itdr.diwuzhou.zhouwu.casedemo.controller;

import com.itdr.diwuzhou.zhouwu.casedemo.dao.UseDao;
import com.itdr.diwuzhou.zhouwu.casedemo.service.UseService;

public class UserController {
      private UseService us =new UseService();
  //注册
  public void register(String uname,String upsd){
       String a =us.register(uname,upsd);
       System.out.println(a);
  }
  //登录
  public void login(String uname,String psd){
      String b =us.login(uname,psd);
      System.out.println(b);
  }

}
