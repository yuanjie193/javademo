package com.itdr.eighth_week.zhouce8;

import com.itdr.eighth_week.zhouce8.pojo.*;
import com.itdr.eighth_week.zhouce8.utils.AdvertisementUtil;

import java.util.Random;
import java.util.Scanner;

public class TrashGame {
    //初始化
    static User[] u ;
    static Trash[] trashes ;
    static TrashCan[] trashCans;
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);

    static {
        u = new User[10];
        trashes = new Trash[20];
        User user = new User();
        user.setuName("辉辉");
        user.setJf(100);
        u[0] = user;
        User user2 = new User();
        user2.setuName("贾文玉");
        user2.setJf(80);
        u[1] = user2;
        User user3 = new User();
        user3.setuName("魏华晨");
        user3.setJf(60);
        u[2] = user3;
        User user4 = new User();
        user4.setuName("圈圈");
        user4.setJf(120);
        u[3] = user4;
        Trash t = new HarmfulTrash();
        t.settName("充电电池");
        t.setCategory("有害垃圾");
        t.setDescription("会污染环境");
        t.setWhd("5");
        trashes[0]=t;
        Trash t2 = new HarmfulTrash();
        t2.settName("废节能灯");
        t2.setCategory("有害垃圾");
        t2.setWhd("3");
        t2.setDescription("会污染环境");
        trashes[1]=t2;
        Trash t3 = new HarmfulTrash();
        t3.settName("废油漆");
        t3.setCategory("有害垃圾");
        t3.setDescription("会污染环境");
        t3.setWhd("4");
        trashes[2]=t3;
        Trash t4 = new KitchenTrash();
        t4.settName("臭鸡蛋");
        t4.setCategory("厨余垃圾");
        t4.setDescription("会容易腐坏");
        t4.setWhd("2");
        trashes[3]=t4;
        Trash t5 = new KitchenTrash();
        t5.settName("果皮");
        t5.setCategory("厨余垃圾");
        t5.setDescription("会容易腐坏");
        t5.setWhd("1");
        trashes[4]=t5;
        Trash t6 = new KitchenTrash();
        t6.settName("骨头");
        t6.setCategory("厨余垃圾");
        t6.setDescription("会容易腐坏");
        t6.setWhd("1");
        trashes[5]=t6;
        Trash t7 = new RecyclableTrash();
        t7.settName("易拉罐");
        t7.setCategory("可回收垃圾");
        t7.setDescription("没啥危害");
        t7.setWhd("1");
        trashes[6]=t7;
        Trash t8 = new RecyclableTrash();
        t8.settName("杂志");
        t8.setCategory("可回收垃圾");
        t8.setDescription("没啥危害");
        t8.setWhd("2");
        trashes[7]=t8;
        Trash t9 = new RecyclableTrash();
        t9.settName("塑料杯");
        t9.setCategory("可回收垃圾");
        t9.setDescription("没啥危害");
        t9.setWhd("2");
        trashes[8]=t9;
        Trash t10 = new OtherTrush();
        t10.settName("卫生间废纸");
        t10.setCategory("其它垃圾");
        t10.setDescription("会造成白色垃圾");
        t10.setWhd("3");
        trashes[9]=t10;
        Trash t11 = new OtherTrush();
        t11.settName("碎玻璃");
        t11.setCategory("其它垃圾");
        t11.setDescription("会割伤");
        t11.setWhd("2");
        trashes[10]=t11;
        Trash t12 = new OtherTrush();
        t12.settName("烂衣服");
        t12.setCategory("其它垃圾");
        t12.setDescription("浪费");
        t12.setWhd("1");
        trashes[11]=t12;
        trashCans = new TrashCan[4];
        TrashCan tc1= new HarmfulTrashCan();
        tc1.settCName("有害垃圾桶");
        tc1.settCategory("有害垃圾");
        tc1.setCapacity(100);
        trashCans[0] = tc1;
        TrashCan tc2 = new KitchenTrashCan();
        tc2.settCName("厨余垃圾桶");
        tc2.settCategory("厨余垃圾");
        tc2.setCapacity(100);
        trashCans[1] = tc2;
        TrashCan tc3 = new RecyclableTrashCan();
        tc3.settCName("可回收垃圾桶");
        tc3.settCategory("可回收垃圾");
        tc3.setCapacity(100);
        trashCans[2] = tc3;
        TrashCan tc4 = new RecyclableTrashCan();
        tc4.settCName("其它垃圾桶");
        tc4.settCategory("其它垃圾");
        tc4.setCapacity(100);
        trashCans[3] = tc4;
    }
    public static void main(String[] args) {
        while(true){
        AdvertisementUtil.advertisement();
            System.out.println("请输入你的姓名");
            String name = sc.next();
            int a = judge(name);
            int b = register(a,name);
            if(a==1 || b == 1) {
                System.out.println("登录成功！");
                while (true) {
                    AdvertisementUtil.advertisement();
                    System.out.println("是否开始游戏：1.开始游戏  2.查看排行榜 3.退出");
                    int xz1 = sc.nextInt();
                   switch (xz1) {
                        case 1:
                            System.out.println("======================================");
                            System.out.println("现在开始垃圾分类，即将随机分配垃圾");
                            int h = r.nextInt(4)+2;
                            int c = 70;
                            while (h != 0) {
                                Trash t = distribution();
                                System.out.println("======================================");
                                System.out.println(t.gettName());
                                if (r.nextInt(100) > c) {
                                    IntelligenceTrashCan.handleTrash(t, trashCans, name, u);
                                    c = -1;
                                } else {
                                    AdvertisementUtil.fLei();
                                    String fl = sc.next();
                                    jFen(name, fl, t);
                                }
                                h--;
                            }
                            break;
                        case 2:
                            showByPhb();
                            break ;
                        case 3:
                            break;
                        default:
                            break;
                    }
                    if(xz1==3){
                        break;
                    }

                }
            }
        }

    }

    /**
     * 判断用户是否注册过
     */
    public static int judge(String name){
        for (int i = 0; i < u.length; i++) {
            if(u[i]!=null){
                if(u[i].getuName().equals(name)){
                    return 1;
                }
            }
        }
        return -1;
    }
    /**
     * 注册用户
     */
    public static int register(int a,String name){
        if(a == -1){
            for (int i = 0; i < u.length; i++) {
                if(u[i]==null){
                    User user = new User();
                    user.setuName(name);
                    u[i] = user;
                    return -a;
                }
            }
        }
        return -a;
    }

    /**
     * 抽取垃圾
     * @return
     */
    public static Trash  distribution(){
        for (int i = 0; i < trashes.length; i++) {
            int a = r.nextInt(12);
           if(trashes[i]!=null){
               return trashes[a];
           }
        }
        return null;
    }
    /**
     * 垃圾放入垃圾桶
     */
    public static  int  recovery(String fl,Trash trash) {

        for (int i = 0; i < trashCans.length; i++) {
            if (trashCans[i]!=null){
                if(trash.getCategory().equals(fl)){
                    if(trashCans[i].gettCategory().equals(fl)){
                        trashCans[i].setNum(trashCans[i].getNum()+1);
                        trashCans[i].setCapacity(trashCans[i].getCapacity()-1);
                        return 1;
                    }

                }
            }
        }

   return -1;
    }
    /**
     * 用户垃圾成功积分改变
     */
    public static void jFen(String name,String fl,Trash trash){
         int num =  recovery(fl,trash);
         for (int j = 0; j < u.length; j++) {
               if(u[j]!=null){
                     if(u[j].getuName().equals(name)){
                         if(num == 1){
                             u[j].setJf(u[j].getJf()+1);
                             System.out.println("分类成功，已放入:"+trash.getCategory()+"桶，积分+1，当前积分为："+u[j].getJf());
                         }else {
                             u[j].setJf(u[j].getJf()-1);
                             System.out.println("分类成败，积分-1，当前积分为："+u[j].getJf());
                         }
                    }
                 }
         }
    }
    /**
     * 排名
     */
    public static void phb(){
        for (int i = 0; i < u.length-1; i++) {
            if(u[i]!=null){
                for(int j =i+1;j<u.length;j++){
                    if(u[j] != null){
                        if(u[i].getJf()<u[j].getJf()){
                            User user = u[i];
                            u[i] =u[j];
                            u[j] = user;
                        }
                    }

                }
            }
        }

    }
    public static void showByPhb(){
        phb();
        for (int i = 0; i < u.length; i++) {
            if(u[i]!=null){
                System.out.println("第"+(i+1)+"名:"+"姓名："+u[i].getuName()+"积分："+u[i].getJf());
            }
        }
    }
}
