package com.masi.hibernate;

/**
 * AbstractJsfb entity provides the base persistence definition of the Jsfb
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJsfb implements java.io.Serializable {

	// Fields

	private JsfbId id;

	// Constructors

	/** default constructor */
	public AbstractJsfb() {
	}

	/** full constructor */
	public AbstractJsfb(JsfbId id) {
		this.id = id;
	}

	// Property accessors

	public JsfbId getId() {
		return this.id;
	}

	public void setId(JsfbId id) {
		this.id = id;
	}

}