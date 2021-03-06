<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="en-US">
<head>
 <meta charset="UTF-8">
 <title>东北大学秦皇岛分校数学与统计学院</title>
 <link rel="stylesheet" type="text/css" href="../../css/import.css" media="all" />
 <link rel="stylesheet" type="text/css" href="" media="all"  id="changeSkin" />
</head>
  <body onload ="getXyjjArticle()">
    <%@ include file="../top.jsp" %>
   <div class="fd_content">
	<div class="fd_main">
		<div class="fd_layout_row fd_mb15" id="jgszArticle" style="height:auto;">
		<div class="fd_layout_row fd_rcpy" style ="width:15%;height:400px;float: left">
		<!-- 此处可以将来用js来操纵这段代码，将可用来更好实现，否则业务层或需求改变 改动太大 -->
  <div class="xwgg_title"><a href="DjgzAction?attri=党建工作_院党校&pages=1">院党校</a></div>
		<div class="xwgg_title"><a href="DjgzAction?attri=党建工作_支部活动&pages=1">支部活动</a></div>
		<div class="xwgg_title"><a href="DjgzAction?attri=党建工作_理论学习&pages=1">理论学习</a></div>
				</div>
		<div style ="width:80%;background-color:red;float:left; margin-left:20px;">
		<div class="fd_dl_01">
					<div class="dt_hd dt_hd_inpage">
						<span class="sp_title"><em></em>${sessionScope.attri}</span>
					</div>
					<div class="dd_con  dd_con_ie6">
						<div class="fd_main_content2" style="min-height: 500px;">
						<span style="letter-spacing: 2px;line-height:24px;">
						${article}
						</span>
						</div>
					</div>
				</div>
		</div>
	</div>
	</div>
	<!-- fd_main end -->
</div>
    
        <input id="currentPage" type="button" value="${page.currentPage}" style="display:none;">
    
    
    <%@ include file="../foot.jsp" %>
  </body>
</html>
<script type="text/javascript" src="../../scripts/jQuery.v1.11.1.min.js"></script>	
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=您的密钥"></script>
<script type="text/javascript" src="../../scripts/article.js"></script>
<script type="text/javascript" src="../../scripts/jquery.cookie.js"></script>	
<script type="text/javascript" src="../../scripts/banner.min.js"></script>
<script type="text/javascript" src="../../scripts/tab.min.js"></script>  
<script type="text/javascript" src="../../scripts/scrollArea.js"></script>
<script type="text/javascript" src="../../scripts/global.js"></script>
<script type="text/javascript" src="../../scripts/loadPic.js"></script>
<script type="text/javascript" src="../../scripts/mainNav.js"></script>
<script type="text/javascript" src="../../scripts/lunar.js"></script>
<script type="text/javascript" src="../../scripts/top.js"></script>
<script type="text/javascript" src="../../scripts/article.js"></script>
<script type="text/javascript">	
	$(document).ready(function(){
		if(typeof document.body.style.maxHeight=="undefined"){
			$(".fd_ul_show .li_icon a,.sp_weather,.fd_logo,.fd_more,.fd_btn_pre,.fd_btn_next,.sp_icon,.fd_tab_05 a,.fd_ul_05 a,.fd_img_contain").addClass("png_bg");
		}
	});
	/*-----------------------  连续无间断滚动，朝左滚动  -----------------------*/
	$("#js_banner_left_twin").addBanner({
			effect : "twin",
			index : 0,
			selectedClass : "on",
			classType : "only",
			mouseType : "click",
			tweenTime : 300,
			delay : 4000,
			autoPlay : true,
			handlePrev:".sp_pre",
			handleNext:".sp_next",
			ease : "swing",
			isVertical:false,
			isFullScreen:false,
			callBack : function(index){
				var _text=$("#js_banner_left_twin").find(".con" ).children(":eq("+index+")").find("img").attr("alt");
				$(".fd_banner_title").text(_text);
			},
			handleContain:".d_btn"
		});
	/*-----------------------  tab 切换  -----------------------*/	
	$(".js_news_tab").addTab({	
		index : 0,
		selectedClass : "on",
		classType : "only",
		mouseType : "click",
		isFade : false,
		callback:function(index){
			if(index==0){
				$(".js_news_tab .fd_nav li").removeClass("li_prev");
			}else {
				$(".js_news_tab .fd_nav li:eq("+index+")").prev().addClass("li_prev").siblings().removeClass("li_prev");
			}
		}
	});	
	$(".js_tab_04").addTab({index : 0,selectedClass : "active"});
	$(".js_tab_05").addTab({
			index : 0,
			selectedClass : "on",
			classType : "only",			
			mouseType : "click",
			isFade : true,
			tweenTime : 500,
			autoPlay : false,
			delay : 6000
		});
	/*-----------------------  滚动区域   -----------------------*/	
	$(".fd_scroll_area").addScrollAble({
			index : 0,
			dir : "h",										
			step : 5,
			handlePrevious:".fd_btn_pre",	
			handleNext:".fd_btn_next",	
			clientStep:5,	
			tweenTime:500,				
			mosueType : "click",
			selectedClass : "on",
			autoPlay : true,
			delay : 3000,
			reverse:false
	});	
		
</script>
