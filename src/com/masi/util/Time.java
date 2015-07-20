package com.masi.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	
	/*
	 * 获取时间以yyyy-MM-dd HH:mm:ss
	 * */
	
	public String getStandarTime()
	 {
	  Date date=new Date();
	  DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	  String time=format.format(date);
	  return time;
	 }
	public String getYMDTime(){
		Date date =new Date();
		DateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		String time=format.format(date);
		return time;
	}

	
}
