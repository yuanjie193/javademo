package com.itdr.zhouwu.Games.pojo;

public class Epigraph {
   protected String ename;//名字
   protected String category;//类型
   protected String level;//等级
   protected String color;//颜色

    //第一个
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getEname() {
        return this.ename;
    }
    //第二个
    public void setLevel(String level) {
        this.level = level;
    }
    public String getLevel(){
        return this.level;
    }
    //第三个
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    //第四个
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return this.category;
    }
//    打印
    public  void  setEpigraph(Epigraph e){
        System.out.println("符文姓名："+this.getEname()+"符文颜色"+this.getColor()+"符文等级"+this.getLevel()+"符文类型"+this.getCategory());
    }

}
