<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="shopBeans.ConnDB" %>
<%@ page import="shopBeans.Convert" %>
<%@ page import="java.sql.*" %>

<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2 {
	font-size: 14px;
}
.STYLE5 {color: #FFFFFF}
.STYLE6 {font-size: 12px; color: #FF0000; }
-->
</style>

<% 
	String c_name=(String)session.getAttribute("c_name");
	String t_type=(String)session.getAttribute("t_type");
 %>
<center>
<table width="782" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td width="188" height="122" valign="top"><jsp:include page="sales_promotion.jsp" flush="true"/></td>
	
    <td width="588" rowspan="6" align="center" valign="top"><table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="200" height="30" align="center" background="../images/logo/back_new.gif"><span class="STYLE2">商品展区</span></td>
        <td width="359" align="right"><span class="STYLE6"><a href="index_down_more.jsp">更多&gt;&gt;&gt;</a></span>&nbsp;</td>
      </tr>
      <tr>
        <center>
<table width="200" border="0" bordercolor="#99CCFF" style="border-collapse:collapse">
<%
/*Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	String p_id="",p_name="",p_price="",p_image="",p_description="";
	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		conn=DriverManager.getConnection("jdbc:odbc:shopData","sa","");
		st=conn.createStatement();
		String sql="select p_id,p_name,p_price,p_image,p_description from product";
		rs=st.executeQuery(sql);
	}
	catch(Exception e)
	{}*/
try
{
	ConnDB conn=new ConnDB();
	String p_id="",p_name="",p_price="",p_image="",p_description="";
	String sql="select p_id,p_name,p_price,p_image,p_description from product";
	ResultSet rs=conn.doQuery(sql);
	

int i=1;
int j=0;
for(;i<=3;i++)
{
	j=j+1;
%>
  <tr>
  <% 
		for(;j<=21;j++)
		{  
			if(rs.next())
			{
				p_id=rs.getString("p_id");
				p_name=rs.getString("p_name");
				p_price=rs.getString("p_price");
				p_image=rs.getString("p_image");
				p_description=rs.getString("p_description");
   %>
    <td width="110" height="135" align="center" valign="middle"><img src="../<%= p_image %>" width="90"/></td>
    <td width="100" align="center"><p><span class="STYLE5">============</span></p><p class="STYLE1"><%= p_name %></p><font size="2" color="#FF0000">￥<%= p_price %></font></p>   
	<p><a href="#" onClick="window.open('view_product.jsp?p_id=<%= p_id %>','help','scrollbars=yes,resizable=yes,width=600,height=520')"><input name="see" type="button" class="STYLE1" value="详情"></a><%if (c_name!=null && c_name!=""){%><input name="see" type="button" class="btn_grey" onClick="window.location.href='cart_add.jsp?p_id=<%=p_id%>'" value="购买"><% } %></p>
   </td>
    <% 
			}
 		
			if(j==3*i)
			{
				break;
			}
    	}
     %>
  </tr>
  <%
}
}
catch(Exception e)
{}
  %>
</table>
    </center>
      </tr>
    </table>    </td>
  </tr>
  <tr>
    <td height="123" valign="top"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
</table>
</center>




