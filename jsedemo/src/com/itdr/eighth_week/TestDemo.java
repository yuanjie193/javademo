package com.itdr.eighth_week;

import java.util.ArrayList;
import java.util.Iterator;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        Student s1 = new Student("武松",30);
        Student s2 = new Student("鲁智深",30);
        Student s3 = new Student("林冲",30);
        Student s4 = new Student("杨志",30);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        Iterator it = array.iterator();
        while (it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.getName()+"--------"
            +s.getAge());
        }
        System.out.println("--------------");

        for (int i = 0; i < array.size(); i++) {
           /* String s = (String)array.get(i);
            System.out.println(s);*/

            Student s8 =(Student) array.get(i);
            System.out.println(s8.getName()+"----------"+s8.getAge());
        }
    }

}
 class Test2 {
    public void add(Byte b) {
        b = b++;
    }
    public  void test() {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }

     public static void main(String[] args) {
         Test2 t = new Test2();
         t.test();
     }

}
class Student {
    String name;
    int age;
    public Student(){}
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Test4{
    public static void main(String[] args) {
        String str = "abcdebfdxcwwb";
        System.out.println(str.indexOf('b',4));
        System.out.println(str.substring(4,7));
    }
}
 class Test5 {
    public int a ;
   }