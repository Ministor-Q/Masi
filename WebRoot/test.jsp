<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>My JSP 'test.jsp' starting page</title>
    
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <div >
	<a><</a>
	<c:choose>
	<c:when test="${ page.allRow <=7 }">
	<c:forEach items="${page.allRow}" var="list">
	<a>${list}</a>
	</c:forEach>
	
	</c:when>
	<c:when test="${ page.allRow >=7 }">
	<c:when test="${ page.currentPage <=4 }">
	<c:forEach items ="${page.currentPage}" var ="list">
	<a>${list}</a>
	</c:forEach>
	..
	<a>${ page.allRow }</a>
	</c:when>
	<c:when test="${ page.currentPage >4 && page.currentPage< (page.allRow-3)}">
	<a>1</a>
	..
	
	<c:forEach items ="${page.currentPage}" var ="list" begin="${page.currentPage-3}" end="${page.currentPage-3}">
	<a>${list}</a>
	</c:forEach>
	..
	<a>${ page.allRow }</a>
	</c:when>
	<c:when test="${ page.currentPage >(page.allRow-3)}">
	<a>1</a>
	..
	
	<c:forEach items ="${page.currentPage}" var ="list" begin="${page.currentPage-3}" >
	<a>${list}</a>
	</c:forEach>
	</c:when>
	
	</c:when>
	
	</c:choose>
	<a>></a>
	</div>
  </body>
</html>
