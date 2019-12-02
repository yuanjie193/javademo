package com.itdr.zhouwu.Games;

import com.itdr.cs2.User;
import com.itdr.zhouwu.Games.pojo.*;

import java.util.Scanner;
public class RuneTest {
    public static void main(String[] args) {
        //初始化
        /*Epigraph [] epi =new Epigraph[93];*///     建立符文数组
        BlueRune [] blue =new BlueRune[31];
        OrangeRune[] orange =new OrangeRune[31];
        GreenRune[] green = new GreenRune[31];
        Users[] user = new Users[100];//建立用户数组

        Scanner sc =new Scanner(System.in);
//        建立符文库
        //第一个蓝色符文
        BlueRune blue1=new BlueRune();
        blue1.setEname("活力");
        blue1.setCategory("生命");
        blue1.setLevel("1");
        blue1.setColor("蓝色");
        blue1.setMaxHp("+15");
        blue[0]=blue1;
        //第二个蓝色符文
        BlueRune blue2 = new BlueRune();
        blue2.setEname("治疗");
        blue2.setCategory("生命");
        blue2.setLevel("1");
        blue2.setColor("蓝色");
        blue2.setHfHP("+3");
        blue[1]=blue2;
        // 第三个蓝色符文
        BlueRune blue3=new BlueRune();
        blue3.setEname("绽放");
        blue3.setCategory("生命");
        blue3.setLevel("3");
        blue3.setColor("蓝色");
        blue3.setHfHP("+4.2");
        blue3.setMaxHp("+12");
        blue[2]=blue3;
        //     第一个橘色符文
        OrangeRune orange1 =new OrangeRune();
        orange1.setEname("勇气");
        orange1.setCategory("攻击");
        orange1.setLevel("1");
        orange1.setColor("橘色");
        orange1.setAdHurt("+0.6");
        orange[0]=orange1;
        //     第二个橘色符文
       OrangeRune orange2 =new OrangeRune();
        orange2.setEname("斗志");
        orange2.setCategory("攻击");
        orange2.setLevel("1");
        orange2.setColor("橘色");
        orange2.setApHurt("+1.10");
        orange[1]=orange2;
        //   第三个橘色符文
        OrangeRune orange3 =new OrangeRune();
        orange3.setEname("猛攻");
        orange3.setCategory("攻速");
        orange3.setLevel("1");
        orange3.setColor("橘色");
        orange3.setAdSpeed("+0.4%");
        orange[2]=orange3;
        //   第一个绿色符文
       GreenRune green1 =new GreenRune();
        green1.setEname("应激");
        green1.setCategory("减冷却");
        green1.setLevel("1");
        green1.setColor("绿色");
        green1.setCoolDown("+0.2%");
        green[0]=green1;
        //   第二个绿色符文
        GreenRune green2 =new GreenRune();
        green2.setEname("穿刺");
        green2.setCategory("物理穿透");
        green2.setLevel("1");
        green2.setColor("绿色");
         green2.setAdthough("+1.6");
        green[1]=green2;
        //   第三个绿色符文
        GreenRune green3 =new GreenRune();
        green3.setEname("专注");
        green3.setCategory("法术穿透");
        green3.setLevel("1");
        green3.setColor("绿色");
        green3.setApthough("+1.6");
        green[2]=green3;
        Users u =new Users();//创建用户对象
        Epigraph[] na =new Epigraph[30];
        //用户登录
        while(true){
            System.out.println("------------------------------");
            System.out.println("欢迎来到符文大陆");
            System.out.println("请输入你的姓名");
            String uname =sc.next();
            int n= login(uname,u,user);
//            验证信息正确展示信息
            if(n==2){
                System.out.println("你的信息是"+u.getUname());
//                System.out.println(user[0].getUname()+user[0].getUsers());
            }
//           信息不正确不可以进入
            if(n==-1){
                System.out.println("你不可以进入符文大陆");
            }
//            信息正确进入符文大陆
            if(n==1){
                System.out.println("-----------------------------");
                System.out.println("欢迎进入符文大陆");
                int num=0;
                while(true){
                    System.out.println("你可以选择你想要的符文");
                    System.out.println("这是所有符文的基本特性，请查看！");
                    fwen(blue,orange,green);
                    System.out.println("每种颜色符文你可挑选两个符文，选择颜色可进入进行挑选");
                    //判断是否输入过此颜色
                    String selectColor = choose(na);
                    //           展示符文信息
                    color(selectColor,blue,orange,green);
                    //选择具体名字的符文
                    //                进行挑选符文
                    System.out.println("请输入你想要的符文名字");
                    tx(blue,orange,green,na,selectColor,u);
                    num++;
                    if (num == 3) {
                        System.out.println("-----------------------------------------------");
                        System.out.println("---恭喜召唤师，您已全部挑选完成---");
                        System.out.println("-----------------------------------------------");
                        break;
                    }
                }

                }

                }
                }




