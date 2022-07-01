package JDBC.util;

import JDBC.Kaos;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/8 16:17
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：PreparedStatementQuery.java
 * @Software：IntelliJ IDEA
 */
public class PreparedStatementQuery {
    public static <T> List<T> getForList(Class<T> clazz, String sql, Object...args){
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            ResultSet rs = ps.executeQuery();
            //获取结果的元数据
            ResultSetMetaData rsmd = rs.getMetaData();
            //通过ResultSetMetaData获取结果集中的列数
            int columnCount = rsmd.getColumnCount();
            //创建集合对象
            ArrayList<T> list = new ArrayList<>();
            while (rs.next()) {
                //处理结果集中一行中的每一列
                T t = clazz.getConstructor().newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取列值
                    Object columnValue = rs.getObject(i + 1);
                    //获取列名
                    String columnLabel = rsmd.getColumnLabel(i + 1);
                    //给T对象指定columnLabel属性，赋值为columnValue，通过反射
                    Field declaredField = clazz.getDeclaredField(columnLabel);
                    declaredField.setAccessible(true);//设置为能够访问
                    declaredField.set(t,columnValue);//给对象属性赋值
                }
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(conn,ps);
        }
        return null;
    }
    public static  <T>T getInstance(Class<T> clazz, String sql,Object...args)  {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
             conn = JDBCUtils.getConnection();
             ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            ResultSet rs = ps.executeQuery();
            //获取结果的元数据
            ResultSetMetaData rsmd = rs.getMetaData();
            //通过ResultSetMetaData获取结果集中的列数
            int columnCount = rsmd.getColumnCount();
            if (rs.next()) {
                //处理结果集中一行中的每一列
                T t = clazz.getConstructor().newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取列值
                    Object columnValue = rs.getObject(i + 1);
                    //获取列名
                    String columnLabel = rsmd.getColumnLabel(i + 1);
                    //给T对象指定columnLabel属性，赋值为columnValue，通过反射
                    Field declaredField = clazz.getDeclaredField(columnLabel);
                    declaredField.setAccessible(true);//设置为能够访问
                    declaredField.set(t,columnValue);//给对象属性赋值
                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(conn,ps);
        }
        return null;
    }
@Test
    public void jjj() throws Exception {
    Connection conn = JDBCUtils.getConnection();
    String sql = "select 姓名 name,性别 sex,年龄 age from kaoshi ";
    PreparedStatement ps = conn.prepareStatement(sql);
    List<Kaos> forList = PreparedStatementQuery.getForList(Kaos.class, sql);
    forList.forEach(System.out::println);
}
}
