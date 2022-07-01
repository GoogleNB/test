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
import java.io.PrintWriter;

/**
 * @Date ：2022/6/10 16:36
 * @Author ：奥雷里亚诺·布恩迪亚上校
 * @File ：doUpdataServlet.java
 * @Software：IntelliJ IDEA
 */
public class doUpdataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //新建上传对象
        SmartUpload su=new SmartUpload();
        PrintWriter out = resp.getWriter();
        PageContext pageContext = JspFactory.getDefaultFactory().getPageContext(this, req, resp, null, true, 8192, true);
        // 上传初始化
        su.initialize(pageContext);
        // 设定上传限制
        // 限制每个上传文件的最大长度。
        // su.setMaxFileSize(10000);
        // 限制总上传数据的长度。
        // su.setTotalMaxFileSize(20000);
        // 通过扩展名限制设定允许上传的文件,这里仅允许doc,txt文件。
        // su.setAllowedFilesList("doc,txt");
        // 通过扩展名限制设定禁止上传的文件,禁止上传带有exe,bat,jsp,htm,html扩展名的文件和没有扩展名的文件。
        // su.setDeniedFilesList("exe,bat,jsp,htm,html,,");
        // 实现文件上传
        try {
            su.upload();
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
        // 将上传文件全部保存到指定目录,必须保证upload目录在应用程序根文件夹中存在
        int count = 0;
        try {
            count = su.save("/upload", su.SAVE_VIRTUAL);
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
        //提示成功上传文件数量
        out.println(count+" file upload successfully");

        // 逐一提取上传文件信息，同时可保存文件。
        for (int i=0;i<su.getFiles().getCount();i++)
        {
            com.jspsmart.upload.File file = su.getFiles().getFile(i);
            // 若文件不存在则继续
            if (file.isMissing()) continue;
            // 显示当前文件信息
//            out.println("<br>文件长度" + file.getSize());

//            try {
//                name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

        }
        String name =req.getParameter("file1");
        if (name!=null)
        out.println("file name " + name);
        String name2 =req.getParameter("file2");
        if (name2!=null)
            out.println("file name " + name2);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
