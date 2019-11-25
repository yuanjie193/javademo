package com.itdr.zhouce;

public class Test17 {
    public static void main(String[] args){
        int sum=0;
        int num =2;
        do{
            sum=sum+num;
            num=num+2;
        }while(num<52);
        System.out.println("50以内的偶数之和为："+sum);
    }
}
