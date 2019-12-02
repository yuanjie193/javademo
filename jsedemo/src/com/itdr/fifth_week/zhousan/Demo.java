package com.itdr.fifth_week.zhousan;

public class Demo {

}
class Father {
    public Father (String name){
        System.out.println("Father的带参构造方法");
    }
}
class Son extends Father {
    public Son(){
        super("随便给");
        System.out.println("Son的无参构造方法");
    }
    public Son(String name){
        this();
        System.out.println("Son的带参构造方法");
    }
}
class ExtendDemo1 {
    public static void main(String[] args) {
        Son s=new Son();
        System.out.println("----------------------");
        Son ss =new Son("随便给");
    }
}