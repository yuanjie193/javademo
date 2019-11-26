package com.itdr.diwuzhou.zhouer;

public class Demo3 {
    public int num =10;
}
class Son1 extends Demo3{
    public int num =20;
    public void show(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
class ExtendDomo3{
    public static void main(String[] args) {
        Son1 s=new Son1();
        s.show();
    }
}