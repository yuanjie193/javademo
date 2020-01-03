package com.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getcon() throws SQLException {
        ComboPooledDataSource c = new ComboPooledDataSource();
        Connection connection = c.getConnection();
        return connection;
    }
}
