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
   <div class="container" align="center"><br><br><br>
     <table class="table table-striped">
       <tr>
           <th>Title</th>
          <th>Publisher</th>
          <th>PublishDate</th>
          <th>ISBN</th>
          <th>Price</th>
          <th>AuthorId</th>
          <th>Name</th>
          <th>Age</th>
          <th>Country</th>
       </tr>
       <s:iterator value="book">
       <tr>
          <td><s:property value="book.Title"/></td>
          <td><s:property value="book.Publisher"/></td>
          <td><s:property value="book.PublishDate"/></td>
          <td><s:property value="book.ISBN"/></td>
          <td><s:property value="book.Price"/></td>
       </s:iterator>
       <s:iterator value="author">
          <td><s:property value="author.AuthorId"/></td>
          <td><s:property value="author.Name"/></td>
          <td><s:property value="author.Age"/></td>
          <td><s:property value="author.Country"/></td>
       </s:iterator>
       </tr>
     </table> 
    </div>
  </body>
</html>
