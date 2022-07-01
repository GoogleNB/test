<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/17
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/add.html">插入</a>
<table border="1" cellspacing="0" width="800">

  <tr>
    <td>序号</td>
    <td>品牌名称</td>
    <td>企业名称</td>
    <td>排序</td>
    <td>品牌介绍</td>
    <td>状态</td>
    <td>操作</td>
  </tr>
  <c:forEach items="${brands}" var="brand" varStatus="status">
    <tr align="center">
      <td>${status.count}</td>
      <td>${brand.name}</td>
      <td>${brand.companyName}</td>
      <td>${brand.ordered}</td>
      <td>${brand.description}</td>
      <c:if test="${brand.status==1}">
        <td>启用</td>
      </c:if>
      <c:if test="${brand.status!=1}">
        <td>关闭</td>
      </c:if>

    <td><a href="#">修改</a>
      <a href="#">删除</a>
    </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
