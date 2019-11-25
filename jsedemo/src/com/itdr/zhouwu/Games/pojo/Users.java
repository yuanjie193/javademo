package com.itdr.zhouwu.Games.pojo;

public class Users {
   private String uname;
   private Epigraph[] user;
//    姓名
    public void setUname(String uname){
        this.uname=uname;
    }
    public String getUname(){
        return this.uname;
    }
//    数组
    public Epigraph[] getUsers() {
        return this.user;
    }

    public void setUsers(Epigraph[] user) {
        this.user = user;
    }
}
