var s="";
var cityshi="";
$(document).ready(function(){
	//alert("触发top.js");
	  findDate();
	 // ipaddress();
	 // cityshi =s;
	  //findWeather();
});
function  findDate(){
	 var arr = ["日","一","二","三","四","五","六"],weekDay;
	   var myDate = new Date();
	   myDate.getYear();        //获取当前年份(2位)
	   myDate.getFullYear();    //获取完整的年份(4位,1970-????)
	   myDate.getMonth();       //获取当前月份(0-11,0代表1月)
	   myDate.getDate();        //获取当前日(1-31)
	   myDate.getDay();         //获取当前星期X(0-6,0代表星期天)
	   myDate.getTime();        //获取当前时间(从1970.1.1开始的毫秒数)
	   myDate.getHours();       //获取当前小时数(0-23)
	   myDate.getMinutes();     //获取当前分钟数(0-59)
	   myDate.getSeconds();     //获取当前秒数(0-59)
	   myDate.getMilliseconds();    //获取当前毫秒数(0-999)
	  // alert(myDate.toLocaleDateString());     //获取当前日期
	   var str =  "今天是"+myDate.toLocaleDateString()+"("+GetCNDate()+")  星期"+arr[myDate.getDay()];
	   $("#sp_date").html(str);
	  
}

function findWeather(cityshi) {
	//alert("111");
	var cityname =cityshi.substring(0, cityshi.length-1);
	if(""==cityname){
		return;
	}
	//alert(cityname);
	//var cityname ="秦皇岛"
	$.getScript("http://php.weather.sina.com.cn/js.php?" + $.param({
	    city : cityname , //城市
	    day : 0,
	    password : "DJOYnieT8234jlsK"
	}) , function(json){
		if(status1==""||temperature1==""){
		return ;
	}
		$("#address").html("当前所在城市:"+cityname);
		 $("#weather").html("今日天气情况："+status1+"  "+temperature1+"°");
		 
	    //alert('地址：' + cityname + '\n天气：' + status1 + '\n温度' + temperature1 + '°');
	});
}
function ipaddress(){
	
if (navigator.geolocation)
{
navigator.geolocation.getCurrentPosition(showPosition, showErr);
}
function showPosition(position){
//alert(position.coords.latitude+','+position.coords.longitude);
// ak = appkey 访问次数流量有限制
$.getJSON('http://api.map.baidu.com/geocoder/v2/?ak=71709218d45a706b9c7e3abc2f037b23&callback=?&location='+position.coords.latitude+','+position.coords.longitude+'&output=json&pois=1', function(res){
        //addressComponent => {city: "广州市", district: "天河区", province: "广东省", street: "广州大道", street_number: "中922号-之101-128"} 
    //s = res.result.addressComponent.city;
   // alert(s);
	findWeather(res.result.addressComponent.city);
});
}

function show(msg){
//alert(msg)
}
function showErr(error){
var result;
switch(error.code) 
{
case error.PERMISSION_DENIED:
  result="User denied the request for Geolocation."
  break;
case error.POSITION_UNAVAILABLE:
  result="Location information is unavailable."
  break;
case error.TIMEOUT:
  result="The request to get user location timed out."
  break;
case error.UNKNOWN_ERROR:
  result="An unknown error occurred."
  break;
}
//alert(result);
}
return s;
}
$(document).ready(function(){
	var loadtime = $(".fd_ul_news").find("li").find("span");
	//alert(loadtime)
	if(loadtime==null){
	}else{
		for(var i =0;i<loadtime.length;i++){
			//alert(loadtime[i].outerText)
		loadtime[i].innerHTML =loadtime[i].outerText.split(" ")[0];
		}
	}
	var current =$("#currentPage").val();
	if(current==null){
		return;
	}
	var a =$("#page").find("a");
	for(var i=0;i<a.length;i++){
	if(a[i].innerHTML == current){
	a[i].style.backgroundColor="#ffae00";
	}
	}
	if(current==1){
	a[0].href="#";
	}if(current==a[a.length-2].innerHTML){
	a[a.length-1].href="#";
	}
	});