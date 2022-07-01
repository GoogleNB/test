package shopServlet;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;
import java.io.IOException;

/**
 * @Date ：2022/6/10 16:33
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：downServlet.java
 * @Software：IntelliJ IDEA
 */
public class downServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 新建一个smartupload对象
        SmartUpload su = new SmartUpload();
        PageContext pageContext = JspFactory.getDefaultFactory().getPageContext(this, req, resp, null, true, 8192, true);
        // 初始化
        su.service(req,resp);
        // 设定contentdisposition为null以禁止浏览器自动打开文件，
        //保证点击链接后是下载文件。若不设定，则下载的文件扩展名为
        //doc时，浏览器将自动用word打开它。扩展名为pdf时，
        //浏览器将用acrobat打开。
        su.setContentDisposition(null);
        // 下载文件
        try {
            su.downloadFile("upload/shop.doc");
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
