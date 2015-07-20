package com.masi.rcpy.logic;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.masi.hibernate.Rcpy;
import com.masi.rcpy.service.BkspyService;
import com.masi.util.Page;
import com.opensymphony.xwork2.ActionSupport;

public class BkspyLogic extends ActionSupport{
	private int pages;
	private Page page;
	private String attri;
	
	private BkspyService bkspyService;

	
	

	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public Page getPage() {
		return page;
	}


	public void setPage(Page page) {
		this.page = page;
	}


	public String getAttri() {
		return attri;
	}


	public void setAttri(String attri) {
		this.attri = attri;
	}


	public BkspyService getBkspyService() {
		return bkspyService;
	}


	public void setBkspyService(BkspyService bkspyService) {
		this.bkspyService = bkspyService;
	}


	@Override
	public String execute() throws Exception {
		HttpSession session =ServletActionContext.getRequest().getSession();
		attri=new String(getAttri().getBytes("ISO-8859-1"),"UTF-8");
		this.page = bkspyService.queryForPage(10, pages, attri);
		session.setAttribute("page", page);
		session.setAttribute("attri",attri.split("_")[1]);
		return "bkspy";
		/*HttpServletResponse response = ServletActionContext.getResponse();
		HttpSession session =ServletActionContext.getRequest().getSession();
		Rcpy file =new Rcpy();
		if("xxyjskx".equals(major)){
			file.setRcpyname("信息与计算科学_本科生培养");
			session.setAttribute("BkspyArticle",saveArticle(file).html());
			session.setAttribute("BkspyTitle", "信息与计算科学");
			return "bkspy_xxyjskx";
			
		}	if("sxyyysx".equals(major)){
			file.setRcpyname("数学与应用数学_本科生培养");
			saveArticle(file);
			session.setAttribute("BkspyArticle",saveArticle(file).html());
			session.setAttribute("BkspyTitle", "数学与应用数学");
			return "bkspy_xxyyysx";
			
		}
		if("tjx".equals(major)){
			file.setRcpyname("统计学_本科生培养");
			saveArticle(file);
			session.setAttribute("BkspyArticle",saveArticle(file).html());
			session.setAttribute("BkspyTitle", "统计学");
			return "bkspy_tjx";
			
		}
		return ERROR;*/
	}


	/*private Document saveArticle(Rcpy file) throws IOException {
		
		String path=bkspyService.getBkspy(file);
		Document jsoup = Jsoup.parse(new File(path),"UTF-8");
		jsoup.body().removeClass("b1");
		jsoup.body().removeClass("b2");
		String title = jsoup.title();
		return jsoup;
		
	}*/

}
