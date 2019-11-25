package com.itdr.zhouwu.Games.pojo;

public class BlueRune extends Epigraph{
    private String adHurt;//物理攻击力
    private String apHurt;//法术攻击力
    private String adSpeed;//攻速
    private  String maxHp;//最大生命值
    private  String hfHP;//回血
    private  String speed;//移速
    private  String pbs;//物理吸血
    private  String sbs;//法术吸血
    private  String adDefence;//物理防御
    private  String apDefence;//法术防御
    private  String crit;//暴击
    //物理攻击力
    public void setAdHurt(String adHurt) {
        this.adHurt = adHurt;
    }
    public String getAdHurt() {
        return this.adHurt;
    }
    //法术攻击力
    public void setApHurt(String apHurt) {
        this.apHurt = apHurt;
    }
    public String getApHurt() {
        return this.apHurt;
    }
    //攻速
    public void setAdSpeed(String adSpeed) {
        this.adSpeed = adSpeed;
    }
    public String getAdSpeed() {
        return this.adSpeed;
    }
    //最大生命值
    public void setMaxHp(String maxHp) {
        this.maxHp = maxHp;
    }
    public String getMaxHp() {
        return this.maxHp;
    }
    //回复
    public void setHfHP(String hfHP) {
        this.hfHP = hfHP;
    }
    public String getHfHP() {
        return this.hfHP;
    }

}
