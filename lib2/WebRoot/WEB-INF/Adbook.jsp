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
        <center><br><br><br><br><br><br>
              <form action="addBookAction.action" method="post">
                 <b>ISBN :</b> <input type="text" name="ISBN" ><br><br>
                 <b>Title :</b> <input  type="text" name="Title" ><br><br>
                 <b>AuthorId :</b> <input  type="text" name="AuthorId" ><br><br>
                <b>Publisher :</b> <input  type="text" name="Publisher" ><br><br>
                <b>PublishDate:</b> <input type="text" name="PublishDate" ><br><br>
                <b>Price :</b> <input type="text"  name="Price">
               <input type="submit"  value="Add  " class="btn btn-info"/><br>
         </form>
       </center>
   </body>
</html>
