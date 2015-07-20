package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Rcpy entity. @author MyEclipse Persistence Tools
 */
public class Rcpy extends AbstractRcpy implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Rcpy() {
	}

	/** minimal constructor */
	public Rcpy(Integer rcpyid) {
		super(rcpyid);
	}

	/** full constructor */
	public Rcpy(Integer rcpyid, String rcpyname, String rcpytype,
			String rcpyattri, String rcpyaddr, String rcpyaddrtemp,
			Timestamp rcpyloadtime, Timestamp rcpypubltime,String rcpykeyword,
			Integer rcpyreadednum, String rcpypublisher, String rcpycode) {
		super(rcpyid, rcpyname, rcpytype, rcpyattri, rcpyaddr, rcpyaddrtemp,
				rcpyloadtime, rcpypubltime,rcpykeyword, rcpyreadednum, rcpypublisher,
				rcpycode);
	}

}
