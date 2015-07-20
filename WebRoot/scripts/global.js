/*javascript document*/
+function($,window){
	$(function(){
	
	
	// tab 切换
	$(".js_tab_02 >li,.js_tab_03 >li").mouseover(function(){
		var _index=$(this).index();	
		$(this).addClass("active").siblings().removeClass("active");
		$(this).parents(".fd_dl_01").find(".dd_con").children(":eq("+_index+")").show().siblings().hide();
	});
	// 初始化
	$(".js_tab_02 >li:nth-child(1),.js_tab_03 >li:nth-child(1)").trigger("mouseover");
	
	//  js_tab_02 居中显示
	$(".js_tab_05 .index").css({
		"marginTop" : -$(".js_tab_05 .index").innerHeight() / 2
	});
	
	

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/***************************************
		* 改变皮肤函数
		****************************************/
		function switchSkin(id,skinName){		
			$(id).attr("href","css/theme_"+skinName+".css");//设置不同的皮肤
			$(id).attr("href","css/theme_"+skinName+".css");//设置不同的皮肤
			$(".fd_ul_skin_category >li.li_"+skinName).addClass("selected").siblings().removeClass("selected");//设置不同的皮肤
			$.cookie("myCssSkin",skinName,{ path:'/',expires:10});	
		};
		
		/***************************************
		* 初始化皮肤函数
		****************************************/
		function innitialSkin(id){
			var cookie_skin=$.cookie("myCssSkin");
			if(cookie_skin){
					switchSkin(id,cookie_skin);
				}
		}
		
		/***************************************
		* 改变皮肤
		****************************************/
		
		innitialSkin("#changeSkin");   // 初始化
		
		$(".fd_ul_skin_category >li").click(function (e) {		// 点击切换
			$(this).addClass("selected").siblings().removeClass("selected");
			var colorValue = $(this).attr("colorValue");
				$(this).parent().slideUp();
				switchSkin("#changeSkin",colorValue);
			
		});
	
		$(document).click(function (e) {		//  文档点击事件，如果不是目标元素，那么直接换肤消失
		
			var _obj = $(e.target);
			//console.log("是否是改变皮肤的元素\n"+_obj.hasClass("change_skin"))
			var _flag = _obj.hasClass("change_skin") || _obj.hasClass("current_skin") || _obj.hasClass("sp_gain_value") || _obj.hasClass("sp_trigger");
			if (_flag) {
				_obj.parents(".li_change_skin").find(".fd_ul_skin_category").slideToggle();
			} else {
				$(".fd_ul_skin_category").slideUp()

			};

		});
	
	
	
	
	
})}(jQuery,window);

