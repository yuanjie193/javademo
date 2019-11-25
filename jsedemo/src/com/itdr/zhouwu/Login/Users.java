package com.itdr.zhouwu.Login;

public class Users {
//    成员变量：用户名，密码
    private String userName;
    private String passWord;

    public String getUserName(){
           return this.userName;
    }
    public void setUserName(String userName){
          this.userName=userName;
    }
    public String getPassWord(){
          return this.passWord;
    }
    public void setPassWord(String psd){
         this.passWord=psd;
    }
    public void setUser(Users u){
        System.out.println("用户名："+this.userName+"密码"+this.passWord);
    }
}
