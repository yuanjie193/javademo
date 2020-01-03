package com.itdr.fifth_week.classroom_test;

public class Father2 {
    int age;
    public Father2(){
        System.out.println("这是父类的无参构造方法");
    }
    public Father2(String name){
        System.out.println("这是父类的有参构造方法");
    }
 }

class Son2 extends Father2{
    public Son2() {
        System.out.println("这是子类的无参构造");
    }

    public Son2(String name) {
        System.out.println("这是子类的有参构造");
    }
}
class ExtendsDemo6{
    public static void main(String[] args) {
        Son2 s = new Son2();
        System.out.println("==================");
        Son2 s2 = new Son2("小白");
    }
}
