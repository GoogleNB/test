package JDBC;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Properties;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/1 21:20
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：TestConnection1.java
 * @Software：IntelliJ IDEA
 */
public class TestConnection1 extends Thread implements Runnable{


    public static void main(String[] args)  {
        //读取配置文件基本信息
       // InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("D:\\java_Lianxi\\idea-test\\src\\jdbc.properties");
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            InputStream is = new FileInputStream("src\\jdbc.properties");
            Properties pro = new Properties();
            pro.load(is);

            String user = pro.getProperty("user");
            String password = pro.getProperty("password");
            String driverClass = pro.getProperty("driverClass");
            String url = pro.getProperty("url");

            //加载驱动
            Class.forName(driverClass);

            //获取链接
            conn = DriverManager.getConnection(url,user,password);

            //预编译sql语句，返回PreparedStatement的实例
            String sql = "INSERT INTO book.kaoshi (姓名, 性别, 年龄) VALUES (?,?,?)";
            ps = conn.prepareStatement(sql);
            //填充占位符
            ps.setString(1,"王伟");
            ps.setString(2,"男");
            ps.setInt(3,23);
            //执行sql语句
            int i = ps.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //资源的关闭
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void Test1() throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动
       Driver driver = (Driver) clazz.getConstructor().newInstance();//反射造对象
        //DriverManager 管理Driver
        DriverManager.registerDriver(driver);//注册驱动//类加载时自己做了
        String url = "jdbc:mysql://localhost:3306/book";
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "root");
        Connection connect =DriverManager.getConnection(url,info);
        System.out.println(connect);
    }
}
