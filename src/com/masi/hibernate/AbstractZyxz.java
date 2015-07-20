package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractZyxz entity provides the base persistence definition of the Zyxz
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractZyxz implements java.io.Serializable {

	// Fields

	private Integer zyxzid;
	private String zyxzname;
	private String zyxztype;
	private String zyxzattri;
	private String zyxzaddr;
	private String zyxzaddrtemp;
	private Date zyxzloadtime;
	private Date zyxzpubltime;
	private String zyxzkeyword;
	private Integer zyxzreadednum;
	private String zyxzpublisher;
	private String zyxzcode;

	// Constructors

	/** default constructor */
	public AbstractZyxz() {
	}

	/** minimal constructor */
	public AbstractZyxz(Integer zyxzid) {
		this.zyxzid = zyxzid;
	}

	/** full constructor */
	public AbstractZyxz(Integer zyxzid, String zyxzname, String zyxztype,
			String zyxzattri, String zyxzaddr, String zyxzaddrtemp,
			Date zyxzloadtime, Date zyxzpubltime, String zyxzkeyword,
			Integer zyxzreadednum, String zyxzpublisher, String zyxzcode) {
		this.zyxzid = zyxzid;
		this.zyxzname = zyxzname;
		this.zyxztype = zyxztype;
		this.zyxzattri = zyxzattri;
		this.zyxzaddr = zyxzaddr;
		this.zyxzaddrtemp = zyxzaddrtemp;
		this.zyxzloadtime = zyxzloadtime;
		this.zyxzpubltime = zyxzpubltime;
		this.zyxzkeyword = zyxzkeyword;
		this.zyxzreadednum = zyxzreadednum;
		this.zyxzpublisher = zyxzpublisher;
		this.zyxzcode = zyxzcode;
	}

	// Property accessors

	public Integer getZyxzid() {
		return this.zyxzid;
	}

	public void setZyxzid(Integer zyxzid) {
		this.zyxzid = zyxzid;
	}

	public String getZyxzname() {
		return this.zyxzname;
	}

	public void setZyxzname(String zyxzname) {
		this.zyxzname = zyxzname;
	}

	public String getZyxztype() {
		return this.zyxztype;
	}

	public void setZyxztype(String zyxztype) {
		this.zyxztype = zyxztype;
	}

	public String getZyxzattri() {
		return this.zyxzattri;
	}

	public void setZyxzattri(String zyxzattri) {
		this.zyxzattri = zyxzattri;
	}

	public String getZyxzaddr() {
		return this.zyxzaddr;
	}

	public void setZyxzaddr(String zyxzaddr) {
		this.zyxzaddr = zyxzaddr;
	}

	public String getZyxzaddrtemp() {
		return this.zyxzaddrtemp;
	}

	public void setZyxzaddrtemp(String zyxzaddrtemp) {
		this.zyxzaddrtemp = zyxzaddrtemp;
	}

	public Date getZyxzloadtime() {
		return this.zyxzloadtime;
	}

	public void setZyxzloadtime(Date zyxzloadtime) {
		this.zyxzloadtime = zyxzloadtime;
	}

	public Date getZyxzpubltime() {
		return this.zyxzpubltime;
	}

	public void setZyxzpubltime(Date zyxzpubltime) {
		this.zyxzpubltime = zyxzpubltime;
	}

	public String getZyxzkeyword() {
		return this.zyxzkeyword;
	}

	public void setZyxzkeyword(String zyxzkeyword) {
		this.zyxzkeyword = zyxzkeyword;
	}

	public Integer getZyxzreadednum() {
		return this.zyxzreadednum;
	}

	public void setZyxzreadednum(Integer zyxzreadednum) {
		this.zyxzreadednum = zyxzreadednum;
	}

	public String getZyxzpublisher() {
		return this.zyxzpublisher;
	}

	public void setZyxzpublisher(String zyxzpublisher) {
		this.zyxzpublisher = zyxzpublisher;
	}

	public String getZyxzcode() {
		return this.zyxzcode;
	}

	public void setZyxzcode(String zyxzcode) {
		this.zyxzcode = zyxzcode;
	}

}