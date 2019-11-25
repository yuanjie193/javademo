package com.itdr.demo;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {

        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        if (a % 7 == 1) {
            System.out.println("今天是星期一");
        }
        if (a % 7 == 2) {
            System.out.println("今天是星期二");
        }
        if (a % 7 == 3) {
            System.out.println("今天是星期三");
        }
        if (a % 7 == 4) {
            System.out.println("今天是星期四");
        }
        if (a % 7 == 6) {
            System.out.println("今天是星期六");
        }
        if (a % 7 == 0) {
            System.out.println("今天是星期日");
        }
    }
}
