package com.masi.xwgg.logic;

import javax.persistence.Entity;

import com.masi.xwgg.service.XwkxService;
import com.opensymphony.xwork2.ActionSupport;

@Entity
public class XwkxLogic extends ActionSupport{
	private XwkxService xwkxService;
	
	public XwkxService getXwkxService() {
		return xwkxService;
	}

	public void setXwkxService(XwkxService xwkxService) {
		this.xwkxService = xwkxService;
	}

	@Override
	public String execute() throws Exception {
		
		return "xwkx";
	}
}
