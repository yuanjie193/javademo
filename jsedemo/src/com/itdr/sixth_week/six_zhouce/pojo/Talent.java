package com.itdr.sixth_week.six_zhouce.pojo;
//天赋类
public class Talent implements Affinity {
    String tName;
    String power;
    String Affinity;

    public String gettName() {
        return this.tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getAffinity() {
        return Affinity;
    }

    public void setAffinity(String affinity) {
        Affinity = affinity;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public  void affinity(String tname){
        if(tname.equals("金")){
            System.out.println("金元素亲和");
        }else if(tname.equals("木")){
            System.out.println("木元素亲和");
        }else if(tname.equals("水")){
            System.out.println("水元素亲和");
        }else if(tname.equals("火")){
            System.out.println("火元素亲和");
        }else if(tname.equals("土")){
            System.out.println("土元素亲和");
        }else {
            System.out.println("空元素亲和");
        }
    }
}
