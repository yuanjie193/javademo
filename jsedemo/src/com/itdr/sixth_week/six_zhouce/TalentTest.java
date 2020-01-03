package com.itdr.sixth_week.six_zhouce;


import com.itdr.cs2.User;
import com.itdr.sixth_week.six_zhouce.pojo.*;
import com.itdr.sixth_week.six_zhouce.utils.AsideUtil;
import com.itdr.zhouwu.Games.Test;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class TalentTest {
    //天赋初始化
   static Talent[] talent ;
//   static Users users ;
   static Users[] user = new Users[20]; ;
   static TestProblem[] tp;
   static Reward[] rw;
   static int  y  = 0;
   public static GoldTestWay gtw = new GoldTestWay();
   public static  WoodTestWay wtw = new WoodTestWay();
   public static WaterTestWay water = new WaterTestWay();
   public static  FireTestWay ftw = new FireTestWay();
   public static  SoilTestWay stw = new SoilTestWay();
   public static  KongTestway ktw = new KongTestway();
   static  Random r = new Random();
   static{
       talent = new Talent[6];
       Talent t1 = new Talent();
       t1.settName("金");
       t1.setPower("可以随心创造金子");
       t1.setAffinity("金元素亲和");
       talent[0] = t1;
       Talent t2 = new Talent();
       t2.settName("木");
       t2.setPower("可以催发植物生机");
       t2.setAffinity("木元素亲和");
       talent[1]= t2;
       Talent t3 = new Talent();
       t3.settName("水");
       t3.setPower("可以召唤水");
       t3.setAffinity("水元素亲和");
       talent[2]= t3;
       Talent t4 = new Talent();
       t4.settName("火");
       t4.setPower("可以创造火");
       t4.setAffinity("火元素亲和");
       talent[3]= t4;
       Talent t5 = new Talent();
       t5.settName("土");
       t5.setPower("可以创造土");
       t5.setAffinity("土元素亲和");
       talent[4]= t5;
       Talent t6 = new Talent();
       t6.settName("空");
       t6.setPower("包容万象");
       t6.setAffinity("空元素亲和");
       talent[5]= t6;
//       users = new Users();

       //初始化问题
       tp = new TestProblem[20];
       TestProblem tpp = new TestProblem();
       tpp.setAttribute("金");
       tpp.setpDesprition("一克金子加一克金子是多少克金子？");
       tpp.setAnswer("2");
       tp[0] = tpp;
       TestProblem tpp2 = new TestProblem();
       tpp2.setAttribute("金");
       tpp2.setpDesprition("一两金子是多少克？");
       tpp2.setAnswer("50");
       tp[1] = tpp2;
       TestProblem tpp3 = new TestProblem();
       tpp3.setAttribute("金");
       tpp3.setpDesprition("你有一斤金子，现在花了六两，现在还有多少克金子？");
       tpp3.setAnswer("200");
       tp[2] = tpp3;
       //木
       TestProblem tpp4 = new TestProblem();
       tpp4.setAttribute("木");
       tpp4.setpDesprition("你有一棵树，现在需要十三棵树，请问还需要多少棵？");
       tpp4.setAnswer("12");
       tp[3] = tpp4;
       TestProblem tpp5 = new TestProblem();
       tpp5.setAttribute("木");
       tpp5.setpDesprition("你有二十棵树，又创造了十五棵，请问现在有多少棵？");
       tpp5.setAnswer("35");
       tp[4] = tpp5;
       TestProblem tpp6 = new TestProblem();
       tpp6.setAttribute("木");
       tpp6.setpDesprition("你有十朵花，现在借给小伙伴两朵花，五天之后，小伙伴还了你四朵花，，请问你现在总共有多少花？");
       tpp6.setAnswer("12");
       tp[5] = tpp6;
       //水
       TestProblem tpp7 = new TestProblem();
       tpp7.setAttribute("水");
       tpp7.setpDesprition("水可以洗脸么");
       tpp7.setAnswer("可以");
       tp[6] = tpp7;
       TestProblem tpp8 = new TestProblem();
       tpp8.setAttribute("水");
       tpp8.setpDesprition("水可以浇花么？");
       tpp8.setAnswer("可以");
       tp[7] = tpp8;
       TestProblem tpp9 = new TestProblem();
       tpp9.setAttribute("水");
       tpp9.setpDesprition("水可以浪费么");
       tpp9.setAnswer("不可以");
       tp[8] = tpp9;
       //火
       TestProblem tpp10 = new TestProblem();
       tpp10.setAttribute("火");
       tpp10.setpDesprition("火可以取暖么？");
       tpp10.setAnswer("可以");
       tp[9] = tpp10;
       TestProblem tpp11 = new TestProblem();
       tpp11.setAttribute("火");
       tpp11.setpDesprition("火可以做饭么？");
       tpp11.setAnswer("可以");
       tp[10] = tpp11;
       TestProblem tpp12 = new TestProblem();
       tpp12.setAttribute("火");
       tpp12.setpDesprition("可以玩火么？");
       tpp12.setAnswer("不可以");
       tp[11] = tpp12;
       //土
       TestProblem tpp13 = new TestProblem();
       tpp13.setAttribute("土");
       tpp13.setpDesprition("土可以盖房子么？");
       tpp13.setAnswer("可以");
       tp[12] = tpp13;
       TestProblem tpp14 = new TestProblem();
       tpp14.setAttribute("土");
       tpp14.setpDesprition("土可以灭火么？");
       tpp14.setAnswer("可以");
       tp[13] = tpp14;
       TestProblem tpp15 = new TestProblem();
       tpp15.setAttribute("土");
       tpp15.setpDesprition("土可以吃么？");
       tpp15.setAnswer("不可以");
       tp[14] = tpp15;
       //奖励
       rw = new Reward[3];
       Reward rw1 = new Reward();
       rw1.setLevle("1");
       rw1.setLucky("运气值70");
       rw1.setrNum(1);
       rw[0]=rw1;
       Reward rw2 = new Reward();
       rw2.setLevle("2");
       rw2.setLucky("运气值85");
       rw2.setrNum(1);
       rw[1]=rw2;
       Reward rw3 = new Reward();
       rw3.setLevle("3");
       rw3.setLucky("运气值95");
       rw3.setrNum(3);
       rw[2]=rw3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        AsideUtil.aside();
        System.out.println("请输入你的姓名");
         String name = sc.next();
         int a =register(name);
         if(a == 1){
             System.out.println("你需要通过试炼之路才可上山！进行测试请按：1，离开请按：2");
             int xz= sc.nextInt();
             if(xz == 1){
                 System.out.println("现在开始测试！");
                 System.out.println("请把双手放在台上进行测试！进行测试请按：1，离开请按：2");
                 int cs = sc.nextInt();
                 if(cs == 1){
                     Talent t = test();
                     add (t,name);
                     System.out.println("你的天赋是："+t.gettName());
                     t.affinity(t.gettName());
                     System.out.println("=================================");
                     System.out.println("即将进行试炼，现在开始随机传送");
                     int num = r.nextInt(6);

                     switch (num){
                         case 0:
                              System.out.println("这里是金之路，回答以下问题");
                               TestProblem t1 = gtw.testWay(t.gettName(),tp);
                               if(t1 != null){
                               System.out.println(t1.getpDesprition());
                               String answer = sc.next();
                               int h = judge(answer,t1);
                               if(h == 1){
                                   System.out.println("答案正确");
                                    y++;
                                   System.out.println("密码是："+ 1234);
                                   System.out.println("=====================================");
                                   System.out.println("神秘宝箱出现，请输入密码可获得");
                                   int psd = sc.nextInt();
                                   psd(psd,num);

                               }else {
                                   System.out.println("答案错误，你将退出试炼");
                                   break;
                               }
                            }
                           break;
                         case 1:
                             System.out.println("这里是木之路，回答以下问题");
                             TestProblem t2 = wtw.testWay(t.gettName(),tp);
                             if(t2 != null){
                                 System.out.println(t2.getpDesprition());
                                 String answer = sc.next();
                                 int h2 = judge(answer,t2);
                                 if(h2 == 1){
                                     System.out.println("答案正确");
                                     y++;
                                     System.out.println("密码是：" + 2345);
                                     System.out.println("=====================================");
                                     System.out.println("神秘宝箱出现，请输入密码可获得");
                                     int psd = sc.nextInt();
                                     psd(psd,num);
                                 }else {
                                     System.out.println( "答案错误，你将退出试炼");
                                     break;
                                 }
                             }
                             break;
                         case 2:
                             System.out.println("这里是水之路，回答以下问题");
                             TestProblem t3 = water.testWay(t.gettName(),tp);
                             if(t3 != null){
                                 System.out.println(t3.getpDesprition());
                                 String answer = sc.next();
                                 int h2 = judge(answer,t3);
                                 if(h2 == 1){
                                     System.out.println("答案正确");
                                     y++;
                                     System.out.println("密码是：" + 3456);
                                     System.out.println("神秘宝箱出现，请输入密码可获得");
                                     int psd = sc.nextInt();
                                     psd(psd,num);
                                 }else {
                                     System.out.println( "答案错误，你将退出试炼");
                                     break;
                                 }
                             }
                             break;
                         case 3:
                             System.out.println("这里是火之路，回答以下问题");
                             TestProblem t4 = ftw.testWay(t.gettName(),tp);
                             if(t4 != null){
                                 System.out.println(t4.getpDesprition());
                                 String answer = sc.next();
                                 int h2 = judge(answer,t4);
                                 if(h2 == 1){
                                     System.out.println("答案正确");
                                     y++;
                                     System.out.println("密码是：" + 4567);
                                     System.out.println("=====================================");
                                     System.out.println("神秘宝箱出现，请输入密码可获得");
                                     int psd = sc.nextInt();
                                     psd(psd,num);
                                 }else {
                                     System.out.println( "答案错误，你将退出试炼");
                                     break;
                                 }
                             }
                             break;
                         case 4:
                             System.out.println("这里是土之路，回答以下问题");
                             TestProblem t5 = stw.testWay(t.gettName(),tp);
                             if(t5 != null){
                                 System.out.println(t5.getpDesprition());
                                 String answer = sc.next();
                                 int h2 = judge(answer,t5);
                                 if(h2 == 1){
                                     System.out.println("答案正确");
                                     y++;
                                     System.out.println("密码是：" + 5678);
                                     System.out.println("=====================================");
                                     System.out.println("神秘宝箱出现，请输入密码可获得");
                                     int psd = sc.nextInt();
                                     psd(psd,num);
                                 }else {
                                     System.out.println( "答案错误，你将退出试炼");
                                     break;
                                 }
                             }
                             break;
                         case 5:
                             System.out.println("此路为空之路，此行凶险非凡，你可不参加此次试炼，一旦参加，失败会失去天赋");
                             System.out.println("1.继续试炼  2.离开");
                             int x = sc.nextInt();
                             if(x == 1){
                                 TestProblem t6 = ktw.testWay(t.gettName(),tp);
                                 if(t6 != null){
                                     System.out.println(t6.getpDesprition());
                                     String as = sc.next();
                                     int h = ktw.kongTest(t.gettName(),tp,as,user,name);
                                     if(h == 1){
                                         System.out.println("试炼成功");
                                         y++;
                                         System.out.println("密码是：" + 6789);
                                         System.out.println("=====================================");
                                         System.out.println("神秘宝箱出现，请输入密码可获得");
                                         int psd = sc.nextInt();
                                         psd(psd,num);
                                     }else if(h == 2){
                                         System.out.println("答案错误，天赋已被消除,即将传送离开");
                                         break;
                                     }else {
                                         System.out.println("错误");
                                     }
                                 }
                             }
                             break;
                     }
                     //最终奖励
                     if(y != 0){
                         System.out.println("你现在可以参与终极挑战");
                         System.out.println("1:参与挑战   2：离开");
                         int b = sc.nextInt();
                         if(b == 1){
                             //控制循环
                             int c = 0;
                             //答对题数
                             int yes = 0;
                             while (c<3){
                                 for (int i = 0; i < tp.length; i++) {
                                     if(tp[i]!=null){
                                         int nu = r.nextInt(15);
                                         System.out.println(tp[nu].getpDesprition());
                                         String ans = sc.next();
                                         if(tp[nu].getAnswer().equals(ans)){
                                             System.out.println("回答正确");
                                             yes++;
                                             break;
                                         }
                                     }
                                 }
                                 c++;
                             }
                             if(yes!=0){
                                 System.out.println("恭喜你答对了"+yes+"题");
                                 ultimatePrize(yes,name);
                             }else {
                                 System.out.println("全部回答错误，没有奖励");
                             }

                         }
                     }

                     show(name);


                 }else {
                     show(name);
                     System.out.println("再见！");
                     break;
                 }

             }else {
                 show(name);
                 System.out.println("再见！");
                 break;
             }

         }else{
             show(name);
             System.out.println("你已测试过天赋，可直接上山游玩！");
         }
    }
    }

    /**
     * 检查用户是否进入过祈云山
     */
    public static int login(String name){
        for (int i = 0; i < user.length; i++) {
            if(user[i]!= null){
                if(user[i].getUName().equals(name)){
                    return 1;
                }
            }
        }
        return -1;
    }

    /**
     * 未进入祈云山的姓名存入数组
     * @return
     */
    public static int register(String name){
        int b = login(name);
        if(b==-1){
            for (int i = 0; i < user.length; i++) {
                if(user[i]==null){
                    Users u = new Users();
                    u.setUName(name);
                    user[i]= u;
                    return 1;
                }
            }
        }
        return -1;
    }
    /**
     * 测试天赋
     * @return
     */
    public static Talent test(){
        int x = (int) (Math.random()*6);
        return talent[x];
    }
    //将天赋和亲和力属性存入用户数组
    public static void add(Talent t,String name){
        for (int i = 0; i < user.length; i++) {
            if(user[i] != null){
                if(user[i].getUName().equals(name)){
                    Users u = new Users();
                    u.setTalent(t.gettName());
                    u.setAffinity(t.getAffinity());
                    u.setUName(name);
                    user[i] = u;
                }
            }
        }
    }
