package com.masi.hibernate;

/**
 * JysId entity. @author MyEclipse Persistence Tools
 */
public class JysId extends AbstractJysId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public JysId() {
	}

	/** minimal constructor */
	public JysId(String jysid) {
		super(jysid);
	}

	/** full constructor */
	public JysId(String jysid, String jysmc) {
		super(jysid, jysmc);
	}

}
