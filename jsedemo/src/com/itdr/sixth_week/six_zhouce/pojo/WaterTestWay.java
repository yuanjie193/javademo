package com.itdr.sixth_week.six_zhouce.pojo;

import java.util.Random;

public class WaterTestWay extends TestWay {
    String attribute = "水";
    Random r = new Random();
    public void testWay(){};
    public  TestProblem testWay(String talent,TestProblem[] tp){
        if(talent.equals(attribute)){
            System.out.println("属性相同，可直接通过此试炼之路");
        }else{
            for (int i = 0; i < tp.length; i++) {
                if(tp[i]!=null){
                    if(tp[i].getAttribute().equals(attribute)){
                        TestProblem t = tp[r.nextInt(3)+6];
                        return t;
                    }
                }
            }
        }
        return null;
    }
}
