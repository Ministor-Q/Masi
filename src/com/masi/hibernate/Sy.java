package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Sy entity. @author MyEclipse Persistence Tools
 */
public class Sy extends AbstractSy implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Sy() {
	}

	/** minimal constructor */
	public Sy(Integer syid) {
		super(syid);
	}

	/** full constructor */
	public Sy(Integer syid, String syname, String sytype, String syattri,
			String syaddr, String syaddrtemp, Timestamp syloadtime,
			Timestamp sypubltime,String keyword,String sypicaddr,String sypiccode, Integer syreadednum, String sypublisher,
			String sycode) {
		super(syid, syname, sytype, syattri, syaddr, syaddrtemp, syloadtime,
				sypubltime,keyword,sypicaddr,sypiccode, syreadednum, sypublisher, sycode);
	}

}
