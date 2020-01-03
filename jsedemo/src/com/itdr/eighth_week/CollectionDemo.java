package com.itdr.eighth_week;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        System.out.println("add:"+c.add("hello"));;
        c.add("hello");
        c.add("world");
        c.add("java");

        c.clear();

        System.out.println("remove:"+c.remove("hello"));
        System.out.println("remove:"+c.remove("javaee"));
        System.out.println("remove:"+c.contains("hello"));
        System.out.println("remove:"+c.contains("android"));
        System.out.println("isEmpty:"+c.size());
        System.out.println("c:"+ c);
    }
}
class CollectionDemo2{
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        Collection c2 = new ArrayList();
        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");
        System.out.println("==========================================");
        System.out.println("addAll:"+((ArrayList) c1).addAll(c2));
        System.out.println("addAll:"+((ArrayList) c1).removeAll(c2));
        System.out.println("addAll:"+((ArrayList) c1).containsAll(c2));
        System.out.println("addAll:"+((ArrayList) c1).retainAll(c2));
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
    }
}
class CollectionDemo3{
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");
        Object[] objs = c.toArray();
        for (int x = 0; x < objs.length; x++) {
            System.out.println(objs[x]);
//            System.out.println(objs[x] +"-----"+objs[x].length);
            String s = (String) objs[x];
            System.out.println(s+"-----"+s.length());
        }
    }
}
