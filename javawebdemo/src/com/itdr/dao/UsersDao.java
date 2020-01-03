package com.itdr.dao;

import com.itdr.pojo.Users;
import com.itdr.utils.JDBCUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import jdk.nashorn.internal.scripts.JD;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.*;


public class UsersDao {
   static QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
    //增删改查
    public Users selectByUsername(String username) {
      //原始查询
      Users u =null;
    /*  try {
      Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/hh";
      String root = "root";
      String password = "hqb666@$";
      Connection connection = DriverManager.getConnection(url, root, password);
      String sql = "select * from hui where username = ?";
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1,username);
      ResultSet resultSet = preparedStatement.executeQuery();
      while(resultSet.next()){
            u = new Users();
            u.setId(resultSet.getInt(1));
//            u.setUsername(resultSet.getString(2));
            u.setUsername(resultSet.getString("username"));
            u.setPassword(resultSet.getString("password"));
//           u.setPassword(resultSet.getString(3));
        }
      } catch (Exception e ){
          System.out.println("输出错误");
          e.printStackTrace();
      }*/
    //使用dbutils查询数据
        String sql = "select * from hui where username = ?";
        try {
            qr.query(sql,new BeanHandler<Users>(Users.class),username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
    public int insertByUsernameAndPassword2(String username,String password){
        //插入数据：获取连接，调用封装好的获取连接方法
        int i = 0;
        try {
            Connection connection =  JDBCUtil.getCon2();
            String sql= "insert into hui values(null,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    public int insertByUsernameAndPassword(String username,String password){
        //插入数据：使用dbutils来简化增删改查
        int i =0;
        String sql= "insert into hui values(null,?,?)";
        try {
             i = qr.update(sql, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
