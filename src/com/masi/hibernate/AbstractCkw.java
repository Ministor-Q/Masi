package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractCkw entity provides the base persistence definition of the Ckw
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCkw implements java.io.Serializable {

	// Fields

	private String cbwid;
	private String cbwch;
	private Integer cbwlx;
	private String cbs;
	private String cbwmc;
	private Date cbnf;
	private String zzlb;

	// Constructors

	/** default constructor */
	public AbstractCkw() {
	}

	/** minimal constructor */
	public AbstractCkw(String cbwid) {
		this.cbwid = cbwid;
	}

	/** full constructor */
	public AbstractCkw(String cbwid, String cbwch, Integer cbwlx, String cbs,
			String cbwmc, Date cbnf, String zzlb) {
		this.cbwid = cbwid;
		this.cbwch = cbwch;
		this.cbwlx = cbwlx;
		this.cbs = cbs;
		this.cbwmc = cbwmc;
		this.cbnf = cbnf;
		this.zzlb = zzlb;
	}

	// Property accessors

	public String getCbwid() {
		return this.cbwid;
	}

	public void setCbwid(String cbwid) {
		this.cbwid = cbwid;
	}

	public String getCbwch() {
		return this.cbwch;
	}

	public void setCbwch(String cbwch) {
		this.cbwch = cbwch;
	}

	public Integer getCbwlx() {
		return this.cbwlx;
	}

	public void setCbwlx(Integer cbwlx) {
		this.cbwlx = cbwlx;
	}

	public String getCbs() {
		return this.cbs;
	}

	public void setCbs(String cbs) {
		this.cbs = cbs;
	}

	public String getCbwmc() {
		return this.cbwmc;
	}

	public void setCbwmc(String cbwmc) {
		this.cbwmc = cbwmc;
	}

	public Date getCbnf() {
		return this.cbnf;
	}

	public void setCbnf(Date cbnf) {
		this.cbnf = cbnf;
	}

	public String getZzlb() {
		return this.zzlb;
	}

	public void setZzlb(String zzlb) {
		this.zzlb = zzlb;
	}

}