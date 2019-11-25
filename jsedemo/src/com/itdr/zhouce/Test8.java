package com.itdr.zhouce;
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        int b = sa.nextInt();
//        int num = 999;
        int count = 0;
         if ((b / 100000000) < 10 & (b / 100000000) > 0) {
            System.out.println("它是个9位数的数");
        } else if ((b / 10000000) < 10 & (b / 10000000) > 0) {
            System.out.println("它是个8位数的数");
        } else if ((b / 1000000) < 10 & (b / 1000000) > 0) {
            System.out.println("它是个7位数的数");
        } else if ((b / 100000) < 10 & (b / 100000) > 0) {
            System.out.println("它是个6位数的数");
        } else if ((b / 10000) < 10 & (b / 10000) > 0) {
            System.out.println("它是个5位数的数");
        } else if ((b / 1000) < 10 & (b / 1000) > 0) {
            System.out.println("它是个4位数的数");
        } else if ((b / 100) < 10 & (b / 100) > 0) {
            System.out.println("它是个3位数的数");
        } else if ((b / 10) < 10 & (b / 10) > 0) {
            System.out.println("它是个2位数的数");
        } else {
            System.out.println("它是个1位数的数");
        }
    }
    }

