package com.masi.admin.logic;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.masi.admin.dao.ManageDao;
import com.masi.admin.service.ManageService;
import com.masi.util.DataSource;
import com.masi.util.Page;
import com.masi.util.TableNameHandle;
import com.opensymphony.xwork2.ActionSupport;

public class ManageLogic extends ActionSupport {

	private String firstTitle;
	private String secondTitle;
	private ManageService manageService; 
	private int pages;
	private Page managePage;
	private String attri;
	@Override
	public String execute() throws Exception {
		
		List<Object> list = manageService.find(firstTitle, secondTitle);
		JSONArray json = JSONArray.fromObject(list);
		String str = new String(json.toString().getBytes("UTF-8"),"UTF-8");
		String codeString = new DataSource().getCodeByTitle(firstTitle + "_" + secondTitle);
		String tableName = ManageDao.tableName(codeString).toLowerCase();
		str = str.replaceAll(tableName+"attri", "attri");
		str = str.replaceAll(tableName+"name", "name");
		str = str.replaceAll(tableName+"code", "code");
		str = str.replaceAll(tableName+"loadtime", "loadtime");
		System.out.println(str);
		HttpServletResponse resp =ServletActionContext.getResponse();
		 resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print(str);
		return null;
	}
	
	public String manage() throws Exception{
		HttpSession session =ServletActionContext.getRequest().getSession();
		
		String codeString = "";
		if(pages == 0){
			if(firstTitle == null || firstTitle.equals("")){
				codeString = (String) session.getAttribute("manageAttri");
				if(session.getAttribute("secondTitle")!= null && !session.getAttribute("secondTitle").equals("")){
					secondTitle = (String) session.getAttribute("secondTitle");
				}
				if(session.getAttribute("managePages")!= null && !session.getAttribute("managePages").equals("")){
					pages = (Integer) session.getAttribute("managePages");
				}
			}else{
				String title = firstTitle + "_" + secondTitle;
				title = new String(title.getBytes("UTF-8"),"UTF-8");
				codeString = new DataSource().getCodeByTitle(title);
			}
			
		}else{
			codeString = attri;
		}
		
		System.out.println(codeString);
		String tableName = TableNameHandle.tableName(codeString);
		String tableName1 = tableName.substring(0,1).toUpperCase() + tableName.substring(1);
		this.managePage = manageService.queryForPage(codeString, 10, pages);
		String attri = new DataSource().getTitleByCode(codeString);
		session.setAttribute("managePage", managePage);
		session.setAttribute("manageAttri",codeString);
		session.setAttribute("firstTitle", firstTitle);
		session.setAttribute("secondTitle", secondTitle);
		session.setAttribute("managePages", pages);
		return SUCCESS;
	}
	
	public String manageRe() throws Exception{
		HttpServletRequest request =ServletActionContext.getRequest();
		
		String codeString = "";
		if(pages == 0 ){
			if(firstTitle == null || firstTitle.equals("")){
				codeString = (String) request.getAttribute("attri");
				if(request.getAttribute("managePages")!= null && !request.getAttribute("managePages").equals("")){
					pages = (Integer) request.getAttribute("managePages");
				}
			}else{
				String title = firstTitle + "_" + secondTitle;
				title = new String(title.getBytes("UTF-8"),"UTF-8");
				codeString = new DataSource().getCodeByTitle(title);
			}
			
		}else{
			codeString = attri;
		}
		
		System.out.println(codeString);
		String tableName = TableNameHandle.tableName(codeString);
		String tableName1 = tableName.substring(0,1).toUpperCase() + tableName.substring(1);
		this.managePage = manageService.queryForPage(codeString, 10, pages);
		String attri = new DataSource().getTitleByCode(codeString);
		request.setAttribute("ManagePage", managePage);
		request.setAttribute("attri",codeString);
		request.setAttribute("firstTitle", firstTitle);
		request.setAttribute("secondTitle", secondTitle);
		return SUCCESS;
	}
	
	public String getFirstTitle() {
		return firstTitle;
	}
	public void setFirstTitle(String firstTitle) {
		this.firstTitle = firstTitle;
	}
	public String getSecondTitle() {
		return secondTitle;
	}
	public void setSecondTitle(String secondTitle) {
		this.secondTitle = secondTitle;
	}
	public ManageService getManageService() {
		return manageService;
	}
	public void setManageService(ManageService manageService) {
		this.manageService = manageService;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Page getManagePage() {
		return managePage;
	}

	public void setManagePage(Page managePage) {
		this.managePage = managePage;
	}

	public String getAttri() {
		return attri;
	}

	public void setAttri(String attri) {
		this.attri = attri;
	}
	
}
