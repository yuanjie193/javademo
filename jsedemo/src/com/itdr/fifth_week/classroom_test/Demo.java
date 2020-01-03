package com.itdr.fifth_week.classroom_test;

public class Demo {
    public   int num = 10;
    public void show(){
        System.out.println( num );
    }
    public void method(){
        System.out.println("method");
    }
    public void function(){
        method();
    }
}
class PrivateDemo{
    public static void main(String[] args) {
        Demo d =new Demo();
        System.out.println(d.num);
        d.show();
        d.method();
        d.function();
    }
}
