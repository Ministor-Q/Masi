package com.masi.zyxz.logic;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.masi.hibernate.Zyxz;
import com.masi.zyxz.service.DownloadService;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadLogic extends ActionSupport{
	private String filename;
	private String inputpath;
	private DownloadService downloadService;
	private String zyxzcode;
	
	
	public String getZyxzcode() {
		return zyxzcode;
	}



	public void setZyxzcode(String zyxzcode) {
		this.zyxzcode = zyxzcode;
	}



	public DownloadService getDownloadService() {
		return downloadService;
	}



	public void setDownloadService(DownloadService downloadService) {
		this.downloadService = downloadService;
	}



	public String getFilename() {
		return filename;
	}



	public void setFilename(String filename) {
		this.filename = filename;
	}



	public String getInputpath() {
		return inputpath;
	}



	public void setInputpath(String inputpath) {
		this.inputpath = inputpath;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	public InputStream getInputStream() throws IOException{
		//String path =	"E://masi/doc";
		//filename=new String(getFilename().getBytes("ISO-8859-1"),"UTF-8");
		//String filepath =path+"/"+filename;
		zyxzcode =new String(getZyxzcode().getBytes("ISO-8859-1"),"UTF-8");
		setZyxz(downloadService.getZyxz(zyxzcode));
	
		String filepath =zyxz.getZyxzaddr()+"/"+zyxz.getZyxzname()+"."+zyxz.getZyxztype();
		File file =new File(filepath);
		return FileUtils.openInputStream(file);
		
	}
	private Zyxz  zyxz;
	public Zyxz getZyxz() {
		return zyxz;
	}



	public void setZyxz(Zyxz zyxz) {
		this.zyxz = zyxz;
	}



	public String getDownloadFileName(){
		String downloadFileName ="";
		try {
			downloadFileName = URLEncoder.encode(zyxz.getZyxzname()+"."+zyxz.getZyxztype(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return downloadFileName;
	}
	
}
