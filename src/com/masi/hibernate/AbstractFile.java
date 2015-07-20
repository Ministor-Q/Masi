package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * AbstractFile entity provides the base persistence definition of the File
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFile implements java.io.Serializable {

	// Fields

	private String fileid;
	private String filename;
	private String filetype;
	private String fileattri;
	private String fileaddr;
	private Timestamp fileloadtime;
	private Timestamp filepubltime;
	private Integer filereadednum;
	private String filepublisher;

	// Constructors

	/** default constructor */
	public AbstractFile() {
	}

	/** full constructor */
	public AbstractFile(String filename, String filetype, String fileattri,
			String fileaddr, Timestamp fileloadtime, Timestamp filepubltime,
			Integer filereadednum, String filepublisher) {
		this.filename = filename;
		this.filetype = filetype;
		this.fileattri = fileattri;
		this.fileaddr = fileaddr;
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

	public Timestamp getFileloadtime() {
		return this.fileloadtime;
	}

	public void setFileloadtime(Timestamp fileloadtime) {
		this.fileloadtime = fileloadtime;
	}

	public Timestamp getFilepubltime() {
		return this.filepubltime;
	}

	public void setFilepubltime(Timestamp filepubltime) {
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