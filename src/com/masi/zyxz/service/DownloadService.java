package com.masi.zyxz.service;

import com.masi.hibernate.Zyxz;
import com.masi.zyxz.dao.DownloadDao;

public class DownloadService {
	private DownloadDao downloadDao;

	public DownloadDao getDownloadDao() {
		return downloadDao;
	}

	public void setDownloadDao(DownloadDao downloadDao) {
		this.downloadDao = downloadDao;
	}

	public Zyxz getZyxz(String zyxzcode) {
		
		return downloadDao.getZyxz(zyxzcode);
	}
	
}
