<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/struts-tags" prefix="s"%>
  <head>
   <link href="css/bootstrap.min.css" rel="stylesheet">
 </head> 
<html>
  <body>
     <div align="center">
         <center><br><br><br><br><br><br><br><br>
         <b><h1>Choose your selection:</h1></b><br>
         <a href = "Search.action">Search Books by author</a>
         <br><br>
         <a href = "Adbook.action">Add a book</a>

         </center>
     </div>
  </body>
</html>
