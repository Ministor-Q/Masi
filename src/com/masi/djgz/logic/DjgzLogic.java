package com.masi.djgz.logic;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.masi.util.Page;
import com.masi.djgz.service.DjgzService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DjgzLogic extends ActionSupport{
	private DjgzService djgzService;
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

	public DjgzService getdjgzService() {
		return djgzService;
	}

	public void setdjgzService(DjgzService djgzService) {
		this.djgzService = djgzService;
	}
	@Override
	public String execute() throws Exception {
		HttpSession session =ServletActionContext.getRequest().getSession();
		attri=new String(getAttri().getBytes("ISO-8859-1"),"UTF-8");
		this.page = djgzService.queryForPage(10, pages, attri);
		session.setAttribute("page", page);
		session.setAttribute("attri",attri.split("_")[1]);
		return "djgz";
	}
	

}
