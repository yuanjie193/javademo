package com.itdr.changyonglei;

import java.util.Arrays;

public class TestDemo {
    public static void main(String [] args){
        String str = "abcdescfdsascxsdc";
        String str2 = "    ab  c     ";
        String str3 = "abc";
        System.out.println(str.charAt(1));//根据下标找字符
        System.out.println(str.length());
        System.out.println(str2);
        System.out.println(str2.trim());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.startsWith("ac"));
        System.out.println(str.endsWith("dc"));
        System.out.println(str.substring(3,8));
        System.out.println(str.substring(3));
        System.out.println(str.lastIndexOf('c'));
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println("========================================");
        int [] a = {1,2,3};
        int [] b = Arrays.copyOf(a,5);
        System.out.println(Arrays.toString(b));
        int [] c = new int[10];
        System.arraycopy(a,0,c,0,3);
        System.out.println(Arrays.toString(c));
        int[] d = Arrays.copyOfRange(a,1,2);
        System.out.println(Arrays.toString(d));

    }


}
