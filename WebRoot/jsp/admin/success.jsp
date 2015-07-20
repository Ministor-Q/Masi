<%@page import="bsh.Console"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	Object user = session.getAttribute("user");
	if(user == null){
		response.sendRedirect("../login/login.jsp");
	}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录成功</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  	<div style="position:absolute;left:38%;top:38%">
  		<br/>
  		<span>&nbsp;&nbsp;&nbsp;&nbsp;您已成功登录，请选择下一步操作：</span><br/>
  		<br/>
	  	<a href="./jsp/admin/manage.jsp">进入文件管理界面</a>&nbsp;&nbsp;&nbsp;&nbsp;
	    <a href="./jsp/admin/upload.jsp">进入文件上传界面</a>
  	</div>
    
  </body>
</html>
