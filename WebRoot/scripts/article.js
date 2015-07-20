function openArticle(code){
	var addr = "OpenArticleAction?code="+code;
	document.location.href(addr);
	/*$.ajax({
		dataType:"text",
		type: "post",
        url:addr,
        data:{
		  
        },
        success:function(data){
        	$(".dd_con_ie6").css("display","none");
        	$(".fd_main_content2").css("display","block");
        	$(".fd_main_content2").html(data);
        }
	});*/
	
	
}