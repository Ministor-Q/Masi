package com.masi.homepage.logic;

import com.masi.test.Test;
import com.opensymphony.xwork2.ActionSupport;
import javax.persistence.Entity;

@Entity
public class HomePageLogic extends ActionSupport{
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "homepage";
	}
}
