package com.masi.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.Entity;
import org.apache.log4j.Logger;

@Entity
public class ParseHtml{
	
	/**
	 * 解析本地文件夹中的html
	 * @param  html文档所在路径 path
	 * @return 返回html文档内容
	 * @author Ministor_X
	 * */
	public String parseHtml(String path) throws IOException{
		StringBuffer sb =new StringBuffer();
		InputStreamReader is =new InputStreamReader(new FileInputStream(new File(path)),"utf-8");
    	BufferedReader br=new BufferedReader(is);
    	String str="";
    	while(null!=(str=br.readLine())){
    		sb.append(str);
    		sb.append("\r\n");
    	}
    	br.close();
    	is.close();
    	//System.out.println(sb.toString());
		return sb.toString();
	}
}
