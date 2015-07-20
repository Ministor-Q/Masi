package com.masi.hibernate;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */
public class Admin extends AbstractAdmin implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** minimal constructor */
	public Admin(Integer userid, String username, String userpwd) {
		super(userid, username, userpwd);
	}

	/** full constructor */
	public Admin(Integer userid, String username, String userpwd,
			String userlimit) {
		super(userid, username, userpwd, userlimit);
	}

}
