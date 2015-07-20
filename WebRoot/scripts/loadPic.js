$(document).ready(function() {
	var img = $(".fd_main_content2").find("img");
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