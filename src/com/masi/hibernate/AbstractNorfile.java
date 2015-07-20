package com.masi.hibernate;

import java.util.Date;

/**
 * AbstractNorfile entity provides the base persistence definition of the
 * Norfile entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractNorfile implements java.io.Serializable {

	// Fields

	private String fileid;
	private String filename;
	private String filetype;
	private String fileattri;
	private String fileaddr;
	private String fileaddrtemp;
	private Date fileloadtime;
	private Date filepubltime;
	private Integer filereadednum;
	private String filepublisher;

	// Constructors

	/** default constructor */
	public AbstractNorfile() {
	}

	/** minimal constructor */
	public AbstractNorfile(String fileid) {
		this.fileid = fileid;
	}

	/** full constructor */
	public AbstractNorfile(String fileid, String filename, String filetype,
			String fileattri, String fileaddr, String fileaddrtemp,
			Date fileloadtime, Date filepubltime, Integer filereadednum,
			String filepublisher) {
		this.fileid = fileid;
		this.filename = filename;
		this.filetype = filetype;
		this.fileattri = fileattri;
		this.fileaddr = fileaddr;
		this.fileaddrtemp = fileaddrtemp;
		this.fileloadtime = fileloadtime;
		this.filepubltime = filepubltime;
		this.filereadednum = filereadednum;
		this.filepublisher = filepublisher;
	}

	// Property accessors

	public String getFileid() {
		return this.fileid;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFiletype() {
		return this.filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getFileattri() {
		return this.fileattri;
	}

	public void setFileattri(String fileattri) {
		this.fileattri = fileattri;
	}

	public String getFileaddr() {
		return this.fileaddr;
	}

	public void setFileaddr(String fileaddr) {
		this.fileaddr = fileaddr;
	}

	public String getFileaddrtemp() {
		return this.fileaddrtemp;
	}

	public void setFileaddrtemp(String fileaddrtemp) {
		this.fileaddrtemp = fileaddrtemp;
	}

	public Date getFileloadtime() {
		return this.fileloadtime;
	}

	public void setFileloadtime(Date fileloadtime) {
		this.fileloadtime = fileloadtime;
	}

	public Date getFilepubltime() {
		return this.filepubltime;
	}

	public void setFilepubltime(Date filepubltime) {
		this.filepubltime = filepubltime;
	}

	public Integer getFilereadednum() {
		return this.filereadednum;
	}

	public void setFilereadednum(Integer filereadednum) {
		this.filereadednum = filereadednum;
	}

	public String getFilepublisher() {
		return this.filepublisher;
	}

	public void setFilepublisher(String filepublisher) {
		this.filepublisher = filepublisher;
	}

}