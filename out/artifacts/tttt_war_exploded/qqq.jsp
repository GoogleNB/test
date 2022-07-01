<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/3/29
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= request.getServletPath()%>
<%= request.getServerName()%>
<%= request.getRemoteAddr()%>
<%= request.getRemoteHost()%>
<%= request.getCharacterEncoding()%>

</body>
</html>
