<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/3/24
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%! long memFree = Runtime.getRuntime().freeMemory(); %>
<%! long memTotal = Runtime.getRuntime().totalMemory(); %>
<%! long percent = memFree / memTotal; %>
<% if (percent < 0.5) {%>
<%--<jsp:forward page="forward.html"/>--%>
<%--<% request.getRequestDispatcher("forward.jsp").forward(request, response); %>--%>
<%response.sendRedirect(" forward.jsp"); %>
<%--  --8> <号 - -重定向在浏览器的地址栏中显示了目标页面文件名,转发--%>

<%
} else {
%>
<jsp:forward page="forward.jsp"/>
<% } %>
</body>
</html>
