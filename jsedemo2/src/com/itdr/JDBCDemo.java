package com.itdr;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {

        try {
            //        1）注册驱动
            //            Class.forName("com.mysql.jdbc.Driver");
            //        2）建立连接
            //        根据数据库地址，用户名，密码创建连接

            //            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/huihui",
            ////                    "root",
////                    "hqb666@$");
            String url ="jdbc:mysql://localhost:3306/huihui";
            String user = "root";
            String password = "hqb666@$";
            Connection con  = JDBCUtil.getCon(url,user,password);

            //        3）创建对象
            Statement st  = con.createStatement();
            //        4）执行sql语句
            String str = "SElECT * FROM student WHERE s_id = '01'";
            ResultSet rs =  st.executeQuery(str);

            //        5）处理结果
            while (rs.next()){
                System.out.println(rs.getInt("s_id")+"-----"+
                        rs.getString("s_name")+"-------"+
                        rs.getString("s_birth")+"------"+
                        rs.getString("s_sex"));
            }

            //        6）关闭资源
              /*  rs.close();
                st.close();
                con.close();*/
              JDBCUtil.closeAll(con,st,rs);
        } catch (Exception e) {
                e.printStackTrace();
        }

    }
}
