package com.itdr.diwuzhou.zhouer;

public class Test1 {
    static {
        System.out.println("我是静态代码块");
    }
    {
        System.out.println("构造代码块");
    }
    public Test1(){
        System.out.println("构造方法");
    }

}

