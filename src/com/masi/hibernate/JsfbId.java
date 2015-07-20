package com.masi.hibernate;

/**
 * JsfbId entity. @author MyEclipse Persistence Tools
 */
public class JsfbId extends AbstractJsfbId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public JsfbId() {
	}

	/** minimal constructor */
	public JsfbId(String jsfbid) {
		super(jsfbid);
	}

	/** full constructor */
	public JsfbId(String jsfbid, String jsid, String lwid, Integer pm) {
		super(jsfbid, jsid, lwid, pm);
	}

}
