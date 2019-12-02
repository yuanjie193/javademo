package com.itdr.diwuzhou.zhousan;

public class Demo3 {
    static{
        System.out.println("静态代码块Fu");
    }
    {
        System.out.println("构造代码块");
    }
    public Demo3(){
        System.out.println("这是构造方法Fu");
    }
}

class Zi extends Demo3{
    static{
        System.out.println("静态代码块zi");
    }
    {
        System.out.println("构造代码块zi");
    }
    public Zi(){
        System.out.println("这是构造方法zi");
    }
}
class ExtendsDemo3{
    public static void main(String[] args) {
        Zi z =new Zi();
    }
}