<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/3/29
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% String nn1 = new String(request.getParameter("name").getBytes("iso-8859-1"), "utf-8");
    String pass =request.getParameter("password");
out.print(nn1 + "<br/>");
    if ("嘉然".equals(nn1)&&"123".equals(pass)) {
        out.println("登陆成功<br/>一个魂来喽<br/>");
    } else {
        out.print("登陆失败<br/>");
    }

%>
</body>
</html>
