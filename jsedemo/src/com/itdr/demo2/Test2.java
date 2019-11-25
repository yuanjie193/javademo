package com.itdr.demo2;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a =sc.nextInt();
        System.out.println("请输入第二个数");
        int b =sc.nextInt();
             int x= jf(a,b);
        System.out.println("它们的和是"+x);
        jf2(a,b);
        cj(a,b);
        s(a,b);
        qm(a,b);

    }
    public static int jf(int a,int b){
        int c =a+b;
        return c;
//        System.out.println("它们的和是"+c);
    }
    public static void jf2(int a,int b){
        int c =a-b;
        System.out.println("它们的差是"+c);
    }
    public static void cj(int a,int b){
        int c =a*b;
        System.out.println("它们的积是"+c);
    }
    public static void s(int a,int b){
        int c =a/b;
        System.out.println("它们的商是"+c);
    }
    public static void qm(int a,int b){
        int c =a%b;
        System.out.println("它们的取模是"+c);
    }
}
