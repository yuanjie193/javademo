package com.itdr.games.auctionhouse.service;

import com.itdr.games.auctionhouse.dao.LotsDao;
import com.itdr.games.auctionhouse.pojo.Lots;

public class LotsService {
    LotsDao ld = new LotsDao();
 //查看商品详细信息
 public String goodsDetails(int num){
     String gd = ld.goodsDetails(num);
     if(gd==null){
         return "没有此商品,请重新确认商品序号";
     }
     return gd;
 }
    //搜索拍卖品
    public String search(String name){
      String s =ld.search(name);
        if(s == null){
            return "没有此商品,请重新确认商品名称";
        }
        return s;
    }

}
