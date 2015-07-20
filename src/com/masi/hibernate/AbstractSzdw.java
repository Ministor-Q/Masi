package com.masi.hibernate;

import java.util.Date;

/**
 * Abstractszdw entity provides the base persistence definition of the szdw entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractSzdw implements java.io.Serializable {

	// Fields

	private Integer szdwid;
	private String szdwname;
	private String szdwtype;
	private String szdwattri;
	private String szdwaddr;
	private String szdwaddrtemp;
	private Date szdwloadtime;
	private Date szdwpubltime;
	private String szdwkeyword;
	private String szdwpicaddr;
	private String szdwpiccode;
	private Integer szdwreadednum;
	private String szdwpublisher;
	private String szdwcode;

	// Constructors

	/** default constructor */
	public AbstractSzdw() {
	}

	/** minimal constructor */
	public AbstractSzdw(Integer szdwid) {
		this.szdwid = szdwid;
	}

	/** full constructor */
	public AbstractSzdw(Integer szdwid, String szdwname, String szdwtype,
			String szdwattri, String szdwaddr, String szdwaddrtemp, Date szdwloadtime,
			Date szdwpubltime, String szdwkeyword, String szdwpicaddr,
			String szdwpiccode, Integer szdwreadednum, String szdwpublisher,
			String szdwcode) {
		this.szdwid = szdwid;
		this.szdwname = szdwname;
		this.szdwtype = szdwtype;
		this.szdwattri = szdwattri;
		this.szdwaddr = szdwaddr;
		this.szdwaddrtemp = szdwaddrtemp;
		this.szdwloadtime = szdwloadtime;
		this.szdwpubltime = szdwpubltime;
		this.szdwkeyword = szdwkeyword;
		this.szdwpicaddr = szdwpicaddr;
		this.szdwpiccode = szdwpiccode;
		this.szdwreadednum = szdwreadednum;
		this.szdwpublisher = szdwpublisher;
		this.szdwcode = szdwcode;
	}

	// Property accessors

	public Integer getszdwid() {
		return this.szdwid;
	}

	public Integer getSzdwid() {
		return szdwid;
	}

	public void setSzdwid(Integer szdwid) {
		this.szdwid = szdwid;
	}

	public String getSzdwname() {
		return szdwname;
	}

	public void setSzdwname(String szdwname) {
		this.szdwname = szdwname;
	}

	public String getSzdwtype() {
		return szdwtype;
	}

	public void setSzdwtype(String szdwtype) {
		this.szdwtype = szdwtype;
	}

	public String getSzdwattri() {
		return szdwattri;
	}

	public void setSzdwattri(String szdwattri) {
		this.szdwattri = szdwattri;
	}

	public String getSzdwaddr() {
		return szdwaddr;
	}

	public void setSzdwaddr(String szdwaddr) {
		this.szdwaddr = szdwaddr;
	}

	public String getSzdwaddrtemp() {
		return szdwaddrtemp;
	}

	public void setSzdwaddrtemp(String szdwaddrtemp) {
		this.szdwaddrtemp = szdwaddrtemp;
	}

	public Date getSzdwloadtime() {
		return szdwloadtime;
	}

	public void setSzdwloadtime(Date szdwloadtime) {
		this.szdwloadtime = szdwloadtime;
	}

	public Date getSzdwpubltime() {
		return szdwpubltime;
	}

	public void setSzdwpubltime(Date szdwpubltime) {
		this.szdwpubltime = szdwpubltime;
	}

	public String getSzdwkeyword() {
		return szdwkeyword;
	}

	public void setSzdwkeyword(String szdwkeyword) {
		this.szdwkeyword = szdwkeyword;
	}

	public String getSzdwpicaddr() {
		return szdwpicaddr;
	}

	public void setSzdwpicaddr(String szdwpicaddr) {
		this.szdwpicaddr = szdwpicaddr;
	}

	public String getSzdwpiccode() {
		return szdwpiccode;
	}

	public void setSzdwpiccode(String szdwpiccode) {
		this.szdwpiccode = szdwpiccode;
	}

	public Integer getSzdwreadednum() {
		return szdwreadednum;
	}

	public void setSzdwreadednum(Integer szdwreadednum) {
		this.szdwreadednum = szdwreadednum;
	}

	public String getSzdwpublisher() {
		return szdwpublisher;
	}

	public void setSzdwpublisher(String szdwpublisher) {
		this.szdwpublisher = szdwpublisher;
	}

	public String getSzdwcode() {
		return szdwcode;
	}

	public void setSzdwcode(String szdwcode) {
		this.szdwcode = szdwcode;
	}

	

}