package com.itdr.sixth_week.Mondy;

public class TestDemo7 {
    public static void main(String[] args) {
        String s ="JavaSE";
        byte[] bys = s.getBytes();
        for(int x = 0 ; x < bys.length ;x++){
            System.out.println(bys[x]);
    }
   char[] chs = s.toCharArray();
        for (int x = 0; x < chs.length; x++) {
            System.out.println(chs[x]);
        }
        String ss =String.valueOf(chs);
        System.out.println(ss);

        int i =100;
        String sss =String.valueOf(i);
        System.out.println(sss);

        System.out.println("toLowerCase:"+s.toLowerCase());
        System.out.println("s:"+s);
        System.out.println("toUpperCase:"+s.toUpperCase());


        String s1 = "hello";
        String s2 = "world";
        String s3 = s1+ s2;
        String s4 = s1.concat(s2);
        System.out.println("s3:"+s3);
        System.out.println("s4:"+s4);
        System.out.println(s3 == s4);

    }
}
