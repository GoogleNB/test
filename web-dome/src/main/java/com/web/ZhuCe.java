package com.web;

import com.User;
import com.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/1/25 12:12
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：ZhuCe.java
 * @Software：IntelliJ IDEA
 */
@WebServlet("/ZhuceServlrt")
public class ZhuCe extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String name =  new String(req.getParameter("name").getBytes("iso-8859-1"), "utf-8");
        int password =Integer.parseInt(req.getParameter("password"));

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);



        User user = mapper.selectName(name);


        PrintWriter writer = resp.getWriter();

        if (user == null) {
            writer.write("注册成功");
            mapper.insert(name, password);
            sqlSession.commit();
            sqlSession.close();
        }else {
            writer.write("注册失败");
            sqlSession.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
