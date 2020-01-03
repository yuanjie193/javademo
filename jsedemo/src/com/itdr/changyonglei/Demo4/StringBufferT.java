package com.itdr.changyonglei.Demo4;
import java.util.Scanner;
public class StringBufferT {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入：");
        String s=sc.nextLine();
        String s1=myReverse(s);
        System.out.println(s1);
        String s2=myReverse2(s);
        System.out.println(s2);
    }

    private static String myReverse2(String s) {
        return new StringBuffer(s).reverse().toString();//倒叙
    }

    private static String myReverse(String s) {
        String result="";
        char[] chs=s.toCharArray();
        for (int x = chs.length-1; x >=0; x--) {
            result+=chs[x];
        }
        return result;//倒叙
    }
}
