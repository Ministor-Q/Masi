package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Djgz entity. @author MyEclipse Persistence Tools
 */
public class Djgz extends AbstractDjgz implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Djgz() {
	}

	/** minimal constructor */
	public Djgz(Integer djgzid) {
		super(djgzid);
	}

	/** full constructor */
	public Djgz(Integer djgzid, String djgzname, String djgztype,
			String djgzattri, String djgzaddr, String djgzaddrtemp,
			Timestamp djgzloadtime, Timestamp djgzpubltime,String djgzkeyword,
			Integer djgzreadednum, String djgzpublisher, String djgzcode) {
		super(djgzid, djgzname, djgztype, djgzattri, djgzaddr, djgzaddrtemp,
				djgzloadtime, djgzpubltime,djgzkeyword, djgzreadednum, djgzpublisher,
				djgzcode);
	}

}
