package com.masi.hibernate;

/**
 * Jsjy entity. @author MyEclipse Persistence Tools
 */
public class Jsjy extends AbstractJsjy implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Jsjy() {
	}

	/** minimal constructor */
	public Jsjy(String jsjy) {
		super(jsjy);
	}

	/** full constructor */
	public Jsjy(String jsjy, String jsid, String jysid, String jsjs) {
		super(jsjy, jsid, jysid, jsjs);
	}

}
