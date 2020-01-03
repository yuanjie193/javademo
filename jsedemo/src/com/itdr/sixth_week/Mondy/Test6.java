package com.itdr.sixth_week.Mondy;
import java.util.Scanner;
public class Test6 {
    static  int[] ss = new int[20];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            System.out.println("请输入一个最小值");
            int min = sc.nextInt();
            System.out.println("请输入一个最大值");
            int max = sc.nextInt();
            sxh(max, min);
    }
    public static void sxh(int max, int min){
        int h = 0;
        for (int i = 100; i < 1000; i++) {
            int m = i/100;
            int n =(i%100)/10;
            int z =(i%100)%10;
            if(i==((m*m*m)+(n*n*n)+(z*z*z))){
                if(min <= i && i<= max){
                    for (int j = 0; j < ss.length; j++) {
                        if(ss[j]== 0){
                            ss[j]=i;
                             h++;
                            break;
                        }
                    }
                }
                }
            }
            if(h==0){
                System.out.println("no");
            }
        for (int i = 0; i < ss.length-1; i++) {
            for (int j = 1; j <ss.length ; j++) {
                if(ss[i] < ss[j]){
                    int ss2=0;
                    ss2 = ss[j];
                    ss[j]=ss[i];
                    ss[j] = ss2;
                }
            }

        }
        for (int i = 0; i <ss.length ; i++) {
            if(ss[i] != 0){
                System.out.print(ss[i]+"\t");
            }

        }

    }

}
