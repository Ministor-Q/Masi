package com.masi.hibernate;

import java.util.Date;

/**
 * Js entity. @author MyEclipse Persistence Tools
 */
public class Js extends AbstractJs implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Js() {
	}

	/** minimal constructor */
	public Js(String jsid, String jsxm, Integer jsxb, String jszc, String jsxw,
			Date gxrq) {
		super(jsid, jsxm, jsxb, jszc, jsxw, gxrq);
	}

	/** full constructor */
	public Js(String jsid, String jsxm, Integer jsxb, String jszc, String jsjg,
			String byyx, String jsxw, String zplj, Date gxrq, Integer type) {
		super(jsid, jsxm, jsxb, jszc, jsjg, byyx, jsxw, zplj, gxrq, type);
	}

}
