package com.itdr.changyonglei.Demo1;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.hashCode());
        System.out.println(s.getClass().getName());
        System.out.println("----------");
        System.out.println(s.toString());
        System.out.println("--------------");

        System.out.println(s.getClass().getName()+'@'
        + Integer.toHexString(s.hashCode()));

        System.out.println(s.toString());

        System.out.println(s);
    }
}

