<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/12
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>欢迎光临</title></head>
<body>

<%

    String strLogin = (String) session.getAttribute("login");
    String strUser = (String) session.getAttribute("me");
    if (strLogin == null) {
        out.println("<h2>请先登录,谢谢!</h2>");
        out.println("<h2>5秒钟后,自动跳转到登录页面!</h2>");
        response.setHeader("Refresh", "5;URL=login1.htm");
    } else {
        if (strLogin.equals("OK")) {
            out.println(strUser + "<h2>欢迎进入我们的网站!</h2>");
        } else {
            out.println("<h2>用户名或密码错误,请重新登录!</h2>");
            out.println("<h2>5秒钟后,自动跳转到登录页面!</h2>");
            response.setHeader("Refresh", "5;URL=login1.htm");
        }
    }
%>
</body>
</html>
