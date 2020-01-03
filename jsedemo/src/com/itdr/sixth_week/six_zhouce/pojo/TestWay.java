package com.itdr.sixth_week.six_zhouce.pojo;
//测试抽象类
abstract class TestWay {
    //能力
   private String attribute;
    public abstract void testWay();
//    public abstract void testProblem();

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
