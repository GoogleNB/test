<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/3/29
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>out对象应用实例 </title>
</head>
<body>
<%

    out.print("<h3>out对象应用实例</h3>");
    out.print("<br>输出布尔型数据:：");   	out.print(true);
    out.newLine();
    out.println("<br>输出字符型数据:");  	out.print('l');
    out.print("<br>输出字符数组数据:");  	out.print(new char[]{'l','z','c'});
    out.print("<br>输出双精度数据:");  	out.print(5.66d);
    out.print("<br>输出单精度数据:");  	out.print(36.8f);
    out.print("<br>输出整型数据:");   	out.print(8);
    out.print("<br>输出长整型数据:");  	out.print(123456789123456L);
    out.print("<br>输出对象:");  		out.print(new java.util.Date());
    out.print("<br>输出字符串:");     	out.print("<font size=4 color=red>liuzc@hnrpc.com</font>");
    out.print("<br>输出新行:");   		out.newLine();
    out.print("<br>缓冲区大小:"); 		out.print(out.getBufferSize());
    out.print("<br>缓冲区剩余大小:");  	out.print(out.getRemaining());
    out.print("<br>是否自动刷新:");  		out.print(out.isAutoFlush());
    out.flush();               		    out.print("<br>调用out.flush()");
    out.close();   		                out.print("这一行信息不会输出");
    //println ": "
    //print   ":"
%>
</body>
</html>
