<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/12
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Session 应用演示</title></head>
<%
    if (null != request.getParameter("user") && null != request.getParameter("pass")) {
        String strName = request.getParameter("user");
        String strPass = request.getParameter("pass");
        if (strName.equals("liuzc") && strPass.equals("liuzc")) {
            session.setAttribute("login", "OK");
            session.setAttribute("me", strName);
            response.sendRedirect("welcome.jsp");
        } else {
            out.println("<h2>登录错误,请输入正确的用户名和密码</h2>");
        }
    }
%>
</html>
