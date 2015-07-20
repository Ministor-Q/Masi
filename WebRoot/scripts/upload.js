/*
 * mark数组分别代表意思
 * 0--firstTitle
 * 1--secondTitle
 * 2--upload
 * 3--uploadpic
 * 4--firstTitle1
 * 5--secondTitle1
 * 6--nowtime
 * 7--keyword
 * */
var mark = new Array();
for ( var i = 0; i < 8; i++) {
	mark[i] = true;
}
var firstTitle = [ "首页", "学院概况", "教学工作", "科研工作", "人才培养", "学生工作", "新闻公告",
		"党建工作", "师资队伍", "资源下载" ]

/*var secondTitle = [ [ "首页" ], [ "学院简介", "机构设置" ],
		[ "教学动态", "教学成果", "教学管理", "精品课" ], [ "科研动态", "科研成果", "研究所", "精品课", ],
		[ "本科生培养", "研究生培养" ],
		[ "分团委", "学生会", "学生管理", "班级风采", "考研就业", "院刊一览", "学生获奖" ],
		[ "新闻快讯", "通知公告" ], [ "院党校", "教师党支部", "学生党支部", "党员发展", "支部活动", "团训" ],
		[ "学生办公室", "教师科研办公室", "专业教研室", "公共教研室", "实验教师" ], [ "常用文件", "课件" ] ]
*/
var secondTitle = [ [ "首页" ],
 					  [ "学院简介", "机构设置" ],
            		  [ "教学动态", "教学成果", "教学管理"],
            		  [ "学术交流", "科研成果", "研究所" ],
            		  [ "本科生培养", "研究生培养" ],
            		  [ "团委学生会",  "班级风采", "考研就业", "学生获奖","院刊在线" ],
            		  [ "新闻快讯", "通知公告" ],
            		  [ "院党校",  "支部活动", "理论学习" ],
            		  [ "院领导","学院办公室", "应数教研室", "信科教研室", "统计教研室", "平台教研室","实验室" ], 
            		  [ "常用文件", "课件" ] ];




function getsecondTitle() {
	var firstTitleValue = document.forms[0].firstTitle;
	var secondTitleValue = document.forms[0].secondTitle;

	var firstNum = secondTitle[firstTitleValue.selectedIndex - 1];
	secondTitleValue.length = 1;
	if (firstNum != null && firstNum.length > 0) {
		for ( var i = 0; i < firstNum.length; i++) {
			secondTitleValue[i + 1] = new Option(firstNum[i], firstNum[i]);
		}
	}
	if (firstNum == "首页") {
		$("#uploadpic").css("display", "block");
		setFirstTitle1();
		// getsecondTitle1();
	} else {
		$("#uploadpic").css("display", "none");
	}

}

function setFirstTitle() {
	for ( var i = 0; i < firstTitle.length; i++) {
		var firstTitleValue = document.forms[0].firstTitle;
		firstTitleValue[i + 1] = new Option(firstTitle[i], firstTitle[i]);
	}
}
function getsecondTitle1() {
	var firstTitleValue = document.forms[0].firstTitle1;
	var secondTitleValue = document.forms[0].secondTitle1;
	var firstNum = secondTitle[firstTitleValue.selectedIndex];
	secondTitleValue.length = 1;
	if (firstNum != null && firstNum.length > 0) {
		for ( var i = 0; i < firstNum.length; i++) {
			secondTitleValue[i + 1] = new Option(firstNum[i], firstNum[i]);
		}
	}

}

function setFirstTitle1() {
	for ( var i = 1; i < firstTitle.length; i++) {
		var firstTitleValue = document.forms[0].firstTitle1;
		firstTitleValue[i] = new Option(firstTitle[i], firstTitle[i]);
	}
}

function judge() {
	
	var file = $("#upload").get(0).files[0];
	var fileresult = (handle(file));
	alert("文件大小为:"+fileresult);
	if(fileresult >= 10 * 1024 ) {
		alert("上传文件过大");
		//mark[2] = false;
		$("#admin_upload_btn").attr("disabled", true);
	}else if(fileresult ==0){
		$("#admin_upload_btn").attr("disabled", true);
	}
	else{
		$("#admin_upload_btn").attr("disabled", false);
	}
}
function handle(file) {
	var fileSize = 0;
	if (file) {
      fileSize = (Math.ceil(file.size * 100 / 1024,0) / 100).toString() ;
	}
	return fileSize;
}
function judgeUpload(){
	if(isNullEle($("#firstTitle").val())
			||isNullEle($("#secondTitle").val())
				||$("#keyword").val().length>50
	){
		alert("信息不完整");
		return false;
	}else
	{
		if($("#secondTitle").val()=="首页"){
			if(isNullEle($("#firstTitle1").val())
			||isNullEle($("#secondTitle2").val())){
				alert("信息不完整");
				return false;
			}
			
		}
	
	}
	var msg ="上传后将自动刷新页面";
	if(confirm(msg)==true){
		return true;
	}
	return false;
	
	
}
function isNullEle(str){
	if(str==null||str.length==0){
		return true;
	}
	return false;
}

