package com.itdr.diwuzhou.zhouwu;

public class Student {
    String Name;
    int Age;
    public Student(){

    }
    public Student(String name,int age){
            this.Name =name;
            this.Age =age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public Object clone(){

        return null;
    }
}
