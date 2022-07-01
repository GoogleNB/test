<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/5/13
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
<%
    if(application.getAttribute("counter")==null)
    {
        application.setAttribute("counter", "1");
    }
    else
    {
        String strnum=null;
        strnum =(String)application.getAttribute("counter");

        int icount=0;
        icount=Integer.valueOf(strnum).intValue();
        icount++;

        application.setAttribute("counter",Integer.toString(icount));
    }


%>
您是第<%=application.getAttribute("counter") %>位访问者;

</body>
</body>
</html>
