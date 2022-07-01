package com.neu.controller; /**
 * @Date ：2022/5/7 15:09
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：${NAME}.java
 * @Software：IntelliJ IDEA
 */

import com.neu.dao.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        UserServiceImpl userService = new UserServiceImpl();
        boolean login = userService.isLogin(name);
        if (login){
            request.getSession().setAttribute("user",name);
            request.getRequestDispatcher("users").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
