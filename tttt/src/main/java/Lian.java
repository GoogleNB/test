import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/3/15 10:01
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Lian.java
 * @Software：IntelliJ IDEA
 */
@WebServlet(name = "Servlet", value = "/Servlet")
public class Lian extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---------------------");
    }
}
