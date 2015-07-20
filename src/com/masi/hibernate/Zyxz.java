package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Zyxz entity. @author MyEclipse Persistence Tools
 */
public class Zyxz extends AbstractZyxz implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Zyxz() {
	}

	/** minimal constructor */
	public Zyxz(Integer zyxzid) {
		super(zyxzid);
	}

	/** full constructor */
	public Zyxz(Integer zyxzid, String zyxzname, String zyxztype,
			String zyxzattri, String zyxzaddr, String zyxzaddrtemp,
			Timestamp zyxzloadtime, Timestamp zyxzpubltime,String zyzxkeyword,
			Integer zyxzreadednum, String zyxzpublisher, String zyxzcode) {
		super(zyxzid, zyxzname, zyxztype, zyxzattri, zyxzaddr, zyxzaddrtemp,
				zyxzloadtime, zyxzpubltime,zyzxkeyword, zyxzreadednum, zyxzpublisher,
				zyxzcode);
	}

}
