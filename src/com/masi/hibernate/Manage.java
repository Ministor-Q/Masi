package com.masi.hibernate;


public class Manage implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String code;
	private String name;
	private String loadtime;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoadtime() {
		return loadtime;
	}
	public void setLoadtime(String loadtime) {
		this.loadtime = loadtime;
	}
	
	
}
