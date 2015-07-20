/*
scripts * 获取学院简介文章
 * */
function getXyjjArticle(){
		  $.ajax({
              type: 'POST',
              url: "xyjjArticle",
              data: "", //p是参数名，s是值
              contentType: "application/json; charset=utf-8",//(可以)
              success: function (msg) {
                $("#xyjjArticle").html(msg);
              }
          });
		  // var a =  '<% = Session["math"]%>';
		//  alert(a);
		 // $(".js_news_tab .fd_nav li:eq("+2+")").prev().addClass("li_prev").siblings().removeClass("li_prev");
}