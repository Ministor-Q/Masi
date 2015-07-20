<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
   <span style="float:right"><a href="manage.jsp">进入文件删除界面</a></span>
   </div>
  <!-- fd_main end -->
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
<div class="fd_content" align="center" style="height: 800px;font-weight: bold;">
<div class ="admin_upload">
<form action="UploadAction" method="post" enctype="multipart/form-data" >
请选择一级模块：<select name="firstTitle" id="firstTitle" onchange="getsecondTitle()" style="min-width: 150px;"><option value="">请选择一级标题</option> </select>&nbsp;&nbsp;
请选择二级模块：<select name="secondTitle" id="secondTitle" style="min-width: 150px;"><option value="">请选择二级标题</option></select><br/>
<p>请选择上传文件：<input type="file" id="upload" name ="upload" accept=".doc," onchange="judge()">
<div id="uploadpic" style="display:none">
请上传首页图片:<input type="file" id="uploadpic" name ="uploadpic" onchange="judge()" accept=""><br>
请选择文章所属目录：<br>
请选择一级模块：<select name="firstTitle1" id="firstTitle1" onchange="getsecondTitle1()" style="min-width: 150px;"><option value="">请选择一级标题</option> </select>&nbsp;&nbsp;
请选择二级模块：<select name="secondTitle1" id="secondTitle2" style="min-width: 150px;"><option value="">请选择二级标题</option></select><br/>
</div>
上传时间：<input type="text" id="nowtime" name="nowtime" style="width:150px;height: 40px;line-height: 40px;" value=""><br>
</p>请输入关键字：<br/>
<input type="text" id="keyword" name="keyword" style="width:500px;height: 40px;line-height: 40px;" /><br>
<!--<textarea name="keyword" rows="5" cols="50"  style="overflow-y:visible"  ></textarea><br/>-->
			<input class="admin_upload_btn" id ="admin_upload_btn" disabled="disabled" type="submit" value="上传" onclick="return judgeUpload()">&nbsp;&nbsp;<input class="admin_upload_btn" type="reset" value="取消">
	</form>	
</div>	
	<!-- fd_main end -->
</div>
</div>
<!-- content end -->
<%@ include file="../foot.jsp" %>
<!-- footer end -->
<script type="text/javascript" src="../../scripts/jQuery.v1.11.1.min.js"></script>	
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=您的密钥"></script>
<script type="text/javascript" src="../../scripts/jquery.cookie.js"></script>	
<script type="text/javascript" src="../../scripts/banner.min.js"></script>
<script type="text/javascript" src="../../scripts/tab.min.js"></script>  
<script type="text/javascript" src="../../scripts/scrollArea.js"></script>
<script type="text/javascript" src="../../scripts/global.js"></script>
<script type="text/javascript" src="../../scripts/mainNav.js"></script>
<script type="text/javascript" src="../../scripts/upload.js"></script>
<script type="text/javascript" src="../../scripts/lunar.js"></script>
<script type="text/javascript" src="../../scripts/top.js"></script>
<script type="text/javascript" src="../../scripts/article.js"></script>
<script type="text/javascript" src="../../scripts/homepage.js"></script>
<script type="text/javascript">	
	$(document).ready(function(){
		if(typeof document.body.style.maxHeight=="undefined"){
			$(".fd_ul_show .li_icon a,.sp_weather,.fd_logo,.fd_more,.fd_btn_pre,.fd_btn_next,.sp_icon,.fd_tab_05 a,.fd_ul_05 a,.fd_img_contain").addClass("png_bg");
		}
		var d = new Date();
		var year = d.getFullYear();
		var month = d.getMonth() + 1;
		month=month < 10 ? ("0" + month) : month; // 记得当前月是要+1的
		var dt = d.getDate();
		dt=dt < 10 ? ("0" + dt) : dt;
		var today = year + "-" + month + "-" + dt;
		$("#nowtime").val(today);
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
	/*-----------------------  新闻tab 切换  -----------------------*/	
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
<!--[if IE 6]>
<script src="../scripts/DD_belatedPNG_0.0.8a-min.js"></script>
<script>
	DD_belatedPNG.fix('.png_bg');
</script>
<![endif]-->
</body>
</html>