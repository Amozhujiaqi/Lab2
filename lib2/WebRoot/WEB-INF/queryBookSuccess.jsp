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
    <div  class="container" align="center"><br><br><br>
     <table class="table table-striped">
       <tr>
          <th>Title</th>
          <th>AuthorId</th>
          <th>Publisher</th>
          <th>PublishDate</th>
          <th>ISBN</th>
          <th>Price</th>
          <th>option</th>
       </tr>
       <s:iterator value="list">
       <tr>
          <s:url var="url" action="showDatailsAction.action">
         	 <s:param name="ISBN" > <s:property value="ISBN"/></s:param>
          </s:url>
          <s:url var="deleteurl" action="deleteBookAction.action">
         	 <s:param name="ISBN" > <s:property value="ISBN"/></s:param>
          </s:url>
          <s:url var="updateurl" action="updateTmpAction.action">
         	 <s:param name="ISBN" > <s:property value="ISBN"/></s:param>
         	 <s:param name="Title" > <s:property value="Title"/></s:param>
          </s:url>
          <td><s:a href="%{url}"><s:property value="Title"/></s:a></td>
          <td><s:property value="AuthorId"/></td>
          <td><s:property value="Publisher"/></td>
          <td><s:property value="PublishDate"/></td>
          <td><s:property value="ISBN"/></td>
          <td><s:property value="Price"/></td>
          <td><s:a href="%{deleteurl}">delete</s:a>
          <s:a href="%{updateurl}">update</s:a></td>
       </tr>
       </s:iterator>
     </table>
     </div>
  </body>
</html>