    public static int login(String uname,Users u,Users[] user){
        if(uname==null){
            return -1;
        }
        for(int i=0;i<user.length;i++){
            if(user[i]!=null){
                if(uname.equals(user[i].getUname())) {
                    return 2;
                }
            }
        }

        for (int i=0;i<user.length;i++){
            if(user[i]==null){
                u.setUname(uname);
                user[i]=u;
                return 1;
            }return -1;
        }return -1;
    }
    //    展示符文信息
    public static void fwen(BlueRune[] blue,OrangeRune[]orange,GreenRune[] green){
        //展示蓝色符文
        for (int i=0;i<blue.length;i++){
            if(blue[i]!=null){
                System.out.println("符文姓名："+blue[i].getEname()+"\t"+"符文颜色："+blue[i].getColor()+"\t"+"符文等级："+blue[i].getLevel()+"\t"+"符文类型："+blue[i].getCategory()+"\t");
            }
        }
        //展示橙色信息
        for (int i=0;i<orange.length;i++){
            if(orange[i]!=null){
                System.out.println("符文姓名："+orange[i].getEname()+"\t"+"符文颜色："+orange[i].getColor()+"\t"+"符文等级："+orange[i].getLevel()+"\t"+"符文类型："+orange[i].getCategory()+"\t");
            }
        }
        //展示绿色信息
        for (int i=0;i<green.length;i++){
            if(green[i]!=null){
                System.out.println("符文姓名："+green[i].getEname()+"\t"+"符文颜色："+green[i].getColor()+"\t"+"符文等级："+green[i].getLevel()+"\t"+"符文类型："+green[i].getCategory()+"\t");
            }
        }

    }
  //    展示不同颜色的符文详细信息
    public static void color(String color,BlueRune[] blue,OrangeRune[]orange,GreenRune[] green){
        if(color!=null){
            //展示橙色符文详细信息
            if(color.equals("橘色")){
                for(int i=0;i<orange.length;i++){
                    if(orange[i]!=null){
                    System.out.println("符文姓名："+orange[i].getEname()+"\t"+"符文颜色："+orange[i].getColor()+"\t"+"符文等级："+orange[i].getLevel()+"\t"+"符文类型："+orange[i].getCategory()+"\t"+"物理攻击力："+orange[i].getAdHurt()+"\t"
                            +"法术攻击力："+orange[i].getApHurt()+"\t"+"攻速："+orange[i].getAdSpeed()+"\t");

                    }
                }
            }
            //展示蓝色符文详细信息
            if(color.equals("蓝色")){
                for(int i=0;i<blue.length;i++){
                    if(blue[i]!=null){
                        System.out.println("符文姓名："+blue[i].getEname()+"\t"+"符文颜色："+blue[i].getColor()+"\t"+"符文等级："+blue[i].getLevel()+"\t"+"符文类型："+blue[i].getCategory()+"\t"+"最大生命值："+blue[i].getMaxHp()+"\t"
                                +"回复血量："+blue[i].getHfHP()+"\t");
                    }
                }
            }
            //展示绿色符文详细信息
            if(color.equals("绿色")){
                for(int i=0;i<blue.length;i++){
                    if(blue[i]!=null){
                        System.out.println("符文姓名："+green[i].getEname()+"\t"+"符文颜色："+green[i].getColor()+"\t"+"符文等级："+green[i].getLevel()+"\t"+"符文类型："+green[i].getCategory()+"\t"+"冷却："+green[i].getCoolDown()+"\t"
                                +"法术穿透："+green[i].getApthough()+"\t"+"物理穿透："+green[i].getAdthough()+"\t");
                    }
                }
            }
        }

    }

