function loadData(){
	var addr = "GetHomepageDataAction";
	$.ajax({
		/*dataType:"text",*/
		type: "post",
        url:addr,
        data:{
        },
        success:function(data){
        	var title = eval("("+data+")");
        	setXwkx(title.xwkx);
        	setTzgg(title.tzgg);
        	setBjfc(title.bjfc);
        	setCywj(title.cywj);
        	setSy(title.sy);
        	/*var xwkx = title.xwkx;
        	var a =new Array();
        	 a =eval("("+xwgg+")");
        	//var xwgg0 = eval("("+a[0]+")");
        	for(var i=0;i<5;i++){
        		var xwgg0 = eval("("+a[i]+")");
        		var newa =$(".fd_ul_news").find("li").find("a");
        		var tzgg =$(".fd_ul_tzgg").find("li").find("a");
        		tzgg[i].innerHTML =xwgg0.xwggname;
        		newa[i].innerHTML =xwgg0.xwggname;
        		newa[i].onclick="openArticle("+"\'"+xwgg0.xwggcode+"\'"+")";
        	}*/
        	//var xwgg0 =a.0;
        	/*$(".dd_con_ie6").css("display","none");
        	$(".fd_main_content2").css("display","block");
        	$(".fd_main_content2").html(data);*/
        }
	});

}
function openArticle(code){
	var addr = "OpenArticleAction?code="+code;
	document.location.href(addr);
	
}
function setXwkx(xwkxList){
	var xwkxli =eval("("+xwkxList+")");
	for(var i=0;i<9;i++){
		var xwkx = eval("("+xwkxli[i]+")");
		if(xwkx==null){
			break;
		}
		var xwkxnew =$("#fd_ul_xwkx").find("li").find("a");
		xwkxnew[i].innerHTML =xwkx.xwggname;
		xwkxnew[i].href="OpenArticleAction?code="+xwkx.xwggcode;
		var loadtime = $("#fd_ul_xwkx").find("span");
		var time = xwkx.xwggloadtime;
		loadtime[i].innerHTML =(time.month+1)+"-"+(time.date)+"";

	}
}
function setBjfc(bjfcList){
	var bjfcli =eval("("+bjfcList+")");
	for(var i=0;i<5;i++){
		var bjfc = eval("("+bjfcli[i]+")");
		if(bjfc==null){
			break;
		}
		var bjfcnew =$("#fd_ul_bjfc").find("li").find("a");
		bjfcnew[i].innerHTML =bjfc.xsgzname;
		bjfcnew[i].href="OpenArticleAction?code="+bjfc.xsgzcode;
		var loadtime = $("#fd_ul_bjfc").find("span");
		var time = bjfc.xsgzloadtime;
		loadtime[i].innerHTML =(time.month+1)+"-"+(time.date)+"";

	}
}
function setTzgg(tzggList){
	var tzggli =eval("("+tzggList+")");
	for(var i=0;i<5;i++){
		var tzgg = eval("("+tzggli[i]+")");
		if(tzgg==null){return;}
		var tzggnew =$("#fd_ul_tzgg").find("li").find("a");
		tzggnew[i].innerHTML =tzgg.xwggname;
		tzggnew[i].href="xwgg/OpenArticleAction?code="+tzgg.xwggcode;
		var loadtime = $("#fd_ul_tzgg").find("span");
		var time = tzgg.xwggloadtime;
		loadtime[i].innerHTML =(time.month+1)+"-"+(time.date)+"";
		
	}
}
function setSy(syList){
	var syli =eval("("+syList+")");
	for(var i=0;i<6;i++){
		var sy = eval("("+syli[i]+")");
		if(sy==null){return;}
		var syimg =$("#js_banner_left_twin").find("ul").find("li").find("img");
		 var url = "data:image/png;base64," + sy.sypiccode;
		 syimg[i].src=url;
		 syimg[i].alt=sy.syname;
		 if(i==0){
		 $(".fd_banner_title").text(syimg[0].alt);
		 //$(".fd_banner_title").text(sy.syname);
		 }
		 var sya =$("#js_banner_left_twin").find("ul").find("li").find("a");
		 sya[i].href = "OpenArticleAction?code="+sy.sycode+"";
	}
	
}
function setCywj(cywjList){
	var cywjli =eval("("+cywjList+")");
	for(var i=0;i<9;i++){
		var cywj= eval("("+cywjli[i]+")");
		if(cywj==null){
			return;
		}
		var cywjnew =$("#fd_ul_cywj").find("li").find("a");
		cywjnew[i].innerHTML =cywj.zyxzname;
		cywjnew[i].href ="DownloadAction?zyxzcode="+cywj.zyxzcode+"";
		var loadtime = $("#fd_ul_cywj").find("span");
		var time = cywj.zyxzloadtime;
		loadtime[i].innerHTML =(time.month+1)+"-"+(time.date)+"";
	}
}
function goHref(str){
	var option1=$("#getCompusNavi option:selected");
	var option2=$("#getAnotherNavi option:selected");
	if(str=="1"){
		document.location.href(option1.val());
	}else if(str=="2"){
		document.location.href(option2.val());
	}
	
}
