package com.masi.rcpy.logic;

import com.masi.rcpy.service.YjspyService;
import com.opensymphony.xwork2.ActionSupport;

public class YjspyLogic extends ActionSupport{
	private YjspyService yjspyService;
	
	
	
	
	public YjspyService getYjspyService() {
		return yjspyService;
	}




	public void setYjspyService(YjspyService yjspyService) {
		this.yjspyService = yjspyService;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		
		
		return "yjspy";
	}

}
