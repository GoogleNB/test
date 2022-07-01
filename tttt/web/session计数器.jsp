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
<%Cookie thisSession = null;
    boolean cookieFound = false;
    // 从请求获取coolies
    Object sessionCount = request.getSession().getAttribute("SessionCount");
    if(sessionCount!=null)
    {

                cookieFound = true;

    }
    //输出页面
    out.println("<center><h1>Cookie 计数器</h1></center>");
    // 显示客户端详细信息,是否存在计数器cookie
    if (cookieFound)
    {
        // 获取cookie的值,并加1
        int cookieCount = Integer.parseInt(thisSession.getValue());
        cookieCount++;
        out.println("<font color=blue size=+1>");
        out.println("<p>这是1分钟内第<B> " +cookieCount +" </B>次访问本页\n");
        // 设置cookie的新值, 加到相应对象中
        thisSession.setValue(String.valueOf(cookieCount));
        thisSession.setMaxAge(60*1);
        response.addCookie(thisSession);
    }
    if (cookieFound == false)
    {
        out.println("<font color=blue size=+1>");
        out.println("<p>你在近1分种没有访问过此页,现在是第1次访问此页");
        // 创建新的Cookie并设置它的存活期
        request.getSession().setAttribute("SessionCount", "1");
        thisSession.setMaxAge(60*1);
        // 在response对象中加入cookie
        response.addCookie(thisSession);
    }    %>
</body>
</html>
