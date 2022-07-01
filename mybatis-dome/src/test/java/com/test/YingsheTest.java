package com.test;

import com.User;
import com.mapper.WangMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/1/9 13:59
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：YingsheTest.java
 * @Software：IntelliJ IDEA
 */
public class YingsheTest {
    @Test
    public  void Test1() throws IOException {

        //1.加载Mybatis核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSessionFactory，用来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.执行sql
        WangMapper mapper = sqlSession.getMapper(WangMapper.class);
        List<User> users = mapper.selectAll();
        System.out.println(users);
        //关闭资源
        sqlSession.close();
    }
    @Test
    public  void TestOne() throws IOException {

        //1.加载Mybatis核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取sqlSessionFactory，用来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.执行sql
        WangMapper mapper = sqlSession.getMapper(WangMapper.class);
        User user = mapper.selectOne("王伟");
        System.out.println(user);
        //关闭资源
        sqlSession.close();
    }
}
