package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractXygk entity provides the base persistence definition of the Xygk
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractXygk implements java.io.Serializable {

	// Fields

	private Integer xygkid;
	private String xygkname;
	private String xygktype;
	private String xygkattri;
	private String xygkaddr;
	private String xygkaddrtemp;
	private Date xygkloadtime;
	private Date xygkpubltime;
	private Integer xygkreadednum;
	private String xygkpublisher;
	private String xygkcode;

	// Constructors

	/** default constructor */
	public AbstractXygk() {
	}

	/** minimal constructor */
	public AbstractXygk(Integer xygkid) {
		this.xygkid = xygkid;
	}

	/** full constructor */
	public AbstractXygk(Integer xygkid, String xygkname, String xygktype,
			String xygkattri, String xygkaddr, String xygkaddrtemp,
			Date xygkloadtime, Date xygkpubltime, Integer xygkreadednum,
			String xygkpublisher, String xygkcode) {
		this.xygkid = xygkid;
		this.xygkname = xygkname;
		this.xygktype = xygktype;
		this.xygkattri = xygkattri;
		this.xygkaddr = xygkaddr;
		this.xygkaddrtemp = xygkaddrtemp;
		this.xygkloadtime = xygkloadtime;
		this.xygkpubltime = xygkpubltime;
		this.xygkreadednum = xygkreadednum;
		this.xygkpublisher = xygkpublisher;
		this.xygkcode = xygkcode;
	}

	// Property accessors

	public Integer getXygkid() {
		return this.xygkid;
	}

	public void setXygkid(Integer xygkid) {
		this.xygkid = xygkid;
	}

	public String getXygkname() {
		return this.xygkname;
	}

	public void setXygkname(String xygkname) {
		this.xygkname = xygkname;
	}

	public String getXygktype() {
		return this.xygktype;
	}

	public void setXygktype(String xygktype) {
		this.xygktype = xygktype;
	}

	public String getXygkattri() {
		return this.xygkattri;
	}

	public void setXygkattri(String xygkattri) {
		this.xygkattri = xygkattri;
	}

	public String getXygkaddr() {
		return this.xygkaddr;
	}

	public void setXygkaddr(String xygkaddr) {
		this.xygkaddr = xygkaddr;
	}

	public String getXygkaddrtemp() {
		return this.xygkaddrtemp;
	}

	public void setXygkaddrtemp(String xygkaddrtemp) {
		this.xygkaddrtemp = xygkaddrtemp;
	}

	public Date getXygkloadtime() {
		return this.xygkloadtime;
	}

	public void setXygkloadtime(Date xygkloadtime) {
		this.xygkloadtime = xygkloadtime;
	}

	public Date getXygkpubltime() {
		return this.xygkpubltime;
	}

	public void setXygkpubltime(Date xygkpubltime) {
		this.xygkpubltime = xygkpubltime;
	}

	public Integer getXygkreadednum() {
		return this.xygkreadednum;
	}

	public void setXygkreadednum(Integer xygkreadednum) {
		this.xygkreadednum = xygkreadednum;
	}

	public String getXygkpublisher() {
		return this.xygkpublisher;
	}

	public void setXygkpublisher(String xygkpublisher) {
		this.xygkpublisher = xygkpublisher;
	}

	public String getXygkcode() {
		return this.xygkcode;
	}

	public void setXygkcode(String xygkcode) {
		this.xygkcode = xygkcode;
	}

}