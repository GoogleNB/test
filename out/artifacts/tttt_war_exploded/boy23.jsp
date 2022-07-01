<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/5
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<P>将当前页面保存为word文档吗？
<FORM action="" method="get" name=form>
    <INPUT TYPE="submit" value="yes" name="submit">
</FORM>
<% String str=request.getParameter("submit");
    if(str==null)  {str="";}
    if(str.equals("yes")) {response.setContentType("application/msword;charset=GB2312"); }//这是文件下载的雏形
    //response.setCharacterEncoding();response.setContentType();
    //request.setCharacterEncoding("");
%>
</font>
</body>
</html>
