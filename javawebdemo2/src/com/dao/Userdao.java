package com.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.pojo.Users;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import java.sql.SQLException;

public class Userdao {
    //检查是否有数据
    static QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
    public Users selectByUsername(String username) {
        Users u = null;
        String sql = "select * from hui where username = ?";
        try {
            u = qr.query(sql, new BeanHandler<Users>(Users.class), username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
    //插入用户数据
    public int insertByUsernameAndPassword2(String username,String password){
        int i = 0;
        String sql= "insert into hui values(null,?,?)";
        try {
            i = qr.update(sql,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
