package com.itdr.fifth_week.zhousan;

public class Demo2 {

}
class Phone{
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
}
class NewPhone extends Phone{
    public void call(String name){
        super.call(name);
        System.out.println("可以听天气预报");
    }
}