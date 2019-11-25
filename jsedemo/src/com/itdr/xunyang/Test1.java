package com.itdr.xunyang;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Test1 {

    public static void main(String[] args) {
        //    初始化
        Scanner sc =new Scanner(System.in);
        MenPai[] arr =new MenPai[20];
        LingShou[] ls =new LingShou[20];

//       创造灵兽
        LingShou d =new LingShou("朱雀","火","5","会喷火苗");
        ls[0]=d;
        LingShou d2 =new LingShou("囚牛","火","5","会发射火球");
        ls[1]=d2;
        LingShou d3 =new LingShou("玄武","土","7","会丢石头");
        ls[2]=d3;
        LingShou d4 =new LingShou("嘲风","土","7","会垒石头");
        ls[3]=d4;
        LingShou d5 =new LingShou("青龙","水","8","会喷水");
        ls[4]=d5;
        LingShou d6 =new LingShou("睚眦","水","8","会发射水枪");
        ls[5]=d6;
        LingShou d7 =new LingShou("白虎","金","6","会造金子");
        ls[6]=d7;
        LingShou d8 =new LingShou("狴犴","金","6","会造金元宝");
        ls[7]=d8;
        LingShou d9 =new LingShou("女娲","木","7","会种树");
        ls[8]=d9;
        LingShou d10 =new LingShou("饕餮","木","7","会养树");
        ls[9]=d10;
       /* LingShou d =new LingShou("朱雀","火","5","会喷火");
        ls[0]=d;
        LingShou d2 =new LingShou("囚牛","火","5","会喷火");
        ls[1]=d2;
        LingShou d3 =new LingShou("玄武","土","7","会喷火");
        ls2[0]=d3;
        LingShou d4 =new LingShou("嘲风","土","7","会喷火");
        ls2[1]=d4;
        LingShou d5 =new LingShou("青龙","水","8","会喷火");
        ls3[0]=d5;
        LingShou d6 =new LingShou("睚眦","水","8","会喷火");
        ls3[1]=d6;
        LingShou d7 =new LingShou("白虎","金","6","会喷火");
        ls4[0]=d7;
        LingShou d8 =new LingShou("狴犴","金","6","会喷火");
        ls4[1]=d8;
        LingShou d9 =new LingShou("女娲","木","7","会喷火");
        ls5[0]=d9;
        LingShou d10 =new LingShou("女娲","木","7","会喷火");
        ls5[1]=d10;*/
//    开始注册
        System.out.println("欢迎到达灵境入口");
        System.out.println("请输入你的姓名");
        String mname=sc.next();
        System.out.println("请输入你的门派");
        String mpb=sc.next();
        System.out.println("请输入你的性别");
        String msex=sc.next();
        System.out.println("请输入你的年龄");
        int mage= sc.nextInt();
        int n=login(mname,mpb,msex,mage,arr);
        if(n==1){
            System.out.println("你可以进入灵境");
        }else if(n==-2){
            System.out.println("你的年龄不能进入");
            return;
        }else{
            System.out.println("很抱歉，门派人数已到达上限");
        }
//        选择想要的灵兽类型
        System.out.println("--------------------------");
        System.out.println("请选择你想要的灵兽属性");
        System.out.println("按照对应序号进行选择:"+"金\t"+"木\t"+"水\t"+"火\t"+"土\t");
        String sx =sc.next();
        lssx(sx,ls);
//选择想要的灵兽
        /*System.out.println("请选择你想要的灵兽姓名");
        String xz =sc.next();
        System.out.println("你需要回答问题，回答正确即可获得灵兽离开");
        System.out.println("请猜测这只灵兽的随机能力值是多少");*/
//        int nlz =sc.nextInt();
//        int a=xzls(xz,nlz,ls);
        int number =1;
        while(number==1){
            System.out.println("---------------------------------");
            System.out.println("请选择你想要的灵兽姓名");
            String xz =sc.next();
            System.out.println("你需要回答问题，回答正确即可获得灵兽离开");
            System.out.println("请问1+1=？");
            int da =sc.nextInt();
            int a=xzls(xz,da,ls);
            if(a==1){
                System.out.println("回答正确，你可以带走这只灵兽");
                double z = Math.random()*10;
                Long m = Math.round(z);
                System.out.println("你选择的灵兽将随机添加能力值"+m);
                System.out.println("请带着你的灵兽离开灵境");
                break;
            }else{
                System.out.println("输入的数字不正确，请重新输入");
                System.out.println("还需要再继重新挑选么，重新挑选选择1，放弃输入其它数字");
                int nu =sc.nextInt();
                number =nu;
                if(number==1){
                    System.out.println("请继续游戏");
                }else{
                    System.out.println("下次再见");
                }
            }
        }
    }
    public static int login(String mname,String mpb,String msex,int mage,MenPai[] dl){
            MenPai m =new MenPai();
            m.mname=mname;
            m.mpb=mpb;
            m.msex=msex;
            m.mage=mage;
           int number=0;
//           判断年龄是否符合
           if(mage<10 || mage>30){
            return -2;
          }else {
               for (int i = 0; i < dl.length; i++) {
                   if (dl[i] != null) {
                       //判断门派是否有十人参加
                       if (dl[i].mpb.equals(mpb)){
                           number++;
                       }
                   }
               }
           }
                if(number<=10) {
                    for (int i = 0; i < dl.length; i++) {
                        if (dl[i] == null) {
                            dl[i] = m;
                            return 1;
                        }
                    }
                }return -1;

    }
//挑选灵兽
    public static void lssx(String sx,LingShou[] ls) {
        for(int i=0;i<ls.length;i++){
            if(ls[i]!=null){
                if(ls[i].lsx.equals(sx)){
                    System.out.println("灵兽名字："+ls[i].lname+"\t"+"灵兽属性："+ls[i].lsx+"\t"+"灵兽能力值："+ls[i].lnl+"\t"+"灵兽独有技能："+ls[i].ljn);
                    switch (ls[i].lnl){
                        case "0":
                            System.out.println("该灵兽的等级为："+"一般");
                            break;
                        case "1":
                            System.out.println("该灵兽的等级为："+"一般");
                            break;
                        case "2":
                            System.out.println("该灵兽的等级为："+"一般");
                            break;
                        case "3":
                            System.out.println("该灵兽的等级为："+"一般");
                            break;
                        case "4":
                            System.out.println("该灵兽的等级为："+"中等");
                            break;
                        case "5":
                            System.out.println("该灵兽的等级为："+"中等");
                            break;
                        case "6":
                            System.out.println("该灵兽的等级为："+"中等");
                            break;
                        case "7":
                            System.out.println("该灵兽的等级为："+"优秀");
                            break;
                        case "8":
                            System.out.println("该灵兽的等级为："+"优秀");
                            break;
                        case "9":
                            System.out.println("该灵兽的等级为："+"优秀");
                            break;
                        case "10":
                            System.out.println("该灵兽的等级为："+"极品");
                            break;
                    }
                }
            }

        }
    }
//    选择想要的灵兽回答问题
    public static int xzls(String lname,int da,LingShou[] ls){
        for(int i=0;i<ls.length;i++){
            if(ls[i]!=null){
                if(ls[i].lname.equals(lname)){
//                    int da2=2;
//                    double d = Math.random()*10;
//                    Long m = Math.round(d);
                    if(da==2){
                        return 1;
                    }else{
                        return -1;
                    }

                }
            }
        }return -1;

    }
}
