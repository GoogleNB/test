package com;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2021/12/25 17:12
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Rumen.java
 * @Software：IntelliJ IDEA
 */
public class Rumen {
    public static void main(String[] args) throws IOException {
        //1.加载Mybatis核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSessionFactory，用来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.执行sql
        List<User> users = sqlSession.selectList("test.selectBlog");
        System.out.println(users);
        //关闭资源
        sqlSession.close();
    }
}
