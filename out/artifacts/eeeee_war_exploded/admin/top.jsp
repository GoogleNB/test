<%@ page contentType="text/html;charset=GB2312" %>
<%@ page import="shopBeans.ConnDB" %>
<%@ page import="java.sql.*"%>

<%
	ConnDB conn=new ConnDB();
	String admin_name=(String) session.getAttribute("admin_name");
	if(admin_name==null || admin_name=="")
	{
		out.println("<script language='javascript'>alert('请先登录!');window.location.href='index.jsp';</script>");
	}
	String header=(String) session.getAttribute("admin_header");

%>
<style type="text/css">
<!--

.STYLE1 {font-size: 12px;}
.STYLE2 {
	font-size: 14px;
}

-->
</style>

<center>
<table width="782" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="782" height="75" valign="top"><table width="100%" border="0" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
      <tr>
        <td width="540" height="75" rowspan="3"><img src="images/logo/logo.gif" width="539" height="116" /></td>
        <td width="117" height="61" align="center"><img src="<%= header %>" width="50" height="50" /></td>
        <td width="117" height="61" align="center"><span class="STYLE2"><%= admin_name %></span></td>
      </tr>
      <tr>
        <td height="19" colspan="2" align="center" class="STYLE1"> <a href="../shop/index_.jsp">返回　eBuy电子商城前台</a> </td>
        </tr>
      <tr>
        <td height="28" colspan="2" align="center" background="images/logo/1.JPG" class="STYLE1"><a href="exit.jsp">退出 eBuy电子商城 </a></td>
        </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td height="14">&nbsp;</td>
  </tr>
</table>
</center>

