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
  <body >
    <%@ include file="../top.jsp" %>
   <div class="fd_content">
	<div class="fd_main">
		<div class="fd_layout_row fd_mb15" id="jgszArticle" style="height:auto;">
		<div class="fd_layout_row fd_rcpy" style ="width:15%;height:400px;float: left">
		<!-- 此处可以将来用js来操纵这段代码，将可用来更好实现，否则业务层或需求改变 改动太大 -->
		<div class="xwgg_title"><a href="SzdwAction?attri=师资队伍_院领导&pages=1">院领导</a></div>
     	<div class="xwgg_title"><a href="SzdwAction?attri=师资队伍_学院办公室&pages=1">学院办公室</a></div>
		<div class="xwgg_title"><a href="SzdwAction?attri=师资队伍_应数教研室&pages=1">应数教研室</a></div>
		<div class="xwgg_title"><a href="SzdwAction?attri=师资队伍_信科教研室&pages=1">信科教研室</a></div>
		<div class="xwgg_title"><a href="SzdwAction?attri=师资队伍_统计教研室&pages=1">统计教研室</a></div>
		<div class="xwgg_title"><a href="SzdwAction?attri=师资队伍_平台教研室&pages=1">平台教研室</a></div>
		<div class="xwgg_title"><a href="SzdwAction?attri=师资队伍_实验室&pages=1">实验室</a></div>
		</div>
		<div style ="width:80%;background-color:red;float:left; margin-left:20px;">
		<div class="fd_dl_01">
					<div class="dt_hd dt_hd_inpage">
						<span class="sp_title"><em></em>${sessionScope.attri}</span>
					</div>
					<div class="dd_con  dd_con_ie6">
						<div class="fd_news_list_contain">
							<ul class="fd_ul_news">
							<c:forEach items="${page.list}" var="szdw">
								<li><a href="OpenArticleAction?code=${szdw.szdwcode}">${szdw.szdwname}</a><i class="i_text">&nbsp;&nbsp;(${szdw.szdwreadednum})</i>
									<span class="sp_right">${szdw.szdwloadtime}</span>
								</li>
								
								</c:forEach>
							</ul>
							
						</div>
						<div class="turn_page">
						<div id="page" style="float: right">
						<p>
						<span>
	<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${page.currentPage-1}"><</a>
	<c:choose>
	<c:when test="${ page.totalPage <=7 }">
	<c:forEach var="i" begin="1" end="${page.totalPage}" varStatus="status">
     <a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${i}">${i}</a>  
	</c:forEach>
	
	</c:when>
	<c:when test="${  page.totalPage >7 && page.currentPage <=4 }">
	<c:forEach  var ="i" begin="1" end="7">
	<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${i}">${i}</a>
	</c:forEach>
	<a href="#" class="a_point">..</a>
	<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${page.totalPage}">${ page.totalPage }</a>
	</c:when>
	<c:when test="${  page.totalPage >7 && page.currentPage >4 && page.currentPage <= (page.totalPage-4)}">
	<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=1">1</a>
	<c:if test="${page.currentPage>5}">
	<a href="#" class="a_point">..</a></c:if>
	<c:forEach  var ="i" begin="${page.currentPage-3}" end="${page.currentPage+3}">
	<a href ="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${i}">${i}</a>
	</c:forEach>
	<c:if test="${page.currentPage<page.totalPage-4}"><a href="#" class="a_point">..</a></c:if>
	<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${page.totalPage}">${ page.totalPage }</a>
	</c:when>
	<c:when test="${  page.totalPage >7 && page.currentPage >(page.totalPage-4)}">
	<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=1">1</a>
	<a href="#" class="a_point">..</a>
	<!--<c:if test="${page.currentPage<page.totalPage-4}"><span>..</span></c:if>
	--><c:forEach var ="i" begin="${page.totalPage-6}" end="${page.totalPage}">
	<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${i}">${i}</a>
	</c:forEach>
	</c:when>
	
	</c:choose>
	<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${page.currentPage+1}">></a>
	</span>		</p>			
						
		</div>			
						
						
						<!--<div id="page" style="float: right">
					共 "${page.allRow}"条记录 &nbsp;共 ${page.totalPage}页  &nbsp;&nbsp;当前第 ${page.currentPage}页<br /> 
			<c:choose>
			<c:when test="${page.currentPage == 1}">
			第一页 上一页
　　　　</c:when> <c:otherwise>
				<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=1">第一页</a>
				<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${page.currentPage-1}">上一页</a>
			</c:otherwise>
			</c:choose>
			<c:choose>
			 <c:when test="${page.currentPage!= page.totalPage}">
				<a
					href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${page.currentPage+1}">下一页</a>&nbsp;
				<a href="SzdwAction?attri=师资队伍_${sessionScope.attri}&pages=${page.totalPage}">最后一页</a>
			</c:when> <c:otherwise>
　　　　　　下一页 最后一页
　　　　</c:otherwise>
</c:choose>
	</div>
	--><!--<button value="${page.currentPage+1}"></button>
	<button value="${page.currentPage}"></button>
	<button value="${page.totalPage}"></button>
	<button value="${page.allRow}"></button>
							--><!--<p>
								<span class="sp_pre sp_click sp_gray">
									<a href="javascript:void(0)"><</a>
								</span>
								<span class="sp_count">
									<a href="javascript:void(0)">1</a>
									<a href="javascript:void(0)">2</a>
									<a href="javascript:void(0)">3</a>
									<a href="javascript:void(0)" class="on">4</a>
									<a href="javascript:void(0)" class="a_point">...</a>
									<a href="javascript:void(0)" class="end">30</a>
								</span>
								<span class="sp_next "><a href="javascript:void(0)"><em>></em></a></span>
							</p>
						 --></div>
						 <!-- turn_page end -->
					</div>
		<div class="fd_main_content2" style="display: none;min-height: 500px;"></div>
					
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
<script type="text/javascript" src="../../scripts/jquery.cookie.js"></script>	
<script type="text/javascript" src="../../scripts/banner.min.js"></script>
<script type="text/javascript" src="../../scripts/tab.min.js"></script>  
<script type="text/javascript" src="../../scripts/scrollArea.js"></script>
<script type="text/javascript" src="../../scripts/global.js"></script>
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
