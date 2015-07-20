package com.masi.jxgz.logic;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.masi.jxgz.service.JxgzService;
import com.masi.util.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class JxgzLogic extends ActionSupport{
	private JxgzService jxgzService;
	private int pages;
	private Page page;
	private String attri;
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

	public JxgzService getJxgzService() {
		return jxgzService;
	}

	public void setJxgzService(JxgzService jxgzService) {
		this.jxgzService = jxgzService;
	}
	@Override
	public String execute() throws Exception {
		HttpSession session =ServletActionContext.getRequest().getSession();
		attri=new String(getAttri().getBytes("ISO-8859-1"),"UTF-8");
		this.page = jxgzService.queryForPage(10, pages, attri);
		session.setAttribute("page", page);
		session.setAttribute("attri",attri.split("_")[1]);
		return "jxgz";
	}
	

}
