<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateFilm.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <br/><br/><br/><br/>
  <center><h1>修改</h1>
    <form action="updateFilmServlet?fid=${fid}" method="post">
    	<table>
    		<tr>
    			<td>title</td>
    			<td><input type="text" name="title" value="${title}" /></td>
    		</tr>
    		<tr>
    			<td>description</td>
    			<td>
    				<input type="text" name="description" value="${description}" size="150"/>
    			</td>
    		</tr>
    		
    		<tr>
    			<td>language</td>
    			<td><input type="text" name="language_id" value="${language_id}" /></td>
    		</tr>
    		<tr>
    			<td>         </td>
    			<td><input type="submit" value="提交"/></td>
    		</tr>
    	</table>
    </form>
    </center>
  </body>
</html>
