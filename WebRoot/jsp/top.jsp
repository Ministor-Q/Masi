
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<meta charset="UTF-8">
<meta author ="王启、谢世营、数学与统计学院网络部">
<div class="fd_header">
 <div class="fd_header_t">
  <div class="fd_main">
   <p class="fd_fl">
    <span class="sp_date" id="sp_date"></span>
    <span id="address"></span>
    <span class="sp_info"></span>
    <span id="weather"> </span>
   </p><!--
   <ul class="fd_ul_show">
    <li  class="li_item"><a title="设为首页" onclick="this.style.behavior='url(#default#homepage)';this.setHomePage('http://localhost:8080/jsp/homepage.jsp');" href="javascript:;">设为首页</a></li>
    <li  class="li_item">|</li>
    <li  class="li_item"><a href="javascript:void(0);"  >加入收藏</a></li>
    <li class="li_item li_icon  li_client"><a href="javascript:void(0);" class=""  title="保存当前模块" >电脑端</a></li>
    <li class="li_item li_icon li_change_skin">
     <a href="javascript:void(0);" class="change_skin">皮肤库</a>
     <ul class="fd_ul_skin_category">
      <li class="li_blue selected" colorValue="blue" title="蓝色"><i>蓝色</i></li>
      <li class="li_white" colorValue="white"><i class="white" title="白色">白色</i></li>
      <li class="li_green" colorValue="green"><i class="green" title="绿色">绿色</i></li>
      <li class="li_spring" colorValue="spring"><i class="" title="春天">春天</i></li>
      <li class="li_summer" colorValue="summer"><i class="" title="夏天">夏天</i></li>
      <li class="li_autumn" colorValue="autumn"><i class="" title="秋天">秋天</i></li>
      <li class="li_winter" colorValue="winter"><i class=""   title="冬天">冬天</i></li>
     </ul>
    </li>
   </ul>
  --></div>
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
 <!-- fd_header_m end -->
 <div class="fd_main_nav_contain">
  <div class="fd_main">
   <ul class="fd_main_nav">
    <li class="item li_active first">
     <a href="homepageAction" class="a_menu">
      <span class="sp_right">
       <span class="sp_center">首&nbsp;&nbsp;页</span>
      </span>
     </a>
     <div class="filter"></div>
     <ul class="main_nav_child" style="display:">
      
     </ul>
    </li>
    <li class="item">
     <a href="javascript:void(0);" class="a_menu"><span class="sp_right"><span class="sp_center">学院概况</span></span></a>
     <div class="filter"></div>
     <ul class="main_nav_child" style="display:">
      <li><a href="XyjjAction">学院简介</a></li>
      <li class="end"><a href="JgszAction">机构设置</a></li>
     </ul>
    </li>
    <li class="item">
     <a href="javascript:void(0);" class="a_menu"><span class="sp_right"><span class="sp_center">教学工作</span></span></a>
     <div class="filter"></div>
     <ul class="main_nav_child" style="display:">
      <li><a href="JxgzAction?attri=教学工作_教学动态&pages=1">教学动态</a></li>
      <li><a href="JxgzAction?attri=教学工作_教学成果&pages=1">教学成果</a></li>
      <li class="end"><a href="JxgzAction?attri=教学工作_教学管理&pages=1">教学管理</a></li>
     </ul>
    </li>
    <li class="item">
     <a href="javascript:void(0);" class="a_menu"><span class="sp_right"><span class="sp_center">科研工作</span></span></a>
     <div class="filter"></div>
     <ul class="main_nav_child" style="display:">
      <li><a href="KygzAction?attri=科研工作_学术交流&pages=1">学术交流</a></li>
      <li><a href="KygzAction?attri=科研工作_科研成果&pages=1">科研成果</a></li>
      <li class="end"><a href="KygzAction?attri=科研工作_研究所&pages=1">研究所</a></li>
     </ul>
    </li>
    <li class="item">
     <a href="javascript:void(0);" class="a_menu"><span class="sp_right"><span class="sp_center">人才培养</span></span></a>
     <div class="filter"></div>
     <ul class="main_nav_child" style="display:">
      <li><a href="RcpyAction?attri=人才培养_本科生培养&pages=1">本科生培养</a></li>
      <li class="end"><a href="RcpyAction?attri=人才培养_研究生培养&pages=1">研究生培养</a></li>
     </ul>
     
    </li>
    <li class="item">
     <a href="javascript:void(0);" class="a_menu"><span class="sp_right"><span class="sp_center">学生工作</span></span></a>
     <div class="filter"></div>
     <ul class="main_nav_child" style="display:">
      <li><a href="XsgzAction?attri=学生工作_团委学生会&pages=1">团委学生会</a></li>
		<li><a href="XsgzAction?attri=学生工作_班级风采&pages=1">班级风采</a></li>
		<li><a href="XsgzAction?attri=学生工作_考研就业&pages=1">考研就业</a></li>
		<li><a href="XsgzAction?attri=学生工作_学生获奖&pages=1">学生获奖</a></li>
		<li><a href="XsgzAction?attri=学生工作_院刊在线&pages=1">院刊在线</a></li>
     </ul>
    </li>
    <li class="item">
     <a href="javascript:void(0);" class="a_menu"><span class="sp_right"><span class="sp_center">新闻公告</span></span></a>
     <div class="filter"></div>
     <ul class="main_nav_child" style="display:">
      <li><a href="TzggAction?attri=新闻公告_新闻快讯&pages=1">新闻快讯</a></li>
      <li class="end"><a href="TzggAction?attri=新闻公告_通知公告&pages=1">通知公告</a></li>
     </ul>
    </li>
    <li class="item">
     <a href="javascript:void(0);" class="a_menu"><span class="sp_right"><span class="sp_center">党建工作</span></span></a>
     <div class="filter"></div>
     <ul class="main_nav_child" style="display:">
      <li><a href="DjgzAction?attri=党建工作_院党校&pages=1">院党校</a></li>
		<li><a href="DjgzAction?attri=党建工作_支部活动&pages=1">支部活动</a></li>
		<li><a href="DjgzAction?attri=党建工作_理论学习&pages=1">理论学习</a></li>
     </ul>
    </li>
    <li class="item">
     <a href="javascript:void(0);" class="a_menu"><span class="sp_right"><span class="sp_center">师资队伍</span></span></a>
     <div class="filter"></div>
     <ul class="main_nav_child" style="display:">
       	<li><a href="SzdwAction?attri=师资队伍_院领导&pages=1">院领导</a></li>
     	<li><a href="SzdwAction?attri=师资队伍_学院办公室&pages=1">学院办公室</a></li>
		<li><a href="SzdwAction?attri=师资队伍_应数教研室&pages=1">应数教研室</a></li>
		<li><a href="SzdwAction?attri=师资队伍_信科教研室&pages=1">信科教研室</a></li>
		<li><a href="SzdwAction?attri=师资队伍_统计教研室&pages=1">统计教研室</a></li>
		<li><a href="SzdwAction?attri=师资队伍_平台教研室&pages=1">平台教研室</a></li>
		<li><a href="SzdwAction?attri=师资队伍_实验室&pages=1">实验室</a></li>
     </ul>
    </li>
    <li class="item">
     <a href="javascript:void(0);" class="a_menu"><span class="sp_right"><span class="sp_center">资源下载</span></span></a>
     <div class="filter"></div>
     <ul class="main_nav_child" style="display:">
      <li><a href="CywjAction?attri=资源下载_常用文件&pages=1">常用文件</a></li>
      <li><a href="CywjAction?attri=资源下载_课件&pages=1">课件</a></li>
     </ul>
    </li>
   </ul>
   <!-- fd_main_nav end	 -->
  </div>
  <!-- fd_main end -->
 </div>
 <!-- fd_main_nav_contain end -->
</div>

