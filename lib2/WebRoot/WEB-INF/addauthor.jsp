<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
    <body>
      <center><br><br><br><br><br>
        <b><h1>The author is not in the datebase,Please add the information into database.</h1></b><br><br>
        <form action="addAuthorAction.action" method="post">
            <s:hidden name="AuthorId" value="%{AuthorId}"/>
            <b>Name :</b> <input type="text" name="Name"><br><br>
            <b>Age:</b> <input type="text" name="Age"><br><br>
            <b>Country:</b> <input type="text" name="Country"><br><br>
            <input type="submit" value="Add " class="btn btn-info"/>
        </form>
     </center>
   </body>
</html>
