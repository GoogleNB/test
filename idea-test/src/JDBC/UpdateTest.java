package JDBC;

import JDBC.util.JDBCUtils;

import java.sql.Connection;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/7 19:47
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：UpdateTest.java
 * @Software：IntelliJ IDEA
 */
public class UpdateTest {
    public static void main(String[] args) throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql = "update kaoshi set 姓名=? where 姓名=?";

        JDBCUtils.PrepareStatementUpdate(sql,"王伟","空洞骑士");


    }
}
