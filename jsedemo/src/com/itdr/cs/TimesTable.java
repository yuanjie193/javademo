package com.itdr.cs;
// 九九乘法表
public class TimesTable {
    public static void main(String [] args){
        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=i;j++){
                int cj =i*j;
                System.out.print(i+ "* "+ j + "=" + cj+"\t");
            }
            System.out.println();
        }
    }
}
