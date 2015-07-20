package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Szdw entity. @author MyEclipse Persistence Tools
 */
public class Szdw extends AbstractSzdw implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Szdw() {
	}

	/** minimal constructor */
	public Szdw(Integer szdwid) {
		super(szdwid);
	}

	/** full constructor */
	public Szdw(Integer szdwid, String szdwname, String szdwtype, String szdwattri,
			String szdwaddr, String szdwaddrtemp, Timestamp szdwloadtime,
			Timestamp szdwpubltime,String keyword,String szdwpicaddr,String szdwpiccode, Integer szdwreadednum, String szdwpublisher,
			String szdwcode) {
		super(szdwid, szdwname, szdwtype, szdwattri, szdwaddr, szdwaddrtemp, szdwloadtime,
				szdwpubltime,keyword,szdwpicaddr,szdwpiccode, szdwreadednum, szdwpublisher, szdwcode);
	}

}
