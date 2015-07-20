<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	Object user = session.getAttribute("user");
	if(user == null){
		response.sendRedirect("../login/login.jsp");
	}
%>
<!DOCTYPE HTML>
<html lang="en-US">
<head>
	<meta charset="UTF-8">
	<title>东北大学秦皇岛分校数学与统计学院</title>
	<link rel="stylesheet" type="text/css" href="../../css/import.css" media="all" />
	<link rel="stylesheet" type="text/css" href="" media="all"  id="changeSkin" />
</head>
<body onload="setFirstTitle()">
<div class="fd_header">
	<div class="fd_header_t">
  <div class="fd_main">
   <p class="fd_fl">
    <span class="sp_date" id="sp_date"></span>
    <span id="address"></span>
    <span class="sp_info"></span>
    <span id="weather"> </span>
   </p>
   <span style="float:right"><a href="upload.jsp">进入文件上传界面</a></span></div>
 </div>
 <!-- fd_header_tend -->
 <div class="fd_header_m">	
  <table class="fd_table_header">
   <tr>
    <td class="fd_l">&nbsp;</td>
    <td class="fd_m fd_main">
     <div class="fd_flash">
      <a href="" class="fd_logo">数学与统计学院</a>
     </div>
    </td>
    <td class="fd_r">&nbsp;</td>
   </tr>
  </table>
 </div>
<!-- fd_header end -->
<div class="fd_content" align="center" style="height: 500px;font-weight: bold;">

	<div class ="admin_manage">
		<form action="ManageAction" method="post" enctype="multipart/form-data">
		请选择一级模块：<select id="firstTitle" name="firstTitle" onchange="getsecondTitle()" style="min-width: 100px;"><option value="">请选择一级标题</option> </select>&nbsp;&nbsp;
		请选择二级模块：<select id="secondTitle" name="secondTitle" style="min-width: 100px;"><option value="">请选择二级标题</option></select>
		<input id="manage_btn" class="admin_upload_btn" type="submit" value="搜索">
		</form>
	</div>	
	<div style ="width:80%;background-color:transparent ;float:left; margin-left:120px;">
	<div class="fd_dl_01">
	<div class="dt_hd dt_hd_inpage">
						<span class="sp_title"><em></em>${sessionScope.secondTitle}</span>
					</div>
	<div class="dd_con  dd_con_ie6">
		<form id="delete_form" action="DeleteAction" method="post" enctype="multipart/form-data" onsubmit="return checkDel()">
	
						<div class="fd_news_list_contain">
							<ul class="fd_ul_news">
							<c:forEach items="${managePage.list}" var="manage">
								<li style="float:left;width:100%;text-align: left;">
	<input type="checkbox" name="file" style="display: inline;" value="${manage.code}" />
	<span>${manage.name}(${manage.loadtime})</span><br>
									
								</li>
								
								</c:forEach>
							</ul>
						</div>
						<div class="turn_page">
					<input id="delete_btn" class="admin_delete_btn" type="submit" value="删除" onclick="return checkSubmit()">
						
						<div id="page" style="float: right">
						<p>
						<span>
	<a id="prePage" href="ManageAction?attri=${sessionScope.manageAttri}&pages=${managePage.currentPage-1}"><</a>
	<c:choose>
	<c:when test="${ managePage.totalPage <=7 }">
	<c:forEach var="i" begin="1" end="${managePage.totalPage}" varStatus="status">
     <a href="ManageAction?attri=${sessionScope.manageAttri}&pages=${i}">${i}</a>  
	</c:forEach>
	
	</c:when>
	<c:when test="${  managePage.totalPage >7 && managePage.currentPage <=4 }">
	<c:forEach  var ="i" begin="1" end="7">
	<a href="ManageAction?attri=${sessionScope.manageAttri}&pages=${i}" >${i}</a>
	</c:forEach>
	<a href="#" class="a_point">..</a>
	<a href="ManageAction?attri=${sessionScope.manageAttri}&pages=${managePage.totalPage}">${ managePage.totalPage }</a>
	</c:when>
	<c:when test="${  managePage.totalPage >7 && managePage.currentPage >4 && managePage.currentPage <= (managePage.totalPage-4)}">
	<a href="ManageAction?attri=${sessionScope.manageAttri}&pages=1">1</a>
	<c:if test="${managePage.currentPage>5}">
	<a href="#" class="a_point">..</a></c:if>
	<c:forEach  var ="i" begin="${managePage.currentPage-3}" end="${managePage.currentPage+3}">
	<a href ="ManageAction?attri=${sessionScope.manageAttri}&pages=${i}">${i}</a>
	</c:forEach>
	<c:if test="${managePage.currentPage<managePage.totalPage-3}"><a href="#" class="a_point">..</a></c:if>
	<a href="ManageAction?attri=${sessionScope.manageAttri}&pages=${managePage.totalPage}">${ managePage.totalPage }</a>
	</c:when>
	<c:when test="${  managePage.totalPage >7 && managePage.currentPage >(managePage.totalPage-4)}">
	<a href="ManageAction?attri=${sessionScope.manageAttri}&pages=1">1</a>
	<a href="#" class="a_point">..</a>
	<!--<c:if test="${page.currentPage<page.totalPage-4}"><span>..</span></c:if>
	--><c:forEach var ="i" begin="${managePage.totalPage-6}" end="${managePage.totalPage}">
	<a href="ManageAction?attri=${sessionScope.manageAttri}&pages=${i}">${i}</a>
	</c:forEach>
	</c:when>
	
	</c:choose>
	<a id="nextPage" href="ManageAction?attri=${sessionScope.manageAttri}&pages=${managePage.currentPage+1}">></a>
	</span>		</p>			
						
		</div>				
    </div>
    </form>
    </div>
    </div>
    </div>

