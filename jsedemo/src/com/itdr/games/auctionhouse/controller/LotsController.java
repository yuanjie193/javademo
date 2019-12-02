package com.itdr.games.auctionhouse.controller;

import com.itdr.games.auctionhouse.dao.LotsDao;
import com.itdr.games.auctionhouse.service.LotsService;

public class LotsController {
    LotsService ls = new LotsService();
    //查看商品详细信息
    public void goodsDetails(int num){
        String s =ls.goodsDetails(num);
        System.out.println(s);
    }
    //搜索拍卖品
    public void  search(String name){
        String s =ls.search(name);
        System.out.println(s);
    }
}
