package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Xsgz entity. @author MyEclipse Persistence Tools
 */
public class Xsgz extends AbstractXsgz implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Xsgz() {
	}

	/** minimal constructor */
	public Xsgz(Integer xsgzid) {
		super(xsgzid);
	}

	/** full constructor */
	public Xsgz(Integer xsgzid, String xsgzname, String xsgztype,
			String xsgzattri, String xsgzaddr, String xsgzaddrtemp,
			Timestamp xsgzloadtime, Timestamp xsgzpubltime,String xsgzkeyword,
			Integer xsgzreadednum, String xsgzpublisher, String xsgzcode) {
		super(xsgzid, xsgzname, xsgztype, xsgzattri, xsgzaddr, xsgzaddrtemp,
				xsgzloadtime, xsgzpubltime,xsgzkeyword, xsgzreadednum, xsgzpublisher,
				xsgzcode);
	}

}
