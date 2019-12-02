package com.itdr.diwuzhou.zhousi.zhouce5;

import com.itdr.diwuzhou.zhousi.zhouce5.subclass.HomeCar;
import com.itdr.diwuzhou.zhousi.zhouce5.subclass.Taxi;

public class CarTest {
    public static void main(String[] args) {
        // 实例化2个父类对象
        Car c1=new Car("张小明","蓝色");
        Car c2=new Car("张小明","蓝色");
        Car.Use();//引用方法
        //比较两个对象
        boolean b = Car.bj(c1,c2);
        System.out.println("car1和car2的引用比较："+b);
        System.out.println("=============================================");
        Car c =new Taxi("张小明","蓝色","长生");
        ((Taxi) c).ride();
        //引用子类方法
        Taxi.Use();
        System.out.println("taxi的信息是："+c.toString());
        System.out.println("=============================================");
        Car sjc =new HomeCar("孙二娘","紫色",7);
        ((HomeCar) sjc).display();
        ((HomeCar) sjc).display(5);
        System.out.println("=============================================");
    }
}
