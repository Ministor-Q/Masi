package com.masi.kygz.logic;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.masi.kygz.service.KygzService;
import com.masi.util.Page;
import com.opensymphony.xwork2.ActionSupport;

public class KygzLogic extends ActionSupport{
	private KygzService kygzService;
	private int pages;
	private Page page;
	private String attri;
	public KygzService getKygzService() {
		return kygzService;
	}
	public void setKygzService(KygzService kygzService) {
		this.kygzService = kygzService;
	}
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
	@Override
	public String execute() throws Exception {
		HttpSession session =ServletActionContext.getRequest().getSession();
		attri=new String(getAttri().getBytes("ISO-8859-1"),"UTF-8");
		this.page = kygzService.queryForPage(10, pages, attri);
		session.setAttribute("page", page);
		session.setAttribute("attri",attri.split("_")[1]);
		return "kygz";
	}
	
}
