package com.itdr;

import com.mysql.jdbc.Driver;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    static {
//            Class.forName("com.mysql.jdbc.Driver");
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     *对外提供连接对象
     */
    public static Connection getCon(String url,String user,String password) throws SQLException {
        Connection connection = DriverManager.getConnection(url,user,password);
         return connection;
    }
    /**
     *关闭
     */
    public static  void closeAll(Connection con,Statement st,ResultSet rs) throws SQLException {
        rs.close();
        st.close();
        con.close();
    }
}
