package com.itdr.fifth_week.zhouer;

public class Demo2 {
  public  void show(){
      System.out.println("我是爷爷");
  }

}
class Father extends  Demo2{
    public void method(){
        System.out.println("我是老子");
    }
}
class Son extends Father1 {

}
class ExtendsDemo2{
    public static void main(String[] args) {
        Son s =new Son();
        s.method();
        s.show();
    }
}