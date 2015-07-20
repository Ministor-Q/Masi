package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractDjgz entity provides the base persistence definition of the Djgz
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDjgz implements java.io.Serializable {

	// Fields

	private Integer djgzid;
	private String djgzname;
	private String djgztype;
	private String djgzattri;
	private String djgzaddr;
	private String djgzaddrtemp;
	private Date djgzloadtime;
	private Date djgzpubltime;
	private String djgzkeyword;
	private Integer djgzreadednum;
	private String djgzpublisher;
	private String djgzcode;

	// Constructors

	/** default constructor */
	public AbstractDjgz() {
	}

	/** minimal constructor */
	public AbstractDjgz(Integer djgzid) {
		this.djgzid = djgzid;
	}

	/** full constructor */
	public AbstractDjgz(Integer djgzid, String djgzname, String djgztype,
			String djgzattri, String djgzaddr, String djgzaddrtemp,
			Date djgzloadtime, Date djgzpubltime, String djgzkeyword,
			Integer djgzreadednum, String djgzpublisher, String djgzcode) {
		this.djgzid = djgzid;
		this.djgzname = djgzname;
		this.djgztype = djgztype;
		this.djgzattri = djgzattri;
		this.djgzaddr = djgzaddr;
		this.djgzaddrtemp = djgzaddrtemp;
		this.djgzloadtime = djgzloadtime;
		this.djgzpubltime = djgzpubltime;
		this.djgzkeyword = djgzkeyword;
		this.djgzreadednum = djgzreadednum;
		this.djgzpublisher = djgzpublisher;
		this.djgzcode = djgzcode;
	}

	// Property accessors

	public Integer getDjgzid() {
		return this.djgzid;
	}

	public void setDjgzid(Integer djgzid) {
		this.djgzid = djgzid;
	}

	public String getDjgzname() {
		return this.djgzname;
	}

	public void setDjgzname(String djgzname) {
		this.djgzname = djgzname;
	}

	public String getDjgztype() {
		return this.djgztype;
	}

	public void setDjgztype(String djgztype) {
		this.djgztype = djgztype;
	}

	public String getDjgzattri() {
		return this.djgzattri;
	}

	public void setDjgzattri(String djgzattri) {
		this.djgzattri = djgzattri;
	}

	public String getDjgzaddr() {
		return this.djgzaddr;
	}

	public void setDjgzaddr(String djgzaddr) {
		this.djgzaddr = djgzaddr;
	}

	public String getDjgzaddrtemp() {
		return this.djgzaddrtemp;
	}

	public void setDjgzaddrtemp(String djgzaddrtemp) {
		this.djgzaddrtemp = djgzaddrtemp;
	}

	public Date getDjgzloadtime() {
		return this.djgzloadtime;
	}

	public void setDjgzloadtime(Date djgzloadtime) {
		this.djgzloadtime = djgzloadtime;
	}

	public Date getDjgzpubltime() {
		return this.djgzpubltime;
	}

	public void setDjgzpubltime(Date djgzpubltime) {
		this.djgzpubltime = djgzpubltime;
	}

	public String getDjgzkeyword() {
		return this.djgzkeyword;
	}

	public void setDjgzkeyword(String djgzkeyword) {
		this.djgzkeyword = djgzkeyword;
	}

	public Integer getDjgzreadednum() {
		return this.djgzreadednum;
	}

	public void setDjgzreadednum(Integer djgzreadednum) {
		this.djgzreadednum = djgzreadednum;
	}

	public String getDjgzpublisher() {
		return this.djgzpublisher;
	}

	public void setDjgzpublisher(String djgzpublisher) {
		this.djgzpublisher = djgzpublisher;
	}

	public String getDjgzcode() {
		return this.djgzcode;
	}

	public void setDjgzcode(String djgzcode) {
		this.djgzcode = djgzcode;
	}

}