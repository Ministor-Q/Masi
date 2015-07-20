package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractKygz entity provides the base persistence definition of the Kygz
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKygz implements java.io.Serializable {

	// Fields

	private Integer kygzid;
	private String kygzname;
	private String kygztype;
	private String kygzattri;
	private String kygzaddr;
	private String kygzaddrtemp;
	private Date kygzloadtime;
	private Date kygzpubltime;
	private String kygzkeyword;
	private Integer kygzreadednum;
	private String kygzpublisher;
	private String kygzcode;

	// Constructors

	/** default constructor */
	public AbstractKygz() {
	}

	/** minimal constructor */
	public AbstractKygz(Integer kygzid) {
		this.kygzid = kygzid;
	}

	/** full constructor */
	public AbstractKygz(Integer kygzid, String kygzname, String kygztype,
			String kygzattri, String kygzaddr, String kygzaddrtemp,
			Date kygzloadtime, Date kygzpubltime, String kygzkeyword,
			Integer kygzreadednum, String kygzpublisher, String kygzcode) {
		this.kygzid = kygzid;
		this.kygzname = kygzname;
		this.kygztype = kygztype;
		this.kygzattri = kygzattri;
		this.kygzaddr = kygzaddr;
		this.kygzaddrtemp = kygzaddrtemp;
		this.kygzloadtime = kygzloadtime;
		this.kygzpubltime = kygzpubltime;
		this.kygzkeyword = kygzkeyword;
		this.kygzreadednum = kygzreadednum;
		this.kygzpublisher = kygzpublisher;
		this.kygzcode = kygzcode;
	}

	// Property accessors

	public Integer getKygzid() {
		return this.kygzid;
	}

	public void setKygzid(Integer kygzid) {
		this.kygzid = kygzid;
	}

	public String getKygzname() {
		return this.kygzname;
	}

	public void setKygzname(String kygzname) {
		this.kygzname = kygzname;
	}

	public String getKygztype() {
		return this.kygztype;
	}

	public void setKygztype(String kygztype) {
		this.kygztype = kygztype;
	}

	public String getKygzattri() {
		return this.kygzattri;
	}

	public void setKygzattri(String kygzattri) {
		this.kygzattri = kygzattri;
	}

	public String getKygzaddr() {
		return this.kygzaddr;
	}

	public void setKygzaddr(String kygzaddr) {
		this.kygzaddr = kygzaddr;
	}

	public String getKygzaddrtemp() {
		return this.kygzaddrtemp;
	}

	public void setKygzaddrtemp(String kygzaddrtemp) {
		this.kygzaddrtemp = kygzaddrtemp;
	}

	public Date getKygzloadtime() {
		return this.kygzloadtime;
	}

	public void setKygzloadtime(Date kygzloadtime) {
		this.kygzloadtime = kygzloadtime;
	}

	public Date getKygzpubltime() {
		return this.kygzpubltime;
	}

	public void setKygzpubltime(Date kygzpubltime) {
		this.kygzpubltime = kygzpubltime;
	}

	public String getKygzkeyword() {
		return this.kygzkeyword;
	}

	public void setKygzkeyword(String kygzkeyword) {
		this.kygzkeyword = kygzkeyword;
	}

	public Integer getKygzreadednum() {
		return this.kygzreadednum;
	}

	public void setKygzreadednum(Integer kygzreadednum) {
		this.kygzreadednum = kygzreadednum;
	}

	public String getKygzpublisher() {
		return this.kygzpublisher;
	}

	public void setKygzpublisher(String kygzpublisher) {
		this.kygzpublisher = kygzpublisher;
	}

	public String getKygzcode() {
		return this.kygzcode;
	}

	public void setKygzcode(String kygzcode) {
		this.kygzcode = kygzcode;
	}

}