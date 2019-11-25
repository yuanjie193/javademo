package com.itdr.cs2;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        // 用户注册
        //初始化
        Scanner sc = new Scanner(System.in);
        User[] arr =new User[10];
        //创建不同种类的数据对象
        Datas[] datas =new Datas[36];
//        Datas[] datas2 =new Datas[3];
//        Datas[] datas3 =new Datas[3];
//        Datas d = new Datas("生肖","鸡","苏");
//        datas[0] = d;
//        Datas d2 = new Datas("生肖","马","顾");
//        datas[1] = d2;
//        Datas d3 = new Datas("生肖","羊","夏");
//        datas[2] = d3;
//        Datas d10 = new Datas("生肖","狗","陈");
//        datas[3] = d10;
//        Datas d4 = new Datas("月份","1","小");
//        datas2[0] = d4;
//        Datas d5 = new Datas("月份","2","棂");
//        datas2[1] = d5;
//        Datas d6 = new Datas("月份","3","玥");
//        datas2[2] = d6;
//        Datas d7 = new Datas("星座","白羊座","浅");
//        datas3[0] = d7;
//        Datas d8 = new Datas("星座","金牛座","姬");
//        datas3[1] = d8;
//        Datas d9 = new Datas("星座","巨蟹座","盈");
//        datas3[2] = d9;
        Datas d = new Datas("生肖","鸡","苏");
        datas[0] = d;
        Datas d2 = new Datas("生肖","马","顾");
        datas[1] = d2;
        Datas d3 = new Datas("生肖","羊","夏");
        datas[2] = d3;
        Datas d10 = new Datas("生肖","狗","陈");
        datas[9] = d10;
        Datas d4 = new Datas("月份","1","小");
        datas[3] = d4;
        Datas d5 = new Datas("月份","2","棂");
        datas[4] = d5;
        Datas d6 = new Datas("月份","3","玥");
        datas[5] = d6;
        Datas d7 = new Datas("星座","白羊座","浅");
        datas[6] = d7;
        Datas d8 = new Datas("星座","金牛座","姬");
        datas[7] = d8;
        Datas d9 = new Datas("星座","巨蟹座","盈");
        datas[8] = d9;

        //用户输入数据
        System.out.println("请输入数据");
        System.out.println("用户名");
        String uname =sc.next();
        System.out.println("密码");
        int psd =sc.nextInt();
        System.out.println("生肖");
        String sx =sc.next();
        System.out.println("月份");
        int month =sc.nextInt();
        System.out.println("星座");
        String xz =sc.next();
        int a=register(uname,psd,sx,month,xz,arr);
        if(a==1){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }
//用户登录
        System.out.println("请登录");
        int number =1;
        while (number==1){
            String uname2 =sc.next();
            int psd2 =sc.nextInt();
            int b =login(uname2,psd2,arr);
            if(b==1){
                System.out.println("成功登录");
                break;
            }else{
                System.out.println("输入的账号或密码不正确，请重新输入");
                System.out.println("还需要再重新输入么，重新输入选择1，放弃输入0");
                int nu =sc.nextInt();
                number =nu;
                if(number==1){
                    System.out.println("请再次输入");
                }else{
                    System.out.println("下次再见");
                }

            }

        }
//        开始测试
        System.out.println("欢迎进行测试");
        System.out.println("请依次输入生肖、月份、星座");
        String sx2 = sc.next();
        String mon2 = sc.next();
        String xz2 = sc.next();
        String xname= startGames(sx2,mon2,xz2,datas);
        System.out.println("你前世的名字是："+xname);
    }
      public static int register(String uname,int psd,String sx,int month,String xz,User[] arr){
        User u =new User();
        u.uname =uname;
        u.psd = psd;
        u.sx =sx;
        u.month = month;
        u.xz =xz;
        //把数据放入数组
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                arr[i]=u;
                return 1;
            }
        }return -1;
    }
//    用户登录
    public static int login(String uname,int psd,User[] ua){
//非空判断
        if(uname==null && psd ==0){
            return -1;
        }
//        判断是否有用户账号
        for(int i=0;i<ua.length;i++){
            if(ua[i]!=null){
                if(ua[i].uname.equals(uname) && ua[i].psd==psd){
                    return 1;
                }
            }
        }
        return -1;
    }
//开始测试
    public static String startGames(String sx,String month,String xz,Datas[] ds){
        String newname ="";
           for(int i =0;i<ds.length;i++){
               if(ds[i]!=null ){
                    if(ds[i].category.equals("生肖")){//让循环少遍历几次
                       if(ds[i].yz.equals(sx)){
                          newname=newname+ds[i].xz;
                       }
                    }
                   if(ds[i].category.equals("月份")){
                       if(ds[i].yz.equals(month)){
                           newname=newname + ds[i].xz;
                       }
                   }

                   if(ds[i].category.equals("星座")){
                       if(ds[i].yz.equals(xz)){
                           newname=newname+ds[i].xz;
                       }
                   }
               }
           }
           return newname;
    }
}
