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

    <head><title>Application计数器</title></head>
<body>
<center><font size=5 color=blue>Application计数器</font></center>
<hr>
<%
    String strNum = (String) application.getAttribute("num");
    int num = 1;
    //检查是否Num变量是否可取得
    if (strNum != null) num = Integer.parseInt(strNum) + 1; //将取得的值增加1
    application.setAttribute("num", String.valueOf(num)); //起始Num变量值
%>
访问次数为: <font color=red><%= num %>
</font><br>
</body>
</html>
