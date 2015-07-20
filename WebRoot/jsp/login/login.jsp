<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录学院管理系统</title>
<script src="jsp/login/jquery-1.8.0.min.js" type="text/javascript" ></script>
<script src="jsp/login/JPlaceholder.js" type="text/javascript"></script>

<link rel="stylesheet" type="text/css" href="jsp/login/register.css"/>

<style type="text/css">
<!--
.STYLE1 {
	font-size: 50px;
	font-family: "楷体";
	color: #66FFFF;
}
-->
</style>
</head>
<body>


<div class='signup_container'>

    <h1 class='signup_title'>用户登录</h1>
    <img src='jsp/login/images/people.png' id='admin'/>
    <div id="msg" align="center" style="color:red;font:bold 14px/1.4 'microsoft yahei'"><span>${result}</span></div>
     <form action ="LoginAction" class="signup_form_form" id="signup_form" >
    <div id="signup_forms" class="signup_forms clearfix">
                    <div class="form_row first_row">
                        <label for="signup_email">请输入用户名</label>
                        <input type="text" name="username" placeholder="请输入用户名" id="signup_name" data-required="required">
                    </div>
                    <div class="form_row">
                        <label for="signup_password">请输入密码</label>
                        <input type="password" name="userpwd" placeholder="请输入密码" id="signup_password" data-required="required">
                    </div>
                   
          
    </div>

    <div class="login-btn-set"><input id="login_btn" type="submit" class="login-btn" value=""></input></div>
     </form>
     
    <p class='copyright'>版权所有 东北大学秦皇岛分校数学与统计学院</p>
</div>

</body>

<script type="text/javascript">

$(function(){

    $('.rem').click(function(){
        $(this).toggleClass('selected');
    });

    $('#signup_select').click(function(){
        $('.form_row ul').show();
        event.cancelBubble = true;
    });

    $('#d').click(function(){
        $('.form_row ul').toggle();
        event.cancelBubble = true;
    });

    $('body').click(function(){
        $('.form_row ul').hide();
    });

    $('.form_row li').click(function(){
        var v  = $(this).text();
        $('#signup_select').val(v);
        $('.form_row ul').hide();
    });
    
    $("#login_btn").click(function(){
    	var username = document.getElementById("signup_name").value;
    	var userpwd = document.getElementById("signup_password").value;
	    if(username == ""){
	   		 $("#msg").html("请输入用户名");
	   		document.getElementById("signup_name").focus();
	   		return false;
	   	}else{
	   		document.getElementById("signup_name").style.border="";
	   	}
	   	if(userpwd == ""){
	   		$("#msg").html("请输入密码");
	   		document.getElementById("signup_password").focus();
	   		return false;
	   	}else{
	   		document.getElementById("signup_password").style.border="";
	   	}
	 
	});
});
</script>

</html>