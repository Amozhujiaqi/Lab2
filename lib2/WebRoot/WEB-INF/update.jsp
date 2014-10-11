<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 <head>
    <link href="css/bootstrap.min.css" rel="stylesheet">
 </head> 
<html>
    <body>
    <br>
        <center>
        <b>Please input the information about the book you'd like to update: </b><br>
        <form action="updateBookAction.action" method="post">
             <s:hidden name="ISBN" value="%{ISBN}"/>
             <s:hidden name="Title" value="%{Title}"/>
             <b>AuthorId:</b> <input type="text" name="AuthorId"><br>
             <b>Publisher:</b> <input type="text" name="Publisher"><br>
             <b>Publish Data:</b> <input type="text" name="PublishDate"><br>
             <b>Price :</b> <input type="text" name="Price"><br>
             <input type="submit" value="Update " class="btn btn-info"/>
        <form>
        </center>
   </body>
</html>
