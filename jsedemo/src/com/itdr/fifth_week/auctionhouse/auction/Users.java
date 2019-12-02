package com.itdr.fifth_week.auctionhouse.auction;

public class Users {
    private String userName;//用户名
    private String userPsd;//用户密码
    private int money;//用户金币
    private String level;//用户级别
    private String[] tBag;//百宝囊
    //存入和输出用户姓名
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }
    //存入和输出用户密码
    public void setUserPsd(String userPsd) {
        this.userPsd = userPsd;
    }
    public String getUserPsd() {
        return this.userPsd;
    }
    //存入和输出用户金币
    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return this.money;
    }
    //存入和输出用户级别
    public void setLevel(String level) {
        this.level = level;
    }
    public String getLevel() {
        return this.level;
    }
    //存入和输出用户拍卖品
    public void settBag(String[] tBag) {
        this.tBag = tBag;
    }
    public String[] gettBag() {
        return this.tBag;
    }
    //展示用户信息
    public static void show(String username,String psd,Users[] u){
        for (int i = 0; i < u.length; i++) {
            if(u[i]!=null){
                if(username.equals(u[i].getUserName()) && psd.equals(u[i].getUserPsd())){
                    System.out.println("======"+username+":当前身份级别是"+u[i].getLevel()+"\t"+"目前的金币是"+u[i].getMoney()+"======");

                }
            }
        }
    }
}
