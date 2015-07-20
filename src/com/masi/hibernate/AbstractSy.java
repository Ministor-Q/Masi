package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractSy entity provides the base persistence definition of the Sy entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractSy implements java.io.Serializable {

	// Fields

	private Integer syid;
	private String syname;
	private String sytype;
	private String syattri;
	private String syaddr;
	private String syaddrtemp;
	private Date syloadtime;
	private Date sypubltime;
	private String sykeyword;
	private String sypicaddr;
	private String sypiccode;
	private Integer syreadednum;
	private String sypublisher;
	private String sycode;

	// Constructors

	/** default constructor */
	public AbstractSy() {
	}

	/** minimal constructor */
	public AbstractSy(Integer syid) {
		this.syid = syid;
	}

	/** full constructor */
	public AbstractSy(Integer syid, String syname, String sytype,
			String syattri, String syaddr, String syaddrtemp, Date syloadtime,
			Date sypubltime, String sykeyword, String sypicaddr,
			String sypiccode, Integer syreadednum, String sypublisher,
			String sycode) {
		this.syid = syid;
		this.syname = syname;
		this.sytype = sytype;
		this.syattri = syattri;
		this.syaddr = syaddr;
		this.syaddrtemp = syaddrtemp;
		this.syloadtime = syloadtime;
		this.sypubltime = sypubltime;
		this.sykeyword = sykeyword;
		this.sypicaddr = sypicaddr;
		this.sypiccode = sypiccode;
		this.syreadednum = syreadednum;
		this.sypublisher = sypublisher;
		this.sycode = sycode;
	}

	// Property accessors

	public Integer getSyid() {
		return this.syid;
	}

	public void setSyid(Integer syid) {
		this.syid = syid;
	}

	public String getSyname() {
		return this.syname;
	}

	public void setSyname(String syname) {
		this.syname = syname;
	}

	public String getSytype() {
		return this.sytype;
	}

	public void setSytype(String sytype) {
		this.sytype = sytype;
	}

	public String getSyattri() {
		return this.syattri;
	}

	public void setSyattri(String syattri) {
		this.syattri = syattri;
	}

	public String getSyaddr() {
		return this.syaddr;
	}

	public void setSyaddr(String syaddr) {
		this.syaddr = syaddr;
	}

	public String getSyaddrtemp() {
		return this.syaddrtemp;
	}

	public void setSyaddrtemp(String syaddrtemp) {
		this.syaddrtemp = syaddrtemp;
	}

	public Date getSyloadtime() {
		return this.syloadtime;
	}

	public void setSyloadtime(Date syloadtime) {
		this.syloadtime = syloadtime;
	}

	public Date getSypubltime() {
		return this.sypubltime;
	}

	public void setSypubltime(Date sypubltime) {
		this.sypubltime = sypubltime;
	}

	public String getSykeyword() {
		return this.sykeyword;
	}

	public void setSykeyword(String sykeyword) {
		this.sykeyword = sykeyword;
	}

	public String getSypicaddr() {
		return this.sypicaddr;
	}

	public void setSypicaddr(String sypicaddr) {
		this.sypicaddr = sypicaddr;
	}

	public String getSypiccode() {
		return this.sypiccode;
	}

	public void setSypiccode(String sypiccode) {
		this.sypiccode = sypiccode;
	}

	public Integer getSyreadednum() {
		return this.syreadednum;
	}

	public void setSyreadednum(Integer syreadednum) {
		this.syreadednum = syreadednum;
	}

	public String getSypublisher() {
		return this.sypublisher;
	}

	public void setSypublisher(String sypublisher) {
		this.sypublisher = sypublisher;
	}

	public String getSycode() {
		return this.sycode;
	}

	public void setSycode(String sycode) {
		this.sycode = sycode;
	}

}