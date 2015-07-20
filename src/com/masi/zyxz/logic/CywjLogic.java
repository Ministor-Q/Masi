package com.masi.zyxz.logic;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.masi.util.Page;
import com.masi.zyxz.service.CywjService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CywjLogic extends ActionSupport{
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

	private CywjService  cywjService;
	public CywjService getCywjService() {
		return cywjService;
	}
	public void setCywjService(CywjService cywjService) {
		this.cywjService = cywjService;
	}

	@Override
	public String execute() throws Exception {
		HttpSession session =ServletActionContext.getRequest().getSession();
		attri=new String(getAttri().getBytes("ISO-8859-1"),"UTF-8");
		this.page = cywjService.queryForPage(10, pages, attri);
		session.setAttribute("page", page);
		session.setAttribute("attri",attri.split("_")[1]);
		return "cywj";
	}
}