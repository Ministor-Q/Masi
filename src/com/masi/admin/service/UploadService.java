package com.masi.admin.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.masi.admin.dao.UploadDao;
import com.masi.hibernate.Jxgz;
import com.masi.hibernate.Kygz;

public class UploadService {
	private UploadDao uploadDao;

	public UploadDao getUploadDao() {
		return uploadDao;
	}

	public void setUploadDao(UploadDao uploadDao) {
		this.uploadDao = uploadDao;
	}

	public void setFile2Db(Object obj) {
		uploadDao.setFile2Db(obj);
		
	}

	/*public String  setFile2Db(String tableName, String uploadFileName,
			String uploadContentType, String attri, String secondContent) {
		
	}*/
		
}
