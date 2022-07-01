<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/3/24
  Time: 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"   %>
<html>
<head>
    <title>Title</title>
</head>
<body>
新华社最新消息
<%--<jsp:include page="ee2.jsp"/>--%>
<p>来自jsp</p>

<%--<jsp:include page="hh1.html" flush="true"/>--%>
<%@include file="hh1.html"%>


<%--<%--%>
<%--    request.setCharacterEncoding("utf-8");--%>
<%--%>--%>
<jsp:include page="hh1.html"/>
<p>来自html</p>
</body>
</html>