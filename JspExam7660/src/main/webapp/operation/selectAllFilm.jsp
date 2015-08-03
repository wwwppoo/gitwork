<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'selectAllFilm.jsp' starting page</title>
    
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
  <a href="selectAllLanguage">增加</a><br/>
  <a href="index.jsp">返回</a>
    <table border="1">
      <tr>
        <th>film_id</th>
        <th>title</th>
        <th>description</th>
        <th>language</th>
        <th>edit</th>
      </tr>
      <c:forEach items="${allFilm}" var="film" varStatus="sta">
        <tr <c:if test="${sta.index%2==0 }">style="background-color: #FFE4E1"</c:if>>
        	<td>${film.film_id }</td>
        	<td>${film.title }</td>
        	<td>${film.description }</td>
        	<td>${film.language }</td>
        	<td><a href="deleteFilmServlet?fid=${film.film_id }">删除</a>&nbsp;<a href="selectFilmIdServlet?fid=${film.film_id }">修改</a></td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
