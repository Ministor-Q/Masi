package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Xygk entity. @author MyEclipse Persistence Tools
 */
public class Xygk extends AbstractXygk implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Xygk() {
	}

	/** minimal constructor */
	public Xygk(Integer xygkid) {
		super(xygkid);
	}

	/** full constructor */
	public Xygk(Integer xygkid, String xygkname, String xygktype,
			String xygkattri, String xygkaddr, String xygkaddrtemp,
			Timestamp xygkloadtime, Timestamp xygkpubltime,
			Integer xygkreadednum, String xygkpublisher, String xygkcode) {
		super(xygkid, xygkname, xygktype, xygkattri, xygkaddr, xygkaddrtemp,
				xygkloadtime, xygkpubltime, xygkreadednum, xygkpublisher,
				xygkcode);
	}

}
