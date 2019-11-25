package com.itdr.zhouwu.Games;

import com.itdr.zhouwu.Games.pojo.*;

import java.util.Scanner;

public class Test {
       /* public static void main(String[] args) {
            //初始化
            Epigraph [] epi =new Epigraph[93];//     建立符文数组
            Users[] user = new Users[100];//建立用户数组
            Users u =new Users();//创建用户对象
            Scanner sc =new Scanner(System.in);
//        建立符文库
            //第一个蓝色符文
            Epigraph blue1 =new BlueRune();
            blue1.setEname("活力");
            blue1.setCategory("生命");
            blue1.setLevel("1");
            blue1.setColor("蓝色");
            ((BlueRune) blue1).setMaxHp("15");
            epi[0]=blue1;
            //第二个蓝色符文
            Epigraph blue2 =new BlueRune();
            blue2.setEname("治疗");
            blue2.setCategory("生命");
            blue2.setLevel("1");
            blue2.setColor("蓝色");
            ((BlueRune) blue2).setHfHP("回血");
            epi[1]=blue1;
            // 第三个蓝色符文
            Epigraph blue3 =new BlueRune();
            blue3.setEname("绽放");
            blue3.setCategory("生命");
            blue3.setLevel("3");
            blue3.setColor("蓝色");
            ((BlueRune) blue3).setHfHP("回血");
            ((BlueRune) blue3).setMaxHp("最大生命");
            epi[2]=blue1;
            //     第一个橘色符文
            Epigraph orange1 =new OrangeRune();
            orange1.setEname("勇气");
            orange1.setCategory("攻击");
            orange1.setLevel("1");
            orange1.setColor("橘色");
            ((OrangeRune) orange1).setAdHurt("+0.6");
            epi[3]=orange1;
            //     第二个橘色符文
            Epigraph orange2 =new OrangeRune();
            orange2.setEname("斗志");
            orange2.setCategory("攻击");
            orange2.setLevel("1");
            orange2.setColor("橘色");
            ((OrangeRune) orange2).setApHurt("+1.10");
            epi[4]=orange2;
            //   第三个橘色符文
            Epigraph orange3 =new OrangeRune();
            orange3.setEname("猛攻");
            orange3.setCategory("攻速");
            orange3.setLevel("1");
            orange3.setColor("橘色");
            ((OrangeRune) orange3).setAdSpeed("+0.4%");
            epi[5]=orange3;
            //   第一个绿色符文
            Epigraph green1 =new GreenRune();
            green1.setEname("应激");
            green1.setCategory("减冷却");
            green1.setLevel("1");
            green1.setColor("绿色");
            ((GreenRune) green1).setCoolDown("+0.2%");
            epi[6]=green1;
            //   第二个绿色符文
            Epigraph green2 =new GreenRune();
            green2.setEname("穿刺");
            green2.setCategory("物理穿透");
            green2.setLevel("1");
            green2.setColor("绿色");
            ((GreenRune) green2).setAdthough("+1.6");
            epi[7]=green2;
            //   第三个绿色符文
            Epigraph green3 =new GreenRune();
            green3.setEname("专注");
            green3.setCategory("法术穿透");
            green3.setLevel("1");
            green3.setColor("绿色");
            ((GreenRune) green3).setApthough("+1.6");
            epi[7]=green3;
            //用户登录
            while(true){
                System.out.println("------------------------------");
                System.out.println("欢迎来到符文大陆");
                System.out.println("请输入你的姓名");
                String uname =sc.next();
                int n= login(uname,u,user);
//            验证信息正确展示信息
                if(n==2){
                    System.out.println("你的信息是");
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
                    System.out.println("你可以选择你想要的符文");
                    System.out.println("这是所有符文的基本特性，请查看！");
                    fwen(epi);
                    System.out.println("每种颜色符文可挑选十种，选择颜色可查看符文详细信息");
                    System.out.println("请输入你想要查看的符文颜色");
//              查看不同颜色符文的详细信息
                    String color =sc.next();
//                展示符文信息

//                进行挑选符文
                    Epigraph[] na =new Epigraph[30];
                    System.out.println("请输入你想要的符文名字");
                    String name =sc.next();
                    int num= 0;
                    int a=tx(name,epi,na,num);
                    if(a==1){
                        System.out.println("你挑选成功");
                    }else{
                        System.out.println("挑选失败");
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
        public static void fwen(Epigraph[] epi){
            for (int i=0;i<epi.length;i++){
                if(epi[i]!=null){
                    System.out.println("符文姓名："+epi[i].getEname()+"\t"+"符文颜色："+epi[i].getColor()+"\t"+"符文等级："+epi[i].getLevel()+"\t"+"符文姓名："+epi[i].getCategory()+"\t");
                }

            }
        }
//    展示不同颜色的符文详细信息
        public static void color(String color,Epigraph[] epi){
            for (int i =0;i<epi.length;i++){
                if(epi[i]!=null){
                    if(color.equals("蓝色")){
                        System.out.println(epi[i].get);

                    }
                }

            }
        }
//    挑选符文
        public static int tx(String name,Epigraph[] epi,Epigraph[] tx,int num){
            for(int i=0;i<epi.length;i++){
                if(epi[i]!=null){
                    if(name.equals(epi[i].getEname())){
                        for(int j=0;j<tx.length;j++){
                            tx[j]=epi[i];
                            return 1;
                        }
                    }
                }

            }
        *//*for(int i=0;i<tx.length;i++){
            if(tx[i].getColor().equals("蓝色")){
                num++;
            }
        }*//*
            return -1;
        }
    }*/

   /* public static int tx(String name,BlueRune[] blue,OrangeRune[]orange,GreenRune[] green,Epigraph[] na,String color,int a,int b,int c){
        if(name!=null){
            for(int i=0;i<blue.length;i++){
                if(blue[i]!=null){
                    if(name.equals(blue[i].getEname())){
                        for(int j=0;j<na.length;j++){
                            if(na[j]!=null){
                                na[j]= blue[i];
                                a++;
                                return a;
                            }
                        }

                    }

                }

            }*/
}