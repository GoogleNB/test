package JDBC.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/7 16:07
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：JDBCUtils.java
 * @Software：IntelliJ IDEA
 */
public class JDBCUtils {
    public static Connection getConnection() throws Exception{
        InputStream is = new FileInputStream("D:\\java_Lianxi\\idea-test\\src\\jdbc.properties");
        Properties pro = new Properties();
        pro.load(is);

        String user = pro.getProperty("user");
        String password = pro.getProperty("password");
        String driverClass = pro.getProperty("driverClass");
        String url = pro.getProperty("url");

        //加载驱动
        Class.forName(driverClass);

        //获取驱动
        Connection conn = DriverManager.getConnection(url,user,password);
        return conn;
    }

    public static void closeConnection(Connection conn, PreparedStatement ps) {

        try {
            if (conn!=null)
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (ps!=null)
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void PrepareStatementUpdate(String sql,Object ...args) throws Exception {
        Connection conn = JDBCUtils.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i+1,args[i]);
        }
        ps.execute();
        JDBCUtils.closeConnection(conn, ps);
    }
}
