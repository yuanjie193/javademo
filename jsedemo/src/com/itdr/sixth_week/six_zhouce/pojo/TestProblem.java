package com.itdr.sixth_week.six_zhouce.pojo;
//测试问题类继承测试抽象类
public class TestProblem extends TestWay {

    @Override
    public void testWay() { }

    /**
     * 创建问题描述属性
     */
    private String pDesprition;
    /**
     * 创建答案属性
     */
    private String answer;

    /**
     * 创建存入和获取的方法
     */

    public String getpDesprition() {
        return pDesprition;
    }

    public void setpDesprition(String pDesprition) {
        this.pDesprition = pDesprition;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
