package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Kygz entity. @author MyEclipse Persistence Tools
 */
public class Kygz extends AbstractKygz implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Kygz() {
	}

	/** minimal constructor */
	public Kygz(Integer kygzid) {
		super(kygzid);
	}

	/** full constructor */
	public Kygz(Integer kygzid, String kygzname, String kygztype,
			String kygzattri, String kygzaddr, String kygzaddrtemp,
			Timestamp kygzloadtime, Timestamp kygzpubltime,String kygzkeyword,
			Integer kygzreadednum, String kygzpublisher, String kygzcode) {
		super(kygzid, kygzname, kygztype, kygzattri, kygzaddr, kygzaddrtemp,
				kygzloadtime, kygzpubltime,kygzkeyword, kygzreadednum, kygzpublisher,
				kygzcode);
	}

}
