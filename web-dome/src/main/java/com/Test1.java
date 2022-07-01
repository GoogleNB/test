package com;


import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/1/16 11:30
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Test1.java
 * @Software：IntelliJ IDEA
 */
@WebServlet("/dome1")
public class Test1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileInputStream inputStreamReader = new FileInputStream("C:\\Users\\Windows\\Pictures\\Screenshots\\屏幕截图(69).png");
        ServletOutputStream outputStream = resp.getOutputStream();
//        int len;
//        byte[] buff = new byte[1024];
//        while ((len = inputStreamReader.read(buff)) != -1) {
//            outputStream.write(buff,0,len);
//        } 
        IOUtils.copy(inputStreamReader, outputStream);
        inputStreamReader.close();
//        resp.setContentType("text/html;charset=utf-8");
//        PrintWriter writer = resp.getWriter();
//        writer.write("<h1>何以解忧，唯有杜康</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
