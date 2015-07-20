package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractJxgz entity provides the base persistence definition of the Jxgz
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJxgz implements java.io.Serializable {

	// Fields

	private Integer jxgzid;
	private String jxgzname;
	private String jxgztype;
	private String jxgzattri;
	private String jxgzaddr;
	private String jxgzaddrtemp;
	private Date jxgzloadtime;
	private Date jxgzpubltime;
	private String jxgzkeyword;
	private Integer jxgzreadednum;
	private String jxgzpublisher;
	private String jxgzcode;

	// Constructors

	/** default constructor */
	public AbstractJxgz() {
	}

	/** minimal constructor */
	public AbstractJxgz(Integer jxgzid) {
		this.jxgzid = jxgzid;
	}

	/** full constructor */
	public AbstractJxgz(Integer jxgzid, String jxgzname, String jxgztype,
			String jxgzattri, String jxgzaddr, String jxgzaddrtemp,
			Date jxgzloadtime, Date jxgzpubltime, String jxgzkeyword,
			Integer jxgzreadednum, String jxgzpublisher, String jxgzcode) {
		this.jxgzid = jxgzid;
		this.jxgzname = jxgzname;
		this.jxgztype = jxgztype;
		this.jxgzattri = jxgzattri;
		this.jxgzaddr = jxgzaddr;
		this.jxgzaddrtemp = jxgzaddrtemp;
		this.jxgzloadtime = jxgzloadtime;
		this.jxgzpubltime = jxgzpubltime;
		this.jxgzkeyword = jxgzkeyword;
		this.jxgzreadednum = jxgzreadednum;
		this.jxgzpublisher = jxgzpublisher;
		this.jxgzcode = jxgzcode;
	}

	// Property accessors

	public Integer getJxgzid() {
		return this.jxgzid;
	}

	public void setJxgzid(Integer jxgzid) {
		this.jxgzid = jxgzid;
	}

	public String getJxgzname() {
		return this.jxgzname;
	}

	public void setJxgzname(String jxgzname) {
		this.jxgzname = jxgzname;
	}

	public String getJxgztype() {
		return this.jxgztype;
	}

	public void setJxgztype(String jxgztype) {
		this.jxgztype = jxgztype;
	}

	public String getJxgzattri() {
		return this.jxgzattri;
	}

	public void setJxgzattri(String jxgzattri) {
		this.jxgzattri = jxgzattri;
	}

	public String getJxgzaddr() {
		return this.jxgzaddr;
	}

	public void setJxgzaddr(String jxgzaddr) {
		this.jxgzaddr = jxgzaddr;
	}

	public String getJxgzaddrtemp() {
		return this.jxgzaddrtemp;
	}

	public void setJxgzaddrtemp(String jxgzaddrtemp) {
		this.jxgzaddrtemp = jxgzaddrtemp;
	}

	public Date getJxgzloadtime() {
		return this.jxgzloadtime;
	}

	public void setJxgzloadtime(Date jxgzloadtime) {
		this.jxgzloadtime = jxgzloadtime;
	}

	public Date getJxgzpubltime() {
		return this.jxgzpubltime;
	}

	public void setJxgzpubltime(Date jxgzpubltime) {
		this.jxgzpubltime = jxgzpubltime;
	}

	public String getJxgzkeyword() {
		return this.jxgzkeyword;
	}

	public void setJxgzkeyword(String jxgzkeyword) {
		this.jxgzkeyword = jxgzkeyword;
	}

	public Integer getJxgzreadednum() {
		return this.jxgzreadednum;
	}

	public void setJxgzreadednum(Integer jxgzreadednum) {
		this.jxgzreadednum = jxgzreadednum;
	}

	public String getJxgzpublisher() {
		return this.jxgzpublisher;
	}

	public void setJxgzpublisher(String jxgzpublisher) {
		this.jxgzpublisher = jxgzpublisher;
	}

	public String getJxgzcode() {
		return this.jxgzcode;
	}

	public void setJxgzcode(String jxgzcode) {
		this.jxgzcode = jxgzcode;
	}

}