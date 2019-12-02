package com.itdr.fifth_week.zhouwu.casedemo;

import com.itdr.fifth_week.zhouwu.casedemo.controller.UserController;
import java.util.Scanner;
public class UserTestDemo {
    public static void main(String[] args) {
        //创建控制层对象
        UserController uc =new UserController();
        Scanner sc =new Scanner(System.in);
        //用户注册
        System.out.println("请输入你的用户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String psd = sc.next();
        uc.register(username,psd);
        //用户登录
        System.out.println("请进行登录");
        System.out.println("请输入你的用户名");
        String username2 = sc.next();
        System.out.println("请输入密码");
        String psd2 = sc.next();
        uc.login(username2,psd2);
        //用户注销



    }
}
