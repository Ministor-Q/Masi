package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Xwgg entity. @author MyEclipse Persistence Tools
 */
public class Xwgg extends AbstractXwgg implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Xwgg() {
	}

	/** minimal constructor */
	public Xwgg(Integer xwggid) {
		super(xwggid);
	}

	/** full constructor */
	public Xwgg(Integer xwggid, String xwggname, String xwggtype,
			String xwggattri, String xwggaddr, String xwggaddrtemp,
			Timestamp xwggloadtime, Timestamp xwggpubltime,String xwggkeyword,
			Integer xwggreadednum, String xwggpublisher, String xwggcode) {
		super(xwggid, xwggname, xwggtype, xwggattri, xwggaddr, xwggaddrtemp,
				xwggloadtime, xwggpubltime,xwggkeyword, xwggreadednum, xwggpublisher,
				xwggcode);
	}

}
