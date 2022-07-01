<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/6/21
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String qq = request.getParameter("qq");
    String[] parameterValues = request.getParameterValues("1");
    for (String i:parameterValues
         ) {
        out.println(i);
    }
    out.println(qq);
%>
</body>
</html>
