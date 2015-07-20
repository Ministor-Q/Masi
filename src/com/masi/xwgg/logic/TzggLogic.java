package com.masi.xwgg.logic;

import java.io.UnsupportedEncodingException;

import javax.persistence.Entity;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.masi.util.Page;
import com.masi.xwgg.service.TzggService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Entity
public class TzggLogic extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TzggService tzggService;
	private int pages;
	private Page page;
	private String attri;
	public String getAttri() {
		return attri;
	}

	public void setAttri(String attri) {
		this.attri = attri;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Page getPage(){
		
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public TzggService getTzggService() {
		return tzggService;
	}

	public void setTzggService(TzggService tzggService) {
		this.tzggService = tzggService;
	}

	@Override
	public String execute() throws Exception {
		HttpSession session =ServletActionContext.getRequest().getSession();
		attri=new String(getAttri().getBytes("ISO-8859-1"),"UTF-8");
		this.page = tzggService.queryForPage(10, pages, attri);
		session.setAttribute("page", page);
		session.setAttribute("attri",attri.split("_")[1]);
		return "tzgg";
	}
	
}
