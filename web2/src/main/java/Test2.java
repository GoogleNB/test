import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/1/12 20:10
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Test2.java
 * @Software：IntelliJ IDEA
 */
@WebServlet("/dome1")
public class Test2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("鸡汤来喽");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("这鸡汤十分的珍贵");
    }
}
