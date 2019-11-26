package com.itdr.diwuzhou.zhouer;

public class Test3 {
    int nus =10;
    int num;
    public void show(){
        int num2=20;
        int num3=30;
        System.out.println(num2);
        System.out.println(num3);
        int num=100;
        System.out.println(num);
    }

}
class VariableDemo{
    public static void main(String[] args) {
        Test3 v = new Test3();
        System.out.println(v.num);
        v.show();
    }
}