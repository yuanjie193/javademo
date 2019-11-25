package com.itdr.zhouce;
//import java.util.Scanner;
public class Test15 {
    public static void main(String[] args) {
        char today='日';
       /* Scanner sa = new Scanner (System.in);
        int b = sa.nextInt();*/
        /*if(today=='日'){
            System.out.println("吃主席套餐");
            return;
        }*/
        switch (today){
            case '一' :
                System.out.println("吃包子");
                break;
             case '二':
                 System.out.println("吃油条");
                 break;
            case '三' :
                System.out.println("吃包子");
            case '四':
                System.out.println("吃油条");
            case '五' :
                System.out.println("吃包子");
            case '六':
                System.out.println("吃油条");
            case '日':
                  System.out.println("吃主席套餐");
              break;
        }

    }
}
