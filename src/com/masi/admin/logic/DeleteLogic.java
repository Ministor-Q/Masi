package com.masi.admin.logic;

import com.masi.admin.service.DeleteService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteLogic extends ActionSupport {

	private String[] file;
	private DeleteService deleteService;
	
	public String execute() throws Exception{
		
		return deleteService.delete(file);
	}

	public String[] getFile() {
		return file;
	}

	public void setFile(String[] file) {
		this.file = file;
	}

	public DeleteService getDeleteService() {
		return deleteService;
	}

	public void setDeleteService(DeleteService deleteService) {
		this.deleteService = deleteService;
	}
	
	
	
}
