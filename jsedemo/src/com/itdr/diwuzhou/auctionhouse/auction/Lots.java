package com.itdr.diwuzhou.auctionhouse.auction;

public class Lots {
    private String goodsID;//商品序号
    private String goodsPrice;//商品价格
    private String goodsNumber;//商品数目
    private String goodsName;//商品名称
    private String goodsDescription;//商品描述
    // 存入和输出商品名称
    public String getGoodsName() {
        return this.goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    // 存入和输出商品序号
    public String getGoodsID() {
        return this.goodsID;
    }
    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }
   // 存入和输出商品价格
    public String getGoodsPrice() {
        return this.goodsPrice;
    }
    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
    // 存入和输出商品数目
    public String getGoodsNumber() {
        return this.goodsNumber;
    }
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
    // 存入和输出商品描述
    public String getGoodsDescription() {
        return this.goodsDescription;
    }
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }
}
