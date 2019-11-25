package com.itdr.demo3;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
//程序准备
        Scanner sc =new Scanner(System.in);

//开店准备
        Shop a1 =new Shop();//创建对象
        Shop a2 =new Shop();
        Shop a3 =new Shop();
        a1.name ="外套";
        a1.color="红色";
        a2.name ="裤子";
        a2.color="黑色";
        a3.name ="毛衣";
        a3.color="粉色";
        System.out.println();
        Shop [] arr =new Shop [3];
        arr[0]=a1;
        arr[1]=a2;
        arr[2]=a3;
        System.out.println("===================");
        System.out.println("欢迎光临辉辉服装厂");
        System.out.println("以下商品您看看有没有喜欢的");
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                System.out.println("商品序号:"+i+"\t"+"商品名称："+arr[i].name +"\t"+"商品颜色:"+arr[i].color);
            }
        }
        System.out.println("请选择喜欢的衣服序号");
        int number =sc.nextInt();
        if(number<arr.length &&  number>=0){
            System.out.println("这是您选购的商品:"+"商品名称："+arr[number].name+"\t" +"商品颜色:"+arr[number].color);
            System.out.println("请结账！！");
        }else{
            System.out.println("您选择的商品目前未进货");
        }
    }
}
