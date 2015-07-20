package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractLw entity provides the base persistence definition of the Lw entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractLw implements java.io.Serializable {

	// Fields

	private String lwid;
	private String lwtm;
	private String zzlb;
	private Integer lwlx;
	private Integer lwq;
	private Integer lwj;
	private Date lwfbsj;
	private String lwfbkw;
	private String lwjsqk;
	private Integer ssry;

	// Constructors

	/** default constructor */
	public AbstractLw() {
	}

	/** minimal constructor */
	public AbstractLw(String lwid) {
		this.lwid = lwid;
	}

	/** full constructor */
	public AbstractLw(String lwid, String lwtm, String zzlb, Integer lwlx,
			Integer lwq, Integer lwj, Date lwfbsj, String lwfbkw,
			String lwjsqk, Integer ssry) {
		this.lwid = lwid;
		this.lwtm = lwtm;
		this.zzlb = zzlb;
		this.lwlx = lwlx;
		this.lwq = lwq;
		this.lwj = lwj;
		this.lwfbsj = lwfbsj;
		this.lwfbkw = lwfbkw;
		this.lwjsqk = lwjsqk;
		this.ssry = ssry;
	}

	// Property accessors

	public String getLwid() {
		return this.lwid;
	}

	public void setLwid(String lwid) {
		this.lwid = lwid;
	}

	public String getLwtm() {
		return this.lwtm;
	}

	public void setLwtm(String lwtm) {
		this.lwtm = lwtm;
	}

	public String getZzlb() {
		return this.zzlb;
	}

	public void setZzlb(String zzlb) {
		this.zzlb = zzlb;
	}

	public Integer getLwlx() {
		return this.lwlx;
	}

	public void setLwlx(Integer lwlx) {
		this.lwlx = lwlx;
	}

	public Integer getLwq() {
		return this.lwq;
	}

	public void setLwq(Integer lwq) {
		this.lwq = lwq;
	}

	public Integer getLwj() {
		return this.lwj;
	}

	public void setLwj(Integer lwj) {
		this.lwj = lwj;
	}

	public Date getLwfbsj() {
		return this.lwfbsj;
	}

	public void setLwfbsj(Date lwfbsj) {
		this.lwfbsj = lwfbsj;
	}

	public String getLwfbkw() {
		return this.lwfbkw;
	}

	public void setLwfbkw(String lwfbkw) {
		this.lwfbkw = lwfbkw;
	}

	public String getLwjsqk() {
		return this.lwjsqk;
	}

	public void setLwjsqk(String lwjsqk) {
		this.lwjsqk = lwjsqk;
	}

	public Integer getSsry() {
		return this.ssry;
	}

	public void setSsry(Integer ssry) {
		this.ssry = ssry;
	}

}