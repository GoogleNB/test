package JDBC;

import JDBC.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/7 20:14
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：SelectTest.java
 * @Software：IntelliJ IDEA
 */
public class SelectTest {
    public static void main(String[] args) throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql="select * from kaoshi";
         PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet resultSet = ps.executeQuery();

       while (resultSet.next()) {
            String n1 = resultSet.getString(1);
            String n2 = resultSet.getString(2);
            int n3 = resultSet.getInt(3);
            System.out.println("姓名="+n1+" 性别="+n2+" 年龄="+n3);
        }

    }
}
