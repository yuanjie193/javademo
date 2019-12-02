package com.itdr.fifth_week.zhouer;

public class Demo {
    public int sum(int a,int b){
        return a+b;
    }
}
class Student{
    public void show(){
        System.out.println("我爱学习");
    }

    }
    class StudentDemo{
        public  void method(Student1 s) {
            s.show();
        }
    }
    class ArgsTest{
        public static void main(String[] args) {
            Demo d=new Demo();
            int result=d.sum(10,20);
            System.out.println("result"+result);
            System.out.println("----------------------");
            StudentDemo sd=new StudentDemo();
            Student1 s =new Student1();
            sd.method(s);
        }
    }