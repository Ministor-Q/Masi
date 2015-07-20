package com.masi.hibernate;

/**
 * AbstractJysId entity provides the base persistence definition of the JysId
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJysId implements java.io.Serializable {

	// Fields

	private String jysid;
	private String jysmc;

	// Constructors

	/** default constructor */
	public AbstractJysId() {
	}

	/** minimal constructor */
	public AbstractJysId(String jysid) {
		this.jysid = jysid;
	}

	/** full constructor */
	public AbstractJysId(String jysid, String jysmc) {
		this.jysid = jysid;
		this.jysmc = jysmc;
	}

	// Property accessors

	public String getJysid() {
		return this.jysid;
	}

	public void setJysid(String jysid) {
		this.jysid = jysid;
	}

	public String getJysmc() {
		return this.jysmc;
	}

	public void setJysmc(String jysmc) {
		this.jysmc = jysmc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractJysId))
			return false;
		AbstractJysId castOther = (AbstractJysId) other;

		return ((this.getJysid() == castOther.getJysid()) || (this.getJysid() != null
				&& castOther.getJysid() != null && this.getJysid().equals(
				castOther.getJysid())))
				&& ((this.getJysmc() == castOther.getJysmc()) || (this
						.getJysmc() != null && castOther.getJysmc() != null && this
						.getJysmc().equals(castOther.getJysmc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getJysid() == null ? 0 : this.getJysid().hashCode());
		result = 37 * result
				+ (getJysmc() == null ? 0 : this.getJysmc().hashCode());
		return result;
	}

}