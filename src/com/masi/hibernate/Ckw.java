package com.masi.hibernate;

import java.util.Date;

/**
 * Ckw entity. @author MyEclipse Persistence Tools
 */
public class Ckw extends AbstractCkw implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ckw() {
	}

	/** minimal constructor */
	public Ckw(String cbwid) {
		super(cbwid);
	}

	/** full constructor */
	public Ckw(String cbwid, String cbwch, Integer cbwlx, String cbs,
			String cbwmc, Date cbnf, String zzlb) {
		super(cbwid, cbwch, cbwlx, cbs, cbwmc, cbnf, zzlb);
	}

}
