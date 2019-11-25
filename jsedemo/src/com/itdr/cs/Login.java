package com.itdr.cs;
import java.util.Scanner;
import java.util.Arrays;
public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        int um =sc.nextInt();
        int[] arr = new int[100];
        int b =dL(um,arr);
        if(b==1){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }
        System.out.println("---------------");
        System.out.println(Arrays.toString(arr));
    }
    public static  int dL(int uname,int[] arr){
//        判断输入数据是否合法
        if(uname<0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(arr[i]==uname){
                    return -1;
                }
            }else{
                arr[i]=uname;
                break;
            }
        }
        return 1;

    }
}
