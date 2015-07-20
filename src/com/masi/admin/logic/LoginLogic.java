package com.masi.admin.logic;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.masi.admin.service.LoginService;
import com.masi.hibernate.Admin;
import com.masi.util.CipherUtil;
import com.opensymphony.xwork2.ActionSupport;

public class LoginLogic extends ActionSupport {

	private LoginService loginService;
	private String username;
	private String userpwd;
	private String result;
	
	public String login(){
		//获得Session
		HttpSession session = ServletActionContext.getRequest().getSession();
		try{
			userpwd = CipherUtil.generatePassword(userpwd);
			List<Admin> list = loginService.login(username,userpwd);
			if(list.size()>0){
				session.setAttribute("user", list.get(0).getUsername());
				return "success";
			}else{
				HttpServletResponse response = ServletActionContext.getResponse();
				response.setCharacterEncoding("UTF-8");
				response.getWriter().print("用户名或密码错误");
				result="用户名或密码错误";
				setResult("用户名或密码错误");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "error";
	}
	
	public String execute() throws Exception {
		
		return login();
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
	
}
