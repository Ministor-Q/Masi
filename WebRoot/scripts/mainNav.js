$(document).ready(function(){
	// 给导航绑定点击事件
	$(".fd_main_nav>li").click(function () {
		$(this).addClass("li_active").siblings().removeClass("li_active");
	});
	// 给每个子菜单赋值
	$(".fd_main_nav .main_nav_child").each(function(){
		$(this).css({
			width  : $(this).parent().width()-2+"px"
		});	
	});
	//  透明区域
	$(".fd_main_nav .filter").each(function () {	
		var  height = $(this).parent().find(".main_nav_child").outerHeight();
		$(this).css({
			height : height
		});
	});
	
	//  main  navigation
	$(".fd_main_nav").children("li").hover(function () {
		$(this).addClass("li_item_hover");	
		$(this).children("ul").stop(true, true).slideDown(400).css("z-index", 999);
		$(this).children(".filter").stop(true, true).slideDown(400).css("z-index", 999);
	},function () {
		$(this).removeClass("li_item_hover");		
		$(this).children("ul").stop(true, true).slideUp("fast");
		$(this).children(".filter").stop(true, true).slideUp("fast");
	});

});	