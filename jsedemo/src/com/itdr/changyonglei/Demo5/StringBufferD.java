package com.itdr.changyonglei.Demo5;

public class StringBufferD {
    public static void main(String[] S){
        StringBuffer sb=new StringBuffer();
        System.out.println(sb);
        System.out.println(sb.capacity());//返回string分配的存储容量
        System.out.println(sb.length());
        System.out.println("----------------");
        StringBuffer sb2=new StringBuffer(50);
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println("-----------------");
        StringBuffer sb3=new StringBuffer("hello");
        System.out.println(sb3);
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        System.out.println("------------Part2-------------");
        sb.append("hello").append(true).append(12).append(34.56);
        System.out.println(sb);
        sb.insert(5,"world");//world放到第五位（从0开始）
        System.out.println(sb);
        System.out.println("--------part3---------");
        StringBuffer sb5=new StringBuffer();
        sb5.append("hello").append("world").append("java");
        System.out.println(sb5);
        sb5.deleteCharAt(1);
        sb5.delete(5,10);
        sb5.delete(0,sb.length());//删除
        System.out.println(sb5);
        System.out.println("---------part4---------");
        StringBuffer sb6=new StringBuffer();
        sb6.append("hello");
        sb6.append("world");
        sb6.append("java");
        System.out.println(sb6);
        sb6.replace(5,10,"节日快乐");
        System.out.println(sb6);
        System.out.println("----------part5------------");
        StringBuffer sb4=new StringBuffer();
        sb4.append("bbxaw");
        System.out.println(sb4);
        sb4.reverse();//颠倒
        System.out.println(sb4);
        System.out.println("------------part6--------------");
        StringBuffer sb7=new StringBuffer();
        sb7.append("hello").append("world").append("java");
        System.out.println(sb7);
        String s=sb7.substring(5);
        System.out.println(s);
        System.out.println(sb7);
       // String ss=new sb7.substring(5,10);报错
        System.out.println("---------part7------------");
        int[] arr={44,33,55,11,22};
        String ss=arrayToString(arr);
        System.out.println(ss);
        String s2=arrayToString(arr);
        System.out.println(s2);
    }

   public static String arrayToString(int[] arr) {
    StringBuffer s8=new StringBuffer();
    s8.append("l");
    for (int x=0;x<arr.length;x++){
        if (x==arr.length-1){
            s8.append(arr[x]);
        }else {
            s8.append(arr[x]).append(",");
        }

    }
    return s8.toString();
    }
    public static String arrToStriing(int[] arr){
       String s2="";
       s2+="[";
       for (int x=0;x<arr.length;x++){
           if (x==arr.length-1){
               s2+=arr[x];
           }else {
               s2+=arr[x];
               s2+=",";
           }
       }
       s2+="]";
        return s2;
    }
}
