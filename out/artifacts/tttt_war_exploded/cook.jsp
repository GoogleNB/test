<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/4/14
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie thisCookie = null;
    boolean cookieFound = false;
    // 从请求获取coolies
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (int i = 0; i < cookies.length; i++) {
            thisCookie = cookies[i];
            //检查是否存在CookieCount数据
            if (thisCookie.getName().equals("CookieCount")) {
                cookieFound = true;
                break;
            }
        }
    }
    //输出页面
    out.println("<center><h1>Cookie 计数器</h1></center>");
    // 显示客户端详细信息,是否存在计数器cookie
    if (cookieFound) {
        // 获取cookie的值,并加1
        int cookieCount = Integer.parseInt(thisCookie.getValue());
        cookieCount++;
        out.println("<font color=blue size=+1>");
        out.println("<p>这是1分钟内第<B> " + cookieCount + " </B>次访问本页\n");
        // 设置cookie的新值, 加到相应对象中
        thisCookie.setValue(String.valueOf(cookieCount));
        thisCookie.setMaxAge(60 * 1);
        response.addCookie(thisCookie);
    }
    if (cookieFound == false) {
        out.println("<font color=blue size=+1>");
        out.println("<p>你在近1分种没有访问过此页,现在是第1次访问此页");
        // 创建新的Cookie并设置它的存活期
        thisCookie = new Cookie("CookieCount", "1");
        thisCookie.setMaxAge(60 * 1);
        // 在response对象中加入cookie
        response.addCookie(thisCookie);
    }
%>
</body>
</html>
