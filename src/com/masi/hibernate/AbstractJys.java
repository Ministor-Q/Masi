package com.masi.hibernate;

/**
 * AbstractJys entity provides the base persistence definition of the Jys
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJys implements java.io.Serializable {

	// Fields

	private JysId id;

	// Constructors

	/** default constructor */
	public AbstractJys() {
	}

	/** full constructor */
	public AbstractJys(JysId id) {
		this.id = id;
	}

	// Property accessors

	public JysId getId() {
		return this.id;
	}

	public void setId(JysId id) {
		this.id = id;
	}

}