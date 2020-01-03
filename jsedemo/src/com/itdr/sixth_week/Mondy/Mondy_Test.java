package com.itdr.sixth_week.Mondy;
import java.util.Scanner;
import java.util.Arrays;
public class Mondy_Test {
    int[] a =new int[10];
   static String[] b =new String[10];
    double [] c = new double[10];
    boolean[] d = new boolean[10];

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入");
        while (sc.hasNext()){
            String h = sc.nextLine();
            for (int i = 0; i < b.length; i++) {
                if(b[i]!= null){
                    b[i]=h;
                }
            }
        }

        for (int j = 0; j < b.length; j++) {
            if(b[j] != null){

            }
        }
    }


}
