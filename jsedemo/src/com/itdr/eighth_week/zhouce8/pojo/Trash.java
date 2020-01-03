package com.itdr.eighth_week.zhouce8.pojo;

/**
 * 创建垃圾抽象类
 */
public abstract class Trash {
    public String tName;//垃圾名
    public String category;//垃圾类型
    public String whd;//危害度
    public String description;//说明

    /**
     * 危害方法
     */
    public abstract void harm();

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWhd() {
        return whd;
    }

    public void setWhd(String whd) {
        this.whd = whd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
