package com.itdr.eighth_week.zhouce8.pojo;
/**
 * 垃圾桶抽象类
 */
public abstract class TrashCan {
    public String tCName;//垃圾桶名
    public int  capacity;//容量
    public int num;//目前个数
    public String tCategory;//类型

    /**
     * 垃圾处理方法
     */
    public abstract void handle();

    public String gettCName() {
        return tCName;
    }

    public void settCName(String tCName) {
        this.tCName = tCName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String gettCategory() {
        return tCategory;
    }

    public void settCategory(String tCategory) {
        this.tCategory = tCategory;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
