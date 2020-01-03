package com.itdr.sixth_week.Mondy;

public class Test4 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s3 == s1+s2);
        System.out.println(s3.equals(s1+s2));

        System.out.println(s3 == "hello"+"world");
        System.out.println(s3.equals("hello"+"world"));

        System.out.println(s3 == "helloworld");
        System.out.println(s3. equals("helloworld"));
    }
}
