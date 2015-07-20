package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractJs entity provides the base persistence definition of the Js entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractJs implements java.io.Serializable {

	// Fields

	private String jsid;
	private String jsxm;
	private Integer jsxb;
	private String jszc;
	private String jsjg;
	private String byyx;
	private String jsxw;
	private String zplj;
	private Date gxrq;
	private Integer type;

	// Constructors

	/** default constructor */
	public AbstractJs() {
	}

	/** minimal constructor */
	public AbstractJs(String jsid, String jsxm, Integer jsxb, String jszc,
			String jsxw, Date gxrq) {
		this.jsid = jsid;
		this.jsxm = jsxm;
		this.jsxb = jsxb;
		this.jszc = jszc;
		this.jsxw = jsxw;
		this.gxrq = gxrq;
	}

	/** full constructor */
	public AbstractJs(String jsid, String jsxm, Integer jsxb, String jszc,
			String jsjg, String byyx, String jsxw, String zplj, Date gxrq,
			Integer type) {
		this.jsid = jsid;
		this.jsxm = jsxm;
		this.jsxb = jsxb;
		this.jszc = jszc;
		this.jsjg = jsjg;
		this.byyx = byyx;
		this.jsxw = jsxw;
		this.zplj = zplj;
		this.gxrq = gxrq;
		this.type = type;
	}

	// Property accessors

	public String getJsid() {
		return this.jsid;
	}

	public void setJsid(String jsid) {
		this.jsid = jsid;
	}

	public String getJsxm() {
		return this.jsxm;
	}

	public void setJsxm(String jsxm) {
		this.jsxm = jsxm;
	}

	public Integer getJsxb() {
		return this.jsxb;
	}

	public void setJsxb(Integer jsxb) {
		this.jsxb = jsxb;
	}

	public String getJszc() {
		return this.jszc;
	}

	public void setJszc(String jszc) {
		this.jszc = jszc;
	}

	public String getJsjg() {
		return this.jsjg;
	}

	public void setJsjg(String jsjg) {
		this.jsjg = jsjg;
	}

	public String getByyx() {
		return this.byyx;
	}

	public void setByyx(String byyx) {
		this.byyx = byyx;
	}

	public String getJsxw() {
		return this.jsxw;
	}

	public void setJsxw(String jsxw) {
		this.jsxw = jsxw;
	}

	public String getZplj() {
		return this.zplj;
	}

	public void setZplj(String zplj) {
		this.zplj = zplj;
	}

	public Date getGxrq() {
		return this.gxrq;
	}

	public void setGxrq(Date gxrq) {
		this.gxrq = gxrq;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}