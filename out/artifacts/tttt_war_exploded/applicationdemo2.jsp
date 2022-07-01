<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/12
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <head><title>Application应用演示</title></head>
<body>
<%

    String Name = (String) application.getAttribute("user");
    String Password = (String) application.getAttribute("pass");
    out.println("user = " + Name);
    out.println("pass = " + Password);
%>
</body>
</html>
