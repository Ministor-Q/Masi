package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Jxgz entity. @author MyEclipse Persistence Tools
 */
public class Jxgz extends AbstractJxgz implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Jxgz() {
	}

	/** minimal constructor */
	public Jxgz(Integer jxgzid) {
		super(jxgzid);
	}

	/** full constructor */
	public Jxgz(Integer jxgzid, String jxgzname, String jxgztype,
			String jxgzattri, String jxgzaddr, String jxgzaddrtemp,
			Timestamp jxgzloadtime, Timestamp jxgzpubltime,String jxgzkeyword,
			Integer jxgzreadednum, String jxgzpublisher, String jxgzcode) {
		super(jxgzid, jxgzname, jxgztype, jxgzattri, jxgzaddr, jxgzaddrtemp,
				jxgzloadtime, jxgzpubltime, jxgzkeyword,jxgzreadednum, jxgzpublisher,
				jxgzcode);
	}

}
