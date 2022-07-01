<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/3/23
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% for (int i = 1; i <=9; i++) {
  for (int j = 1; j <=i ; j++) {
    out.print(i+"*"+j+"="+i*j);
    out.print("&nbsp;&nbsp;");
  }
  out.print("<br/>");
}%>
</body>
</html>
