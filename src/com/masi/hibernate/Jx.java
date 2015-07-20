package com.masi.hibernate;

import java.util.Date;

/**
 * Jx entity. @author MyEclipse Persistence Tools
 */
public class Jx extends AbstractJx implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Jx() {
	}

	/** minimal constructor */
	public Jx(String jxid) {
		super(jxid);
	}

	/** full constructor */
	public Jx(String jxid, String jsmc, String bfjg, String hjdj, Date hjrq,
			String hjdm, String cmlb, Integer ssry) {
		super(jxid, jsmc, bfjg, hjdj, hjrq, hjdm, cmlb, ssry);
	}

}
