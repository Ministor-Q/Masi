package com.masi.util;

import java.util.HashMap;
import java.util.Map;

public class DataSource {
	
	public String getCodeByTitle(String title){
		Map<String,String> map =getCodeMap();
		return (String) map.get(title);
	}
	
	public String getTitleByCode(String code){
		Map<String,String> map =getTitleMap();
		return (String) map.get(code);
	}
	private String firstTitle[] ={"首页","学院概况","教学工作","科研工作","人才培养","学生工作","新闻公告","党建工作","师资队伍","资源下载"};
	/*private String secondTitle[][]={{"首页"},
	                       { "学院简介", "机构设置" },
	                       { "教学动态", "教学成果","教学管理", "精品课" },
	                       { "科研动态", "科研成果","研究所", "精品课", },
	                       { "本科生培养", "研究生培养" },
	                      { "分团委", "学生会","学生管理", "班级风采","考研就业", "院刊一览","学生获奖"},
	                                   { "新闻快讯", "通知公告" },
	                                   { "院党校", "教师党支部","学生党支部","党员发展", "支部活动","团训" },
	                                   { "学生办公室", "教师科研办公室","专业教研室", "公共教研室","实验教师" },
	                                   { "常用文件", "课件" }
	                                   };*/
	private String secondTitle[][]={ { "首页" },
	                              { "学院简介", "机构设置" },
	                       		  { "教学动态", "教学成果", "教学管理"},
	                       		  { "学术交流", "科研成果", "研究所" },
	                       		  { "本科生培养", "研究生培养" },
	                       		  { "团委学生会",  "班级风采", "考研就业", "学生获奖","院刊在线" },
	                       		  { "新闻快讯", "通知公告" },
	                       		  { "院党校",  "支部活动", "理论学习" },
	                       		  { "院领导","学院办公室", "应数教研室", "信科教研室", "统计教研室", "平台教研室","实验室" }, 
	                       		  { "常用文件", "课件" } };
	
	private Map<String,String> getCodeMap(){
		Map<String,String> map =new HashMap<String,String>();
		for(int i =0;i<firstTitle.length;i++){
			for(int j=0;j<secondTitle[i].length;j++){
				map.put(firstTitle[i]+"_"+secondTitle[i][j],getNumber(i+1)+""+getNumber(j+1));
			}
		}
		return map;
	}
	private Map<String,String> getTitleMap(){
		Map<String,String> map =new HashMap<String,String>();
		for(int i =0;i<firstTitle.length;i++){
			for(int j=0;j<secondTitle[i].length;j++){
				map.put(getNumber(i+1)+""+getNumber(j+1),firstTitle[i]+"_"+secondTitle[i][j]);
			}
		}
		return map;
	}
	private String getNumber(int temp){
		if(temp<10){
			return "0"+temp;
		}
		else{
			return temp+"";
		}
	}
}