<!-- content end -->
<input id="currentPage" type="button" value="${managePage.currentPage}" style="display:none;">
<%@ include file="../foot.jsp" %>
<!-- footer end -->
<script type="text/javascript" src="../../scripts/jQuery.v1.11.1.min.js"></script>	
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=您的密钥"></script>
<script type="text/javascript" src="../../scripts/lunar.js"></script>
<script type="text/javascript" src="../../scripts/top.js"></script>
<script type="text/javascript" src="../../scripts/article.js"></script>
<script type="text/javascript" src="../../scripts/upload.js"></script>
<script type="text/javascript" src="../../scripts/homepage.js"></script>
<script type="text/javascript" src="../../scripts/jquery.cookie.js"></script>	
<script type="text/javascript" src="../../scripts/banner.min.js"></script>
<script type="text/javascript" src="../../scripts/tab.min.js"></script>  
<script type="text/javascript" src="../../scripts/scrollArea.js"></script>
<script type="text/javascript" src="../../scripts/global.js"></script>
<script type="text/javascript" src="../../scripts/mainNav.js"></script>
<script type="text/javascript">	
	$(document).ready(function(){
		if(typeof document.body.style.maxHeight=="undefined"){
			$(".fd_ul_show .li_icon a,.sp_weather,.fd_logo,.fd_more,.fd_btn_pre,.fd_btn_next,.sp_icon,.fd_tab_05 a,.fd_ul_05 a,.fd_img_contain").addClass("png_bg");
		}
		var current =$("#currentPage").val();
		if(current==null || current==""){
			document.getElementById("prePage").href="javascript:void(0)";
			document.getElementById("nextPage").href="javascript:void(0)";
			return;
		}
		var a =$("#page").find("a");
		for(var i=0;i<a.length;i++){
		if(a[i].innerHTML == current){
		a[i].style.backgroundColor="#ffae00";
		}
		}
		if(current==1){
		a[0].href="#";
		}if(current==a[a.length-2].innerHTML){
		a[a.length-1].href="#";
		}
	});
	function checkSubmit(){ 
		var file = document.getElementsByName("file");
		for(var i = 0; i < file.length; i++){
			if(file[i].checked == true)
				return true;
		}
		alert("请选择要删除的文件");
		return false;
	}
	function checkDel(){
		var msg = "是否确定删除选中的文件？";
		if(confirm(msg)==true){
			return true;
		}else{
			return false;
		}
	}
</script>
</body>
</html>