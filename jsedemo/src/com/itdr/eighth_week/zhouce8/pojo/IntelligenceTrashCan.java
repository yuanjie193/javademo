package com.itdr.eighth_week.zhouce8.pojo;

/**
 * 智能垃圾桶
 */
public class IntelligenceTrashCan extends TrashCan implements Speech {
    @Override
    public void handle() { }
    public static void handleTrash(Trash trash,TrashCan [] tc,String name,User[] u) {
        System.out.println("你是什么垃圾？");
        System.out.println( "垃圾的类型是："+trash.getCategory()+"危害度为："+trash.getWhd()+trash.getDescription());
        for (int i = 0; i < tc.length; i++) {
            if(tc[i]!=null){
                if(trash.getCategory().equals(tc[i].gettCategory())){
                    for (int j = 0; j < u.length; j++) {
                        if(u[j]!=null){
                            if(u[j].getuName().equals(name)){
                                tc[i].setNum(tc[i].getNum()+1);
                                int h = tc[i].getCapacity()-1;
                                tc[i].setCapacity(h);
                                u[j].setJf(u[j].getJf()+1);
                                System.out.println(tc[i].gettCategory()+"的容量目前为："+ tc[i].getCapacity());
                                System.out.println("分类成功，积分+1，当前积分为："+u[j].getJf());
                            }
                        }
                    }
                }
            }
        }
    }
    @Override
    public  void speech() {

    }
}
