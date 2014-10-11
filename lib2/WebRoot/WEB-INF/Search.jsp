<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
    <body>
      <div align="center"><br><br><br><br><br><br><br><br><br><br><br>
        <form action="queryByName.action" method="post">
        <center>
           Author Name: <input type="text" name="Name">
           <input type="submit" value="Query"  class="btn btn-info"/>
        </center>
        </form>
      </div>
    </body>
</html>
