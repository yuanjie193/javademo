package com.itdr.cs;
import java.util.Scanner;
//平行四边形
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行");
        int height =sc.nextInt();
        System.out.println("请输入列");
        int width = sc.nextInt();
        px(height,width);
    }
    public static void px (int h,int lie ){
           int c = h;
           int z =h + lie ;
        for(int i =1;i<=h;i++){
            for(int j =1;j<=z;j++){
                if(j<=c){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            z -- ;
            System.out.println();
            c--;
            }

        }
    }

