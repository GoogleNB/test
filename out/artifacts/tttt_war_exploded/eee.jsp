<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/3/22
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    if (Math.random() > 0.5) {
%>
nice!
<% } else { %>
lousy!
<%} %>
</body>

</html>
