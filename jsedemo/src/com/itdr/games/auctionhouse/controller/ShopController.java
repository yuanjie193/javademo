package com.itdr.games.auctionhouse.controller;

import com.itdr.games.auctionhouse.service.ShopService;

public class ShopController {
    ShopService ss = new ShopService();
    public void addGoods(String uname,int num){
        String goods = ss.addGoods(uname,num);
        System.out.println(goods);
    }
}
