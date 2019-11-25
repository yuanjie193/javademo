package com.itdr.zhouwu.Games.pojo;

public class GreenRune extends Epigraph {
    private String adHurt;//物理攻击力
    private String apHurt;//法术攻击力
    private String adSpeed;//攻速
    private String coolDown;//减冷却
    private  String maxHp;//最大生命值
    private  String adthough;//物理穿透
    private  String apthough;//法术穿透
    private  String adDefence;//物理防御
    private  String apDefence;//法术防御
    private  String crit;//暴击
    private  String hfHP;//回血
    private  String sbs;//法术吸血

    //减冷却

    public void setCoolDown(String coolDown) {
        this.coolDown = coolDown;
    }
    public String getCoolDown(){
        return this.coolDown;
    }
    //物理防御

    public void setAdDefence(String adDefence) {
        this.adDefence = adDefence;
    }

    public String getAdDefence() {
        return this.adDefence;
    }
    //法术防御

    public void setApDefence(String apDefence) {
        this.apDefence = apDefence;
    }

    public String getApDefence() {
        return this.apDefence;
    }
    //法术吸血

    public void setSbs(String sbs) {
        this.sbs = sbs;
    }

    public String getSbs() {
        return this.sbs;
    }
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
    //物理穿透
    public void setAdthough(String adthough) {
        this.adthough = adthough;
    }
    public String getAdthough() {
        return this.adthough;
    }
    //法术穿透
    public void setApthough(String apthough) {
        this.apthough = apthough;
    }
    public String getApthough() {
        return this.apthough;
    }
}
