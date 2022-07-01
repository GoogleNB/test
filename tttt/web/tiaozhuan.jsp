<%@ page import="java.time.LocalTime" %>
<%@ page import="java.awt.*" %>
<%@ page import="java.awt.desktop.ScreenSleepEvent" %>
<%@ page import="java.util.Timer" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/24
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<%
    response.setHeader("Refresh","5;URL=http://www.163.com");
%>
<script>

        setInterval(function (){
            var d= new Date();
            document.body.innerHTML=" "
            document.body.innerHTML=" "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
        },1000)




</script>
</body>
</html>
