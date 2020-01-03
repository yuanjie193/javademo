package com.itdr.sixth_week.six_zhouce.pojo;
//奖励类
public class Reward {
    String affinity;//元素亲和属性
    String lucky;//运气
    String levle;//实力等级
    int rNum;
    public String getAffinity() {
        return affinity;
    }
    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    public String getLucky() {
        return lucky;
    }

    public void setLucky(String lucky) {
        this.lucky = lucky;
    }

    public String getLevle() {
        return levle;
    }

    public void setLevle(String levle) {
        this.levle = levle;
    }

    public int getrNum() {
        return rNum;
    }

    public void setrNum(int rNum) {
        this.rNum = rNum;
    }
}
