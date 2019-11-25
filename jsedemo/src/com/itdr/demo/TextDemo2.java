package com.itdr.demo;
import java.util.Scanner;
public class TextDemo2 {
    public static void main (String[] args){
        Scanner sa = new Scanner (System.in);

        int b = sa.nextInt();
//        int b = sa.nextInt();
//        int c =(a > b ) ? a : b;
//        System.out.println(c);
//        判断输入的数字是星期几
       /* if(b%7==1){
            System.out.println("今天是星期一" );
        }
        if(b%7==2){
            System.out.println("今天是星期二");
        }
        if(b%7==3){
            System.out.println("今天是星期三");
        }
        if(b%7==4){
            System.out.println("今天是星期四");
        }
        if(b%7==6){
            System.out.println("今天是星期六");
        }
        if(b%7==0){
            System.out.println("今天是星期日");
        }*/
//       判断输入的月份是什么季节
        if(b>0&b<4){
                System.out.println("这个月份是春天");
        }
        if(b>3&b<7){
            System.out.println("这个月份是夏天");
        }
        if(b>6&b<10){
            System.out.println("这个月份是秋天");
        }
        if(b>9&b<=12){
            System.out.println("这个月份是冬天");
        }
    }
}
