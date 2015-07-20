package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractXwgg entity provides the base persistence definition of the Xwgg
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractXwgg implements java.io.Serializable {

	// Fields

	private Integer xwggid;
	private String xwggname;
	private String xwggtype;
	private String xwggattri;
	private String xwggaddr;
	private String xwggaddrtemp;
	private Date xwggloadtime;
	private Date xwggpubltime;
	private String xwggkeyword;
	private Integer xwggreadednum;
	private String xwggpublisher;
	private String xwggcode;

	// Constructors

	/** default constructor */
	public AbstractXwgg() {
	}

	/** minimal constructor */
	public AbstractXwgg(Integer xwggid) {
		this.xwggid = xwggid;
	}

	/** full constructor */
	public AbstractXwgg(Integer xwggid, String xwggname, String xwggtype,
			String xwggattri, String xwggaddr, String xwggaddrtemp,
			Date xwggloadtime, Date xwggpubltime, String xwggkeyword,
			Integer xwggreadednum, String xwggpublisher, String xwggcode) {
		this.xwggid = xwggid;
		this.xwggname = xwggname;
		this.xwggtype = xwggtype;
		this.xwggattri = xwggattri;
		this.xwggaddr = xwggaddr;
		this.xwggaddrtemp = xwggaddrtemp;
		this.xwggloadtime = xwggloadtime;
		this.xwggpubltime = xwggpubltime;
		this.xwggkeyword = xwggkeyword;
		this.xwggreadednum = xwggreadednum;
		this.xwggpublisher = xwggpublisher;
		this.xwggcode = xwggcode;
	}

	// Property accessors

	public Integer getXwggid() {
		return this.xwggid;
	}

	public void setXwggid(Integer xwggid) {
		this.xwggid = xwggid;
	}

	public String getXwggname() {
		return this.xwggname;
	}

	public void setXwggname(String xwggname) {
		this.xwggname = xwggname;
	}

	public String getXwggtype() {
		return this.xwggtype;
	}

	public void setXwggtype(String xwggtype) {
		this.xwggtype = xwggtype;
	}

	public String getXwggattri() {
		return this.xwggattri;
	}

	public void setXwggattri(String xwggattri) {
		this.xwggattri = xwggattri;
	}

	public String getXwggaddr() {
		return this.xwggaddr;
	}

	public void setXwggaddr(String xwggaddr) {
		this.xwggaddr = xwggaddr;
	}

	public String getXwggaddrtemp() {
		return this.xwggaddrtemp;
	}

	public void setXwggaddrtemp(String xwggaddrtemp) {
		this.xwggaddrtemp = xwggaddrtemp;
	}

	public Date getXwggloadtime() {
		return this.xwggloadtime;
	}

	public void setXwggloadtime(Date xwggloadtime) {
		this.xwggloadtime = xwggloadtime;
	}

	public Date getXwggpubltime() {
		return this.xwggpubltime;
	}

	public void setXwggpubltime(Date xwggpubltime) {
		this.xwggpubltime = xwggpubltime;
	}

	public String getXwggkeyword() {
		return this.xwggkeyword;
	}

	public void setXwggkeyword(String xwggkeyword) {
		this.xwggkeyword = xwggkeyword;
	}

	public Integer getXwggreadednum() {
		return this.xwggreadednum;
	}

	public void setXwggreadednum(Integer xwggreadednum) {
		this.xwggreadednum = xwggreadednum;
	}

	public String getXwggpublisher() {
		return this.xwggpublisher;
	}

	public void setXwggpublisher(String xwggpublisher) {
		this.xwggpublisher = xwggpublisher;
	}

	public String getXwggcode() {
		return this.xwggcode;
	}

	public void setXwggcode(String xwggcode) {
		this.xwggcode = xwggcode;
	}

}