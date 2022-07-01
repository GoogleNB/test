package baobao.kaoshi;

import java.sql.*;
import java.util.Properties;

/**
 * -*- coding = utf-8 -*-
 * 连接Mysql进行增删改查
 *
 * @Date: 2021/12/16 16:41
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：JDBC.java
 * @Software：IntelliJ IDEA
 */
public class JDBC {

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties info = new Properties();
            info.setProperty("user", "root");
            info.setProperty("password", "root");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book",
                    info);
            String sql = "select * from kaoshi where 姓名=?";
            ps = connection.prepareStatement(sql);
            ps.setObject(1, "空洞骑士");
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                System.out.println("姓名:" + resultSet.getString(1) +
                        " 性别:" + resultSet.getString(2) +
                        " 年龄:" + resultSet.getInt(3));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (connection != null) {
                    connection.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }
}
