package com.neu.dao;

import com.neu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Date ：2022/5/7 15:13
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：UserServiceImpl.java
 * @Software：IntelliJ IDEA
 */
public class UserServiceImpl implements UserService{

    @Override
    public boolean isLogin(String name) {

        //1.加载Mybatis核心配置文件，获取sqlSessionFactory对象

            String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserByName(name);
        sqlSession.close();
        return user != null;
    }
}
