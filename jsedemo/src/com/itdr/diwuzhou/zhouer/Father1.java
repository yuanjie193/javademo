package com.itdr.diwuzhou.zhouer;

public class Father1 {
    public int num=10;
    public int num2=20;
    public void method(){
        System.out.println(num);
        System.out.println(num2);

    }
    public void show(){
        System.out.println(num);
        System.out.println(num2);
    }
}
    class son extends Father1{
        public void function(){
            System.out.println(num);
            System.out.println(num2);
        }
 }
    class ExtendsDemo3{
        public static void main(String[] args) {
            Son s =new Son();
            s.show();
        }
    }