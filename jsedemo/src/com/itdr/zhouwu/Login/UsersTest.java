package com.itdr.zhouwu.Login;
import com.itdr.zhouwu.Login.Users;

import java.util.Scanner;
public class UsersTest {
    public static void main(String[] args) {
        Users u = new Users();
        u.setUserName("yuanjie");
        String a =u.getUserName();
        u.setPassWord("123");
        String b =u.getPassWord();
//        用户登录
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名");
        String uname=sc.next();
        System.out.println("请输入密码");
        String psd=sc.next();
        Users c = login(uname,psd,u);
        if(c!=null){
           c.setUser( c);
        }else{
           System.out.println("登录失败");
        }
    }
//    登录方法
    public static Users login(String uname,String psd,Users u){
        if(uname.equals(u.getUserName())&&psd.equals(u.getPassWord())){
            return u;
        }return null;
    }

}
