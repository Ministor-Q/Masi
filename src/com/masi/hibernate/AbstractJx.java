package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractJx entity provides the base persistence definition of the Jx entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractJx implements java.io.Serializable {

	// Fields

	private String jxid;
	private String jsmc;
	private String bfjg;
	private String hjdj;
	private Date hjrq;
	private String hjdm;
	private String cmlb;
	private Integer ssry;

	// Constructors

	/** default constructor */
	public AbstractJx() {
	}

	/** minimal constructor */
	public AbstractJx(String jxid) {
		this.jxid = jxid;
	}

	/** full constructor */
	public AbstractJx(String jxid, String jsmc, String bfjg, String hjdj,
			Date hjrq, String hjdm, String cmlb, Integer ssry) {
		this.jxid = jxid;
		this.jsmc = jsmc;
		this.bfjg = bfjg;
		this.hjdj = hjdj;
		this.hjrq = hjrq;
		this.hjdm = hjdm;
		this.cmlb = cmlb;
		this.ssry = ssry;
	}

	// Property accessors

	public String getJxid() {
		return this.jxid;
	}

	public void setJxid(String jxid) {
		this.jxid = jxid;
	}

	public String getJsmc() {
		return this.jsmc;
	}

	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}

	public String getBfjg() {
		return this.bfjg;
	}

	public void setBfjg(String bfjg) {
		this.bfjg = bfjg;
	}

	public String getHjdj() {
		return this.hjdj;
	}

	public void setHjdj(String hjdj) {
		this.hjdj = hjdj;
	}

	public Date getHjrq() {
		return this.hjrq;
	}

	public void setHjrq(Date hjrq) {
		this.hjrq = hjrq;
	}

	public String getHjdm() {
		return this.hjdm;
	}

	public void setHjdm(String hjdm) {
		this.hjdm = hjdm;
	}

	public String getCmlb() {
		return this.cmlb;
	}

	public void setCmlb(String cmlb) {
		this.cmlb = cmlb;
	}

	public Integer getSsry() {
		return this.ssry;
	}

	public void setSsry(Integer ssry) {
		this.ssry = ssry;
	}

}