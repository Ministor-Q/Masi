package com.masi.hibernate;

/**
 * AbstractJsjy entity provides the base persistence definition of the Jsjy
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJsjy implements java.io.Serializable {

	// Fields

	private String jsjy;
	private String jsid;
	private String jysid;
	private String jsjs;

	// Constructors

	/** default constructor */
	public AbstractJsjy() {
	}

	/** minimal constructor */
	public AbstractJsjy(String jsjy) {
		this.jsjy = jsjy;
	}

	/** full constructor */
	public AbstractJsjy(String jsjy, String jsid, String jysid, String jsjs) {
		this.jsjy = jsjy;
		this.jsid = jsid;
		this.jysid = jysid;
		this.jsjs = jsjs;
	}

	// Property accessors

	public String getJsjy() {
		return this.jsjy;
	}

	public void setJsjy(String jsjy) {
		this.jsjy = jsjy;
	}

	public String getJsid() {
		return this.jsid;
	}

	public void setJsid(String jsid) {
		this.jsid = jsid;
	}

	public String getJysid() {
		return this.jysid;
	}

	public void setJysid(String jysid) {
		this.jysid = jysid;
	}

	public String getJsjs() {
		return this.jsjs;
	}

	public void setJsjs(String jsjs) {
		this.jsjs = jsjs;
	}

}