/**
 * 判断回答的答案是否正确
 */
public static int judge(String answer,TestProblem t){
    if(t.getAnswer().equals(answer)){
        return 1;
    }
        return -1;
    }

    /**
     * 开启宝箱输入密码
     * @param psd
     * @param num
     */
    public static void psd(int psd ,int num){
    switch (num){
        case 0:
            if(psd == 1234){
                System.out.println("密码正确");
            }else {
                System.out.println("密码错误");
            }
            break;
        case 1:
            if(psd == 2345){
                System.out.println("密码正确");
            }else {
                System.out.println("密码错误");
            }
            break;
        case 2:
            if(psd == 3456){
                System.out.println("密码正确");
            }else {
                System.out.println("密码错误");
            }
            break;
        case 3:
            if(psd == 4567){
                System.out.println("密码正确");
            }else {
                System.out.println("密码错误");
            }
            break;
        case 4:
            if(psd == 5678){
                System.out.println("密码正确");
            }else {
                System.out.println("密码错误");
            }
            break;
        case 5:
            if(psd ==6789){
                System.out.println("密码正确");
            }else {
                System.out.println("密码错误");
            }
            break;
    }
}
/**
 * 终极大奖
 */
public static void ultimatePrize(int yes,String name){
            for (int i = 0; i < rw.length; i++) {
                if(rw[i]!=null){
                    if(yes == rw[i].getrNum()){
                        for (int j = 0; j < user.length; j++) {
                           if(user[j] != null){
                               if(user[j].getUName().equals(name)){
                                   user[j].setLucky(rw[i].getLucky());
                                   user[j].setLevle(rw[i].getLevle());
                                   System.out.println("你的元素等级提升为："+user[j].getLevle()+"级"+"\t"+user[j].getLucky());
                               }
                           }
                        }
                    }
                }
            }
    }
    //展示用户信息
    public static void show(String name){
        for (int i = 0; i < user.length; i++) {
            if(user[i]!=null){
                if(user[i].getUName().equals(name)){
                    System.out.println("用户姓名："+user[i].getUName()+"\t"+"天赋："+user[i].getTalent()+"\t"
                    +"亲和力："+user[i].getAffinity()+"\t"+"天赋等级"+user[i].getLevle()+"\t"+"运气："+user[i].getLucky());
                }
            }
        }
    }

}

