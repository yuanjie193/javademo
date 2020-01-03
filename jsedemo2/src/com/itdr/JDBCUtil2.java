package com.itdr;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil2 {
    static String driverClass;
    static String url;
    static String user;
    static String password;
    static {
        Properties p = new Properties();
        //获取流
        InputStream in = JDBCUtil2.class.getClassLoader().getResourceAsStream("db.properties");
        //加载流
        try {
            p.load(in);
            //获取值
            driverClass = p.getProperty("driverClass");
            url = p.getProperty("url");
            user = p.getProperty("user");
            password = p.getProperty("password");
            Class.forName(driverClass);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private JDBCUtil2(){}
    /**
     *对外提供连接对象
     */
    public static Connection getCon( ) throws SQLException {
      Connection connection = DriverManager.getConnection(url,user,password);
        return  connection;
    }
    /**
     *查询关闭资源
     */
    public static  void closeAll(Connection con, Statement st, ResultSet rs) throws SQLException {
        closeResultSet(rs);
        closeStatement(st);
        closeConnection(con);
    }
    /**
     * 增删改关闭资源
     */
    public static  void closeAll(Connection con, Statement st) throws SQLException {
        closeStatement(st);
        closeConnection(con);
    }
    private static void closeConnection(Connection con){
        if(con !=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private static void closeStatement(Statement st){
        if(st !=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private static void closeResultSet(ResultSet rs){
        if(rs !=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