    //    挑选符文

    public static void tx(BlueRune[] blue,OrangeRune[]orange,GreenRune[] green,Epigraph[]na, String color,Users u){
        Scanner sc =new Scanner(System.in);
//        Epigraph[] na =new Epigraph[30];
        if(color.equals("蓝色")){
            int a=0;
            int num=1;
            while(true){
                System.out.println("请挑选你的第"+ num +"个符文");
                String name =sc.next();
            for(int i=0;i<blue.length;i++){
                        if(blue[i]!=null){
                            if(name.equals(blue[i].getEname())){

                                        na[a]= blue[i];
                                        a++;
                                        num++;
                            }
                        }
                    }
                if(a==2){
                    System.out.println("是否确定您的选择，确定输入1，不确定输入0");
                    int nu =sc.nextInt();
                    if(nu==1){
                        u.setUsers(na);
                        break;
                    }else{
                        System.out.println("请重新进行挑选");
                        a=0;
                        num=1;
                    }
                }
                }

            }
            //挑选橘色
        if(color.equals("橘色")){
            int a=2;
            int num=1;
            while(true){
                System.out.println("请挑选你的第"+ num +"个符文");
                String name =sc.next();
                for(int j=0;j<orange.length;j++){
                    if(orange[j]!=null){
                        if(name.equals(orange[j].getEname())){
                            na[a]= orange[j];
                            a++;
                            num++;
                        }
                    }
                }
                if(a==4){
                    System.out.println("是否确定您的选择，确定输入1，不确定输入0");
                    int nu =sc.nextInt();
                    if(nu==1){
                        u.setUsers(na);
                        break;
                    }else{
                        System.out.println("请重新进行挑选");
                        a=2;
                        num=1;
                    }
                }
            }

        }
            //挑选绿色
        if(color.equals("绿色")){
            int a=4;
            int num=1;
            while(true){
                System.out.println("请挑选你的第"+ num +"个符文");
                String name =sc.next();
                for(int j=0;j<green.length;j++){
                    if(blue[j]!=null){
                        if(name.equals(green[j].getEname())){
                            na[a]= green[j];
                            a++;
                            num++;
                        }
                    }
                }
                if(a==6){
                    System.out.println("是否确定您的选择，确定输入1，不确定输入0");
                    int nu =sc.nextInt();
                    if(nu==1){
                        u.setUsers(na);
                        break;
                    }else{
                        System.out.println("请重新进行挑选");
                        a=4;
                        num=1;
                    }
                }
            }

        }

            /*for(int i=0;i<green.length;i++){
                if(green[i]!=null){
                    if(name.equals(green[i].getEname())){
                        for(int j=0;j<na.length;j++){
                            if(na[j]!=null){
                                na[j]= green[i];
                                c++;
                                return c;
                            }return -1;

                        }

                    }return -1;

                }

            }*/


    }
    //判断是否输入过颜色
    public static String choose(Epigraph[] epi){
        while (true){
            Scanner sc = new Scanner(System.in);
            String selectColor = sc.next();
            int m = 0;
            for (;m<epi.length;m++){
                if (epi[m] != null){
                    if (selectColor.equals(epi[m].getColor())){
                        System.out.println("选择重复，请重新选择：");
                        String selectColor2 = sc.next();
                        selectColor = selectColor2;
                        m=0;
                    }
                }
            }
            if (m==epi.length){
                return selectColor;
            }
        }
    }
}
