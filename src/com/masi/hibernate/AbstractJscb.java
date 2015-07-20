package com.masi.hibernate;

/**
 * AbstractJscb entity provides the base persistence definition of the Jscb
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJscb implements java.io.Serializable {

	// Fields

	private String jscbid;
	private String jsid;
	private String cbwid;
	private Integer pm;

	// Constructors

	/** default constructor */
	public AbstractJscb() {
	}

	/** minimal constructor */
	public AbstractJscb(String jscbid) {
		this.jscbid = jscbid;
	}

	/** full constructor */
	public AbstractJscb(String jscbid, String jsid, String cbwid, Integer pm) {
		this.jscbid = jscbid;
		this.jsid = jsid;
		this.cbwid = cbwid;
		this.pm = pm;
	}

	// Property accessors

	public String getJscbid() {
		return this.jscbid;
	}

	public void setJscbid(String jscbid) {
		this.jscbid = jscbid;
	}

	public String getJsid() {
		return this.jsid;
	}

	public void setJsid(String jsid) {
		this.jsid = jsid;
	}

	public String getCbwid() {
		return this.cbwid;
	}

	public void setCbwid(String cbwid) {
		this.cbwid = cbwid;
	}

	public Integer getPm() {
		return this.pm;
	}

	public void setPm(Integer pm) {
		this.pm = pm;
	}

}