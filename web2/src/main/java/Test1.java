import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * -*- coding = utf-8 -*-
 *
 * @Date: 2022/1/12 19:36
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：Test1.java
 * @Software：IntelliJ IDEA
 */
@WebServlet(urlPatterns = "/dome")
public class Test1 extends Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("-----------------------------------");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
