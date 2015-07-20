package com.masi.hibernate;

import java.sql.Timestamp;

/**
 * Norfile entity. @author MyEclipse Persistence Tools
 */
public class Norfile extends AbstractNorfile implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Norfile() {
	}

	/** full constructor */
	public Norfile(String fileid, String filename, String filetype,
			String fileattri, String fileaddr, String fileaddrtemp,
			Timestamp fileloadtime, Timestamp filepubltime,
			Integer filereadednum, String filepublisher) {
		super(fileid, filename, filetype, fileattri, fileaddr, fileaddrtemp,
				fileloadtime, filepubltime, filereadednum, filepublisher);
	}

}
