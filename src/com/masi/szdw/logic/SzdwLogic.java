package com.masi.szdw.logic;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.masi.hibernate.Szdw;
import com.masi.szdw.service.SzdwService;
import com.masi.util.Page;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SzdwLogic extends ActionSupport{
	private SzdwService szdwService;
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

	public SzdwService getszdwService() {
		return szdwService;
	}

	public void setszdwService(SzdwService szdwService) {
		this.szdwService = szdwService;
	}
	@Override
	public String execute() throws Exception {
		HttpSession session =ServletActionContext.getRequest().getSession();
		attri=new String(getAttri().getBytes("ISO-8859-1"),"UTF-8");
		List<Szdw> ls = szdwService.getAllListByAttri(attri);
		session.setAttribute("list", ls);
		session.setAttribute("attri", attri);
		return "szdw";
	}
	

}
