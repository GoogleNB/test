<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.util.Vector"%>
<%@ page import="shopBeans.CartBean"%>
<%@ page import="shopBeans.ConnDB"%>
<% 
	String c_name=(String)session.getAttribute("c_name");
	if(c_name=="" || c_name==null)
	{
		out.println("<script language='javascript'>alert('���ȵ�¼!');window.location.href='index.jsp';</script>");
	}
	else
	{
	Vector cart=(Vector)session.getAttribute("cart");
	cart.removeAllElements();	
	response.sendRedirect("my_cart.jsp");
	}
 %>