/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/1/14 15:31
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：${NAME}.java
 * @Software：IntelliJ IDEA
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
