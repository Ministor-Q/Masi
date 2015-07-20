package com.masi.hibernate;

/**
 * Bg entity. @author MyEclipse Persistence Tools
 */
public class Bg extends AbstractBg implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Bg() {
	}

	/** minimal constructor */
	public Bg(String bgid) {
		super(bgid);
	}

	/** full constructor */
	public Bg(String bgid, String jsid, String bgsid, String bgjs) {
		super(bgid, jsid, bgsid, bgjs);
	}

}
