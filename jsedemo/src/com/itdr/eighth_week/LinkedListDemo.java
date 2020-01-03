package com.itdr.eighth_week;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList link= new LinkedList();
        link.add("hello");
        link.add("world");
        link.add("java");

        link.addFirst("javaee");
        link.addLast("android");

        System.out.println("getFirst:"+link.getFirst());
        System.out.println("getLast:"+link.getLast());
        System.out.println("removeFirst:"+link.removeFirst());
        System.out.println("removeLast:"+link.removeLast());
        System.out.println("link:"+link);


    }
}
