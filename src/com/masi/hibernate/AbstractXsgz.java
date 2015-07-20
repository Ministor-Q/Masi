package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractXsgz entity provides the base persistence definition of the Xsgz
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractXsgz implements java.io.Serializable {

	// Fields

	private Integer xsgzid;
	private String xsgzname;
	private String xsgztype;
	private String xsgzattri;
	private String xsgzaddr;
	private String xsgzaddrtemp;
	private Date xsgzloadtime;
	private Date xsgzpubltime;
	private String xsgzkeyword;
	private Integer xsgzreadednum;
	private String xsgzpublisher;
	private String xsgzcode;

	// Constructors

	/** default constructor */
	public AbstractXsgz() {
	}

	/** minimal constructor */
	public AbstractXsgz(Integer xsgzid) {
		this.xsgzid = xsgzid;
	}

	/** full constructor */
	public AbstractXsgz(Integer xsgzid, String xsgzname, String xsgztype,
			String xsgzattri, String xsgzaddr, String xsgzaddrtemp,
			Date xsgzloadtime, Date xsgzpubltime, String xsgzkeyword,
			Integer xsgzreadednum, String xsgzpublisher, String xsgzcode) {
		this.xsgzid = xsgzid;
		this.xsgzname = xsgzname;
		this.xsgztype = xsgztype;
		this.xsgzattri = xsgzattri;
		this.xsgzaddr = xsgzaddr;
		this.xsgzaddrtemp = xsgzaddrtemp;
		this.xsgzloadtime = xsgzloadtime;
		this.xsgzpubltime = xsgzpubltime;
		this.xsgzkeyword = xsgzkeyword;
		this.xsgzreadednum = xsgzreadednum;
		this.xsgzpublisher = xsgzpublisher;
		this.xsgzcode = xsgzcode;
	}

	// Property accessors

	public Integer getXsgzid() {
		return this.xsgzid;
	}

	public void setXsgzid(Integer xsgzid) {
		this.xsgzid = xsgzid;
	}

	public String getXsgzname() {
		return this.xsgzname;
	}

	public void setXsgzname(String xsgzname) {
		this.xsgzname = xsgzname;
	}

	public String getXsgztype() {
		return this.xsgztype;
	}

	public void setXsgztype(String xsgztype) {
		this.xsgztype = xsgztype;
	}

	public String getXsgzattri() {
		return this.xsgzattri;
	}

	public void setXsgzattri(String xsgzattri) {
		this.xsgzattri = xsgzattri;
	}

	public String getXsgzaddr() {
		return this.xsgzaddr;
	}

	public void setXsgzaddr(String xsgzaddr) {
		this.xsgzaddr = xsgzaddr;
	}

	public String getXsgzaddrtemp() {
		return this.xsgzaddrtemp;
	}

	public void setXsgzaddrtemp(String xsgzaddrtemp) {
		this.xsgzaddrtemp = xsgzaddrtemp;
	}

	public Date getXsgzloadtime() {
		return this.xsgzloadtime;
	}

	public void setXsgzloadtime(Date xsgzloadtime) {
		this.xsgzloadtime = xsgzloadtime;
	}

	public Date getXsgzpubltime() {
		return this.xsgzpubltime;
	}

	public void setXsgzpubltime(Date xsgzpubltime) {
		this.xsgzpubltime = xsgzpubltime;
	}

	public String getXsgzkeyword() {
		return this.xsgzkeyword;
	}

	public void setXsgzkeyword(String xsgzkeyword) {
		this.xsgzkeyword = xsgzkeyword;
	}

	public Integer getXsgzreadednum() {
		return this.xsgzreadednum;
	}

	public void setXsgzreadednum(Integer xsgzreadednum) {
		this.xsgzreadednum = xsgzreadednum;
	}

	public String getXsgzpublisher() {
		return this.xsgzpublisher;
	}

	public void setXsgzpublisher(String xsgzpublisher) {
		this.xsgzpublisher = xsgzpublisher;
	}

	public String getXsgzcode() {
		return this.xsgzcode;
	}

	public void setXsgzcode(String xsgzcode) {
		this.xsgzcode = xsgzcode;
	}

}