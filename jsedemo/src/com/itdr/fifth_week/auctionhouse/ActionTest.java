package com.itdr.fifth_week.auctionhouse;

import com.itdr.fifth_week.auctionhouse.auction.Lots;
import com.itdr.fifth_week.auctionhouse.auction.Users;
import com.itdr.fifth_week.auctionhouse.utils.AdvertisementUtil;
import java.util.Scanner;
public class ActionTest {
  //初始化
    //准备一个用户数组
    static Users[] u =new Users[10];
    //准备一个拍卖品数组
    static Lots[] lots= new Lots[10];
    static Users ru;
    public static void main(String[] args) {
        //初始化：键盘录入
        Scanner sc =new Scanner(System.in);
        //用户进入登录
        AdvertisementUtil.advertisement();

        while(true) {
            System.out.println("请根据序号选择你要进行的操作：1.用户登录 2.用户注册 3.退出");
            int num=0;
            num =sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("请输入你的用户名");
                    String username = sc.next();
                    System.out.println("请输入密码");
                    String psd = sc.next();
                    int n = login(username, psd, u);
                    if (n == 1) {
                        System.out.println("==================================================================");
                        System.out.println("登录成功");
                        AdvertisementUtil.advertisement();
                        Users.show(username,psd,u);
                        System.out.println("你可以充值金币，1:充值，2：不充值");
                        int x=sc.nextInt();
                        if(x ==1){
                        while(x==1){
                            System.out.println("请输入充值金额，一次最多充值一百金币");
                            int jb=sc.nextInt();
                            recharge(jb,username,psd,u);
                            Users.show(username,psd,u);
                            System.out.println("是否再次进行充值，1：是；2：否");
                            x =sc.nextInt();
                        }
                        }
                    } else {
                        System.out.println("登录失败");
                    }
                    break;
                case 2:
                    System.out.println("请输入你的用户名");
                    String uname = sc.next();
                    System.out.println("请输入密码");
                    String psd2 = sc.next();
                    int n2 = register(uname, psd2, u);
                    if (n2 == 1) {
                        System.out.println("注册成功请登录");
                    } else {
                        System.out.println("注册失败");
                    }
                    break;
                case 3:
                    System.out.println("期待下次与你重逢");
                    return;
            }
        }
    }
//  用户注册方法
    public static int register(String username,String psd,Users[] u){
        Users users =new Users();
        users.setUserName(username);
        users.setUserPsd(psd);
        users.setLevel("小白");
        users.setMoney(0);
        int num =exitUser(users,u);
        if(num==1){
            for (int i = 0; i <u.length ; i++) {
                if(u[i]==null){
                    u[i]=users;
                    return num;
                }
            }
        }
        return num;
    }
    //判断用户是否存在:1 不存在 -1 存在；
    public static int exitUser(Users users,Users[] u){
        //判断用户对象是否存在
        if(users==null){
            return -1;
        }
        for (int i = 0; i < u.length; i++) {
            if(u[i]!=null){
                if(! u[i].getUserName().equals(users.getUserName())){
                    return 1;
                }
            }else if(i == u.length - 1){
                return 1;
            }
        }
    return -1;
    }
    //用户进行登录
    public static int login(String username,String psd,Users[] u){
        for (int i = 0; i <u.length ; i++) {
           if(u[i]!=null){
               if(username.equals(u[i].getUserName()) && psd.equals(u[i].getUserPsd())){
                   return 1;
               }
           }
        }
        return -1;
    }
    //充值金币
    public static int recharge(int nu,String username,String psd,Users[] u){
        if(nu>0&& nu<=100){

        for (int i = 0; i < u.length; i++) {
            if(u[i]!=null){
                if(username.equals(u[i].getUserName()) && psd.equals(u[i].getUserPsd())){
                    int a =u[i].getMoney();
                        nu=a+nu;
                    u[i].setMoney(nu);
                    return 1;
                    }
                }
            }
        }
        return -1;
    }
}
