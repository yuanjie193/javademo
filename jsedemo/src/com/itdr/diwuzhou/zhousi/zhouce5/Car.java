package com.itdr.diwuzhou.zhousi.zhouce5;

public class Car {
    public String Color;
    public String Cname;
    //use构造方法
    public static void Use(){
        System.out.println("我是机动车！");
    }
//    有参构造方法
    public Car(String cname,String color){
        this.Color =color;
        this.Cname=cname;
    }
//判断
    public static boolean bj(Car a,Car b){
        if(a.Cname.equals(b.Cname) && a.Color.equals(b.Color) ){
            return true;
        }
        return false;
    }
    public String toString(){
        return null;
    }

}
