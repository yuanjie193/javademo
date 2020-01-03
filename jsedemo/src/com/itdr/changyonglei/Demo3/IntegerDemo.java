package com.itdr.changyonglei.Demo3;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(100));//返回int变量的二进制表示的字符
        System.out.println(Integer.toOctalString(100));//8进制
        System.out.println(Integer.toHexString(100));//16进制
        System.out.println(Integer.MAX_VALUE);//java int 类整数的最大值是 2 的 31 次方 - 1 = 2147483648 - 1 = 2147483647
        System.out.println(Integer.MIN_VALUE);
        System.out.println("--------------------");
        int i=100;
        Integer ii=new Integer(i);//整数
        System.out.println(ii);
        String s="100";
        String s2="abc";
        Integer iii=new Integer(s);
        System.out.println(iii);
//        Integer iii2=new Integer(s2);
      //  System.out.println(iii2);
        System.out.println("-----------------");
        int num=100;
        String s3=""+num;
        System.out.println(s3);

        String s4=String.valueOf(num);
        System.out.println(s4);

        Integer i2=new Integer(num);
        String s5=i2.toString();
        System.out.println(s5);

        String s6=Integer.toString(num);
        System.out.println(s6);
        System.out.println("-----------------");
        String S="100";
        Integer I=new Integer(S);
        int x=I.intValue();
        System.out.println(x);
        int y=Integer.parseInt(S);
        System.out.println(y);
        System.out.println("===================");
        Integer u=100;
        u+=200;
        System.out.println(u);

        Integer uu=null;
        if (uu!=null){
            uu+=1000;
            System.out.println(uu);
        }
        System.out.println("===================");
        Integer u1=new Integer(127);
        Integer u2=new Integer(127);
        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));
        System.out.println("--------------------");
        Integer u3=new Integer(128);
        Integer u4=new Integer(128);
        System.out.println(u3==u4);
        System.out.println(u3.equals(u4));
        System.out.println("-------------------------");
        Integer u5=128;
        Integer u6=128;
        System.out.println(u5==u6);
        System.out.println(u5.equals(u6));
        System.out.println("---------------------");
        Integer u7=127;
        Integer u8=127;
        System.out.println(u7==u8);
        System.out.println(u7.equals(u8));
        Integer ug=Integer.valueOf(127);
        System.out.println("----------------------");
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));
        System.out.println(Math.max(12,23));
        System.out.println(Math.max(Math.max(12,23),18));
        System.out.println(Math.max(Math.max(12,78),Math.max(34,56)));
        System.out.println("----------------------");
        System.out.println(Math.pow(2,3));
        System.out.println(Math.random());
        System.out.println(Math.random()*100+1);
        System.out.println((int)Math.random()*100+1);
        System.out.println(Math.round(12.34f));
        System.out.println(Math.round(12.56f));
        System.out.println(Math.sqrt(4));
        System.out.println("````````````````````````");
        Scanner sc=new Scanner(System.in);
        System.out.println("开始");
        int start=sc.nextInt();
        System.out.println("结束");
        int end=sc.nextInt();
        for (int z=0;z<100;z++){
            int number=getRandom(start,end);
            System.out.println(number);
        }
        System.out.println("-------------------------");
        Random r=new Random(1111);
        for (int x1=0;x1<10;x1++){//random函数返回一个0~num-1之间的随机数
            int n2=r.nextInt(100)+1;
            System.out.println(n2);
        }
        System.out.println("=========================");
        long st=System.currentTimeMillis();
        for (int f=0;f<1000;f++){
            System.out.println("HELLO"+f);
        }
        long en=System.currentTimeMillis();
        System.out.println("耗时"+(en-st)+"毫秒");
        System.out.println("------------------------------");
        int[] urr={11,22,33,44,55};
        int[] urr2={6,7,8,9,10};
        System.arraycopy(urr,1,urr2,2,2);
        System.out.println(Arrays.toString(urr));
        System.out.println(Arrays.toString(urr2));
        System.out.println("------------------------");
        Integer t=new Integer(100);
        System.out.println(t);
        System.out.println(Integer.MIN_VALUE);
        Integer tt=new Integer("2147483647");
        System.out.println(tt);
        Integer ttt=new Integer("2147483648");
        System.out.println(ttt);
        BigInteger bi=new BigInteger("2147483648");
       System.out.println(bi);
        System.out.println("------------------------");
        BigInteger bi1=new BigInteger("100");
        BigInteger bi2=new BigInteger("50");
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(bi2));
        BigInteger[] bis=bi1.divideAndRemainder(bi2);
        System.out.println("商："+bis[0]);
        System.out.println("余数："+bis[1]);
        System.out.println("--------------------------");
    }

    public static int getRandom(int start, int end) {
    int n=(int)(Math.random()*(end-start+1))+start;
    return n;
    }

}
