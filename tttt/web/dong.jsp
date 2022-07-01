<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/5
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    response.setHeader("Refresh","2");           //设置每2秒刷新一次刷新自身页面，也可以“刷新”（跳转）到别的页面 ,html的<head>的<meta>也能跳转
    out.println(new Date().toLocaleString());     //获得当前时间
%>

</body>
</html>
<!--  response实现页面跳转的方式：
1.1一秒刷新（自身）页面一次：response.setHeader("refresh","1");
1.2二秒跳到其他页面：response.setHeader("refresh","2;URL=otherPagename");  等价于html的<head>的<meta http-eqiv=  >
2.设置过期的时间期限   response.setDateHeader("Expires", System.currentTimeMillis()+自己设置的时间期限);： response.setStatus（302）; response.setHeader("location","url");
3.重定向：sendRedirect(String location)orSendError(int sc)
访问别的页面：
-->