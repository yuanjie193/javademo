package com.itdr.diwuzhou.zhouwu;

public class Demo {
}
abstract class Animal{
    private String name;
    private int age;
    public Animal(){}
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String GetName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}