<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/7
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%! int number = 0;

    synchronized void countpeople() {
        number++;
    }
%>
<%
    if (session.isNew())//新session的创建
    {
        countpeople();    //同一个用户的同一个sesion对象下
        // （如在Cookie和Session生命周期内关闭和打开浏览器重复访问该页面的次数），
        // 对这一个页面的访问计数++   seeP113
        String str = String.valueOf(number);
        session.setAttribute("count", str); //访问计数的数值，被放到session对象中携带
    }
%>
<p>您是第<%=(String)session.getAttribute("count")%>个访问本站的人。
    <!-- 表达式显示访问计数的数值  -->
</body>
</html>
