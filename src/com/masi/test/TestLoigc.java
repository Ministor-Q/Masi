package com.masi.test;

import com.masi.hibernate.BgDAO;
import com.opensymphony.xwork2.ActionSupport;

public class TestLoigc extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Test test;
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		test.test();
		return "homepage";
	}
	
}
