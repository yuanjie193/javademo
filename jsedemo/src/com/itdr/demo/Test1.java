package com.itdr.demo;
import java.net.SocketTimeoutException;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("这是偶数");
        }else{
            System.out.println("这是奇数");
        }
    }

}
