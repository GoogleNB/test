<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/5
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<head><title>response对象的setContentType方法演示</title></head>
<body>
<form action="settype.jsp" method="GET">
    <select name="where">
        <option value="csai" selected>希赛顾问团
        <option value="hnrpc"> 湖南铁道职业技术学院
        <option value="sun"> SUN公司
    </select>
    <input type="submit" value="go">
</form>
<%
    String address = request.getParameter("where");
    if (address != null) {
        if (address.equals("csai")) response.sendRedirect("http://www.csai.cn");
        else if (address.equals("hnrpc")) response.sendRedirect("http://www.hnrpc.com");
        else if (address.equals("sun")) response.sendRedirect("https://www.sdvcst.edu.cn");
    }
%>
</body>
</body>
</html>
