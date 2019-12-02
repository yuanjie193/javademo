package com.itdr.diwuzhou.zhousi.zhouce5.subclass;

import com.itdr.diwuzhou.zhousi.zhouce5.Car;

public final class  HomeCar extends Car {
    public int num;//载客数
    public HomeCar(String cname,String color,int num){
        super(cname,color);;
        this.num=num;
    }
    public  void display(){
        System.out.println(Cname+"拥有的"+Color+"颜色的私家车，有"+num+"个座位");
    }
    public  void display(int num){
        System.out.println("家用汽车大多有"+num+"个座位");
    }
}
