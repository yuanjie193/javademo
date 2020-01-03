import com.itdr.controller.UsersController;
import com.itdr.pojo.Users;
import com.itdr.services.UsersService;
import com.itdr.utils.PropertiesUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoTest {
    @Test
    public void test1() throws SQLException {
        ComboPooledDataSource m = new ComboPooledDataSource();
        Connection connection = m.getConnection();
        String sql = "select * from student";
        PreparedStatement p = connection.prepareStatement(sql);
        ResultSet resultSet = p.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt("s_id")+"-----"+
                    resultSet.getString("s_name")+"-------"+
                    resultSet.getString("s_birth")+"------"+
                    resultSet.getString("s_sex"));
        }
    }
//    @Test
//    public void test4() throws Exception {
////        Users u = new Users();
////        String str = PropertiesUtil.getValue("className");
////        Class<?> aClass = Class.forName(str);
////        UsersService us = (UsersService) aClass.newInstance();
//
//    }
    @Test
    public void test5(){
        UsersController uc = new UsersController();
        int a = uc.register("bbb","123456");
        System.out.println(a);
    }
    @Test
    public void test6(){
       String str = "";
        System.out.println(str.split(",").length);
    }
}
