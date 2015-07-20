package com.masi.hibernate;

/**
 * AbstractAdmin entity provides the base persistence definition of the Admin
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAdmin implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String username;
	private String userpwd;
	private String userlimit;

	// Constructors

	/** default constructor */
	public AbstractAdmin() {
	}

	/** minimal constructor */
	public AbstractAdmin(Integer userid, String username, String userpwd) {
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
	}

	/** full constructor */
	public AbstractAdmin(Integer userid, String username, String userpwd,
			String userlimit) {
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.userlimit = userlimit;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUserlimit() {
		return this.userlimit;
	}

	public void setUserlimit(String userlimit) {
		this.userlimit = userlimit;
	}

}