package com.masi.hibernate;

import java.util.Date;

/**
 * Lw entity. @author MyEclipse Persistence Tools
 */
public class Lw extends AbstractLw implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Lw() {
	}

	/** minimal constructor */
	public Lw(String lwid) {
		super(lwid);
	}

	/** full constructor */
	public Lw(String lwid, String lwtm, String zzlb, Integer lwlx, Integer lwq,
			Integer lwj, Date lwfbsj, String lwfbkw, String lwjsqk, Integer ssry) {
		super(lwid, lwtm, zzlb, lwlx, lwq, lwj, lwfbsj, lwfbkw, lwjsqk, ssry);
	}

}
