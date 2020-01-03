import com.itdr.JDBCUtil2;
import com.itdr.PoolDemo;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class TestDemo {
    @Test
    public void test(){}
   /* @Test
    public void test2() throws IOException {
        Properties p = new Properties();
        //获取流
        InputStream in = TestDemo.class.getResourceAsStream("db.properties");
        //加载流
        p.load(in);
        //获取值
        String driverClass = p.getProperty("driverClass");
        System.out.println(driverClass);
    }*/
    @Test
    public void test3() throws  SQLException {
        Connection con = JDBCUtil2.getCon();
        String sql = "SElECT * FROM student WHERE s_id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,"01");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt("s_id")+"-----"+
                    resultSet.getString("s_name")+"-------"+
                    resultSet.getString("s_birth")+"------"+
                    resultSet.getString("s_sex"));
        }
    }
    @Test
    public void test4(){
        Connection con = PoolDemo.getCon();
        System.out.println(con);
        PoolDemo.addBack(con);
    }

}
