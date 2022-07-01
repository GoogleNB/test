<%@ page import="java.time.LocalTime" %>
<%@ page import="java.awt.*" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/24
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<%
    response.setIntHeader("Refresh", 1);
    out.print(LocalTime.now().toString().substring(0,8));

%>
</body>
</html>
