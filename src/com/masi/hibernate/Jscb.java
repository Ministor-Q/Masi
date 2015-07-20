package com.masi.hibernate;

/**
 * Jscb entity. @author MyEclipse Persistence Tools
 */
public class Jscb extends AbstractJscb implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Jscb() {
	}

	/** minimal constructor */
	public Jscb(String jscbid) {
		super(jscbid);
	}

	/** full constructor */
	public Jscb(String jscbid, String jsid, String cbwid, Integer pm) {
		super(jscbid, jsid, cbwid, pm);
	}

}
