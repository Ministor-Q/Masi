package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractRcpy entity provides the base persistence definition of the Rcpy
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRcpy implements java.io.Serializable {

	// Fields

	private Integer rcpyid;
	private String rcpyname;
	private String rcpytype;
	private String rcpyattri;
	private String rcpyaddr;
	private String rcpyaddrtemp;
	private Date rcpyloadtime;
	private Date rcpypubltime;
	private String rcpykeyword;
	private Integer rcpyreadednum;
	private String rcpypublisher;
	private String rcpycode;

	// Constructors

	/** default constructor */
	public AbstractRcpy() {
	}

	/** minimal constructor */
	public AbstractRcpy(Integer rcpyid) {
		this.rcpyid = rcpyid;
	}

	/** full constructor */
	public AbstractRcpy(Integer rcpyid, String rcpyname, String rcpytype,
			String rcpyattri, String rcpyaddr, String rcpyaddrtemp,
			Date rcpyloadtime, Date rcpypubltime, String rcpykeyword,
			Integer rcpyreadednum, String rcpypublisher, String rcpycode) {
		this.rcpyid = rcpyid;
		this.rcpyname = rcpyname;
		this.rcpytype = rcpytype;
		this.rcpyattri = rcpyattri;
		this.rcpyaddr = rcpyaddr;
		this.rcpyaddrtemp = rcpyaddrtemp;
		this.rcpyloadtime = rcpyloadtime;
		this.rcpypubltime = rcpypubltime;
		this.rcpykeyword = rcpykeyword;
		this.rcpyreadednum = rcpyreadednum;
		this.rcpypublisher = rcpypublisher;
		this.rcpycode = rcpycode;
	}

	// Property accessors

	public Integer getRcpyid() {
		return this.rcpyid;
	}

	public void setRcpyid(Integer rcpyid) {
		this.rcpyid = rcpyid;
	}

	public String getRcpyname() {
		return this.rcpyname;
	}

	public void setRcpyname(String rcpyname) {
		this.rcpyname = rcpyname;
	}

	public String getRcpytype() {
		return this.rcpytype;
	}

	public void setRcpytype(String rcpytype) {
		this.rcpytype = rcpytype;
	}

	public String getRcpyattri() {
		return this.rcpyattri;
	}

	public void setRcpyattri(String rcpyattri) {
		this.rcpyattri = rcpyattri;
	}

	public String getRcpyaddr() {
		return this.rcpyaddr;
	}

	public void setRcpyaddr(String rcpyaddr) {
		this.rcpyaddr = rcpyaddr;
	}

	public String getRcpyaddrtemp() {
		return this.rcpyaddrtemp;
	}

	public void setRcpyaddrtemp(String rcpyaddrtemp) {
		this.rcpyaddrtemp = rcpyaddrtemp;
	}

	public Date getRcpyloadtime() {
		return this.rcpyloadtime;
	}

	public void setRcpyloadtime(Date rcpyloadtime) {
		this.rcpyloadtime = rcpyloadtime;
	}

	public Date getRcpypubltime() {
		return this.rcpypubltime;
	}

	public void setRcpypubltime(Date rcpypubltime) {
		this.rcpypubltime = rcpypubltime;
	}

	public String getRcpykeyword() {
		return this.rcpykeyword;
	}

	public void setRcpykeyword(String rcpykeyword) {
		this.rcpykeyword = rcpykeyword;
	}

	public Integer getRcpyreadednum() {
		return this.rcpyreadednum;
	}

	public void setRcpyreadednum(Integer rcpyreadednum) {
		this.rcpyreadednum = rcpyreadednum;
	}

	public String getRcpypublisher() {
		return this.rcpypublisher;
	}

	public void setRcpypublisher(String rcpypublisher) {
		this.rcpypublisher = rcpypublisher;
	}

	public String getRcpycode() {
		return this.rcpycode;
	}

	public void setRcpycode(String rcpycode) {
		this.rcpycode = rcpycode;
	}

}