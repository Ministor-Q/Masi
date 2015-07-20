package com.masi.hibernate;

/**
 * AbstractJsfbId entity provides the base persistence definition of the JsfbId
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJsfbId implements java.io.Serializable {

	// Fields

	private String jsfbid;
	private String jsid;
	private String lwid;
	private Integer pm;

	// Constructors

	/** default constructor */
	public AbstractJsfbId() {
	}

	/** minimal constructor */
	public AbstractJsfbId(String jsfbid) {
		this.jsfbid = jsfbid;
	}

	/** full constructor */
	public AbstractJsfbId(String jsfbid, String jsid, String lwid, Integer pm) {
		this.jsfbid = jsfbid;
		this.jsid = jsid;
		this.lwid = lwid;
		this.pm = pm;
	}

	// Property accessors

	public String getJsfbid() {
		return this.jsfbid;
	}

	public void setJsfbid(String jsfbid) {
		this.jsfbid = jsfbid;
	}

	public String getJsid() {
		return this.jsid;
	}

	public void setJsid(String jsid) {
		this.jsid = jsid;
	}

	public String getLwid() {
		return this.lwid;
	}

	public void setLwid(String lwid) {
		this.lwid = lwid;
	}

	public Integer getPm() {
		return this.pm;
	}

	public void setPm(Integer pm) {
		this.pm = pm;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractJsfbId))
			return false;
		AbstractJsfbId castOther = (AbstractJsfbId) other;

		return ((this.getJsfbid() == castOther.getJsfbid()) || (this
				.getJsfbid() != null && castOther.getJsfbid() != null && this
				.getJsfbid().equals(castOther.getJsfbid())))
				&& ((this.getJsid() == castOther.getJsid()) || (this.getJsid() != null
						&& castOther.getJsid() != null && this.getJsid()
						.equals(castOther.getJsid())))
				&& ((this.getLwid() == castOther.getLwid()) || (this.getLwid() != null
						&& castOther.getLwid() != null && this.getLwid()
						.equals(castOther.getLwid())))
				&& ((this.getPm() == castOther.getPm()) || (this.getPm() != null
						&& castOther.getPm() != null && this.getPm().equals(
						castOther.getPm())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getJsfbid() == null ? 0 : this.getJsfbid().hashCode());
		result = 37 * result
				+ (getJsid() == null ? 0 : this.getJsid().hashCode());
		result = 37 * result
				+ (getLwid() == null ? 0 : this.getLwid().hashCode());
		result = 37 * result + (getPm() == null ? 0 : this.getPm().hashCode());
		return result;
	}

}