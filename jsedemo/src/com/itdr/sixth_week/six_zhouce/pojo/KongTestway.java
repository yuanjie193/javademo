package com.itdr.sixth_week.six_zhouce.pojo;

import java.util.Random;

public class KongTestway extends TestWay implements SpecialEvents {
        String attribute = "空";
        Random r = new Random();
        public void testWay(){};

        public  TestProblem testWay(String talent,TestProblem[] tp){
            if(talent.equals(attribute)){
                System.out.println("属性相同，可直接通过此试炼之路");
            }else{
                for (int i = 0; i < tp.length; i++) {
                    if(tp[i] != null){
                            TestProblem t = tp[r.nextInt(15)];
                             return t;
                    }
                }
            }
            return null;
        }

    @Override
    public void kongTest() { }
    //空测试失败后天赋丢失
    public int  kongTest(String talent,TestProblem[] tp,String answer,Users[] u,String uName) {
        TestProblem t2 = testWay(talent,tp);
        if(t2.getAnswer().equals(answer)){
           return 1;
        }else {
            for (int i = 0; i < u.length; i++) {
                if(u[i]!=null){
                    if(u[i].getUName().equals(uName)){
                        u[i].setTalent(null);
                        return 2;
                    }
                }
            }
        }
        return -1;
    }
}
/* System.out.println("答案正确");
         int a  = (int)((Math.random()*8999)+1000);
         return a;*/
