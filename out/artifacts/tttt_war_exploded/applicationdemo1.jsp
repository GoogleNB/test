<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/12
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<head><title>Application应用演示</title></head>
<body>
</br>
<%
    application.setAttribute("user", "邓所春");
    application.setAttribute("pass", "dsc");
%>
<jsp:forward page="applicationdemo2.jsp"/>

</body>
</body>
</html>
