<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/9
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html; charset=UTF-8" %>SERVLET:
resp.setContentType("text/html;charset=UTF-8");
<html>
  <head>
    <title>$Title$</title>
    <style>
      .box1{
        width: 500px;
        height: 500px;
      }
    </style>
  </head>
  <body>
  <jsp:include  page="navigator.html" flush="true"/>
  <div class="box1"></div>
  <jsp:include page="copyright.html" flush="true"/>

  </body>
</html>
