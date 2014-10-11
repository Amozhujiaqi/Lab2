<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>Using GET to read form data</title>
  </head>
  <ul>
<li><p><b>ISBN:</b>
   <%= request.getParameter("ISBN")%>
</p></li>
<li><p><b>AuthorId:</b>
   <%= request.getParameter("AuthorId")%>
</p></li>
<li><p><b>Publisher:</b>
   <%= request.getParameter("Publisher")%>
</p></li>
<li><p><b>PublishDate:</b>
   <%= request.getParameter("PublishDate")%>
</p></li>
<li><p><b>Price:</b>
   <%= request.getParameter("Price")%>
</p></li>
</ul>
</html>
