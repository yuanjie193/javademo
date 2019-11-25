package com.itdr.demo2;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m=1;
        while(m==1){
            int a =sc.nextInt();
            if(a==1 || a==2){
                System.out.println("这是一个素数");
            }else{
                int num =0;
                for(int i=1;i<=a;i++){
                    if(a%i==0){
                        num++;
                    }
                }
                if(num==2){
                    System.out.println("这是一个素数");
                }else{
                    System.out.println("这不是一个素数");
                }

            }
        }


    }
}
