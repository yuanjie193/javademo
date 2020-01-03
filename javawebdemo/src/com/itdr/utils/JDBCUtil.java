package com.itdr.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
   static String driverClass;
   static String url;
   static String user;
   static String  password;
   static {
       try {
           Properties properties = new Properties();
           InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
           properties.load(in);
           driverClass = properties.getProperty("driverClass");
           url = properties.getProperty("url");
           user = properties.getProperty("user");
           password = properties.getProperty("password");
           Class.forName(driverClass);
       }
       catch (Exception e) {
           System.out.println("错误");
           e.printStackTrace();
       }
   }
   public static Connection getCon() throws SQLException {
      Connection connection =  DriverManager.getConnection(url,user,password);
      return connection;
   }
   //使用c3p0 创建连接池
    public static Connection getCon2() throws SQLException {
        ComboPooledDataSource c = new ComboPooledDataSource();
        Connection connection = c.getConnection();
        return connection;
    }
}
