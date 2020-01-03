package com.itdr;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class PoolDemo {
    //创建一个链接池
    static ArrayList<Connection> li = new ArrayList<>();
    //生成连接
    static {
        for (int i = 0; i <5 ; i++) {
            try {
                li.add(JDBCUtil2.getCon());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //通过静态连接池获取连接
    public static Connection getCon(){
        Connection remove = null;
        if(li.size() == 0){
            for (int i = 0; i <5 ; i++) {
                try {
                    li.add(JDBCUtil2.getCon());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        for (int i = 0; i < li.size(); i++) {
            remove = li.remove(i);
            break;
        }
        return  remove;
    }
    //归还连接到来连接池
    public static void addBack(Connection con){
        li.add(con);
    }
}
