package com.itdr.zhouwu.Games.pojo;

public class OrangeRune extends Epigraph{
    private String adHurt;//物理攻击力
    private String apHurt;//法术攻击力
    private String adSpeed;//攻速
    private  String crit;//暴击
    private  String critEffect;//暴击效果
    private  String adthough;//物理穿透
    private  String apthough;//法术穿透
    private  String pbs;//物理吸血
    private  String maxHp;//最大生命值
    private  String hfHP;//回血
    //暴击
    public void setCrit(String crit) {
        this.crit = crit;
    }
    public String getCrit() {
        return this.crit;
    }
    //暴击效果

    public void setCritEffect(String critEffect) {
        this.critEffect = critEffect;
    }

    public String getCritEffect() {
        return this.critEffect;
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
