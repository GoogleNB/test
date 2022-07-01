<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/19
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="java.sql.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
</head>

<body>
&quot;oThis is my JSP page. <br>
<%
    String driverName = "com.mysql.cj.jdbc.Driver";  //MySQl的驱动程序类


    //连接数据库的连接参数字符串
    String url = "jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    Properties info = new Properties();
    info.setProperty("user", "root");
    info.setProperty("password", "root");
    //1：加载驱动
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    //2：建立连接
    Connection conn = DriverManager.getConnection(url,info);
    //3_1：创建Statement（负责执行sql语句）
    Statement stmt = conn.createStatement();

    String sql = "select * from brand";
    String sql1= "update brand set  ordered='1000' where name='小米'";

    PreparedStatement ps = conn.prepareStatement(sql1);
    ps.execute();
    //3_2：获得数据结果集合
    ResultSet rs = stmt.executeQuery(sql);

    //4:依次遍历结果集（表中的记录）
    while (rs.next()) {    //依据数据库中的字段名打印数据
        out.println(rs.getString("name"));
        out.println(rs.getString("ordered"));
    }

    //5:关闭连接
    rs.close();
    stmt.close();
    conn.close();

%>
</body>
</html>