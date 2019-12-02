package com.itdr.fifth_week.zhousi.zhouce5.subclass;

import com.itdr.fifth_week.zhousi.zhouce5.Car;

//出租车
public class Taxi extends Car {
   private String Company;//所属公司


//    Car t=new taxi("张小泉","蓝色","长生公司");
    //调用父类构造方法
    public Taxi(String cname,String color,String Company){
        super(cname,color);
        this.Company=Company;
    }
    //创造方法
    public final void ride(){
        System.out.println(Cname+"的"+Color+"出租车是所属于在"+Company+"公司的");
    }
    public static void Use(){
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    public String toString(){
        String a= Cname+"拥有一辆"+Color+"出租车";
        return a;
    }

}
