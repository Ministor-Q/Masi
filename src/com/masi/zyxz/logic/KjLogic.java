package com.masi.zyxz.logic;

import com.masi.zyxz.service.KjService;
import com.opensymphony.xwork2.ActionSupport;

public class KjLogic extends ActionSupport{
	private KjService kjService;
	
	public KjService getKjService() {
		return kjService;
	}

	public void setKjService(KjService kjService) {
		this.kjService = kjService;
	}

	@Override
	public String execute() throws Exception {
		
		
		
		
		
		return "kj";
	}
	}