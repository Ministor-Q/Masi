package com.masi.admin.service;

import java.util.List;

import com.masi.admin.dao.LoginDao;
import com.masi.hibernate.Admin;

public class LoginService {

	private LoginDao loginDao;

	public List<Admin> login(String name, String password){
		return loginDao.login(name,password);
	}
	
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	
	
}
