package com.masi.hibernate;

/**
 * AbstractBg entity provides the base persistence definition of the Bg entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractBg implements java.io.Serializable {

	// Fields

	private String bgid;
	private String jsid;
	private String bgsid;
	private String bgjs;

	// Constructors

	/** default constructor */
	public AbstractBg() {
	}

	/** minimal constructor */
	public AbstractBg(String bgid) {
		this.bgid = bgid;
	}

	/** full constructor */
	public AbstractBg(String bgid, String jsid, String bgsid, String bgjs) {
		this.bgid = bgid;
		this.jsid = jsid;
		this.bgsid = bgsid;
		this.bgjs = bgjs;
	}

	// Property accessors

	public String getBgid() {
		return this.bgid;
	}

	public void setBgid(String bgid) {
		this.bgid = bgid;
	}

	public String getJsid() {
		return this.jsid;
	}

	public void setJsid(String jsid) {
		this.jsid = jsid;
	}

	public String getBgsid() {
		return this.bgsid;
	}

	public void setBgsid(String bgsid) {
		this.bgsid = bgsid;
	}

	public String getBgjs() {
		return this.bgjs;
	}

	public void setBgjs(String bgjs) {
		this.bgjs = bgjs;
	}

}