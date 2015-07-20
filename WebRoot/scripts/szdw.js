/*function loadSzdwPic(){
	 alert("111");
	var a =$(".fd_news_list_contain").find(".fd_news_list_main");
	alert(a.length)
	for(var i =0;i<a.length;i++){
		alert($(".szdwimg")[0].)
		var szdwimg =	$(".szdwimg")[i].text();
		alert(szdwimg)
	a[i].find("img").src =szdwimg;
	}
}*/
$(document).ready(function() {
	var img = $(".fd_news_list_main").find("img");
	if (img.length == 0) {
		return;
	}
	var attri = "GetPicBase64Action?param=(";
	for ( var i = 0; i < img.length; i++) {
		if (i == img.length - 1) {
			attri += "" + i + "=" + img[i].src;
		} else {
			attri += "" + i + "=" + img[i].src + ",";
		}
	}
	attri += ")";
	$.ajax({
		dataType : "text",
		type : "post",
		url : attri,
		data : {

		},
		success : function(data) {
			var imgsrc = eval("(" + data + ")");
			for ( var i = 0; i < img.length; i++) {
				img[i].src = "data:image/jpg;base64," + imgsrc[i];
			}
		}
	});

});