package com.masi.article.logic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.struts2.ServletActionContext;

import sun.misc.BASE64Encoder;

import net.sf.json.JSONArray;

import com.masi.util.GetPicBase64ByPath;
import com.opensymphony.xwork2.ActionSupport;

public class GetPicBase64Action extends ActionSupport{
	private String param;
	
	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}


	@Override
	public String execute() throws Exception {
		String str[] =param.replace("(", "").replace(")", "").split(",");
		List<String> ls=new ArrayList<String>();
		for(int i=0;i<str.length;i++){
			String base64 = new GetPicBase64ByPath().getPicBase64(str[i].split("=")[1].substring(8));
			ls.add(base64);
		}
		JSONArray json = JSONArray.fromObject(ls);
		HttpServletResponse resp =ServletActionContext.getResponse();
		 resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print(json.toString());
		return null;
	}

	
	
}
