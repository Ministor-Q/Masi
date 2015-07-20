package com.masi.admin.dao;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Jxgz;

public class UploadDao extends HibernateDaoSupport {

	/**
	 * 保存实体对象
	 * @param obj
	 */
	public void setFile2Db(Object obj) {
		getHibernateTemplate().saveOrUpdate(obj);
	}

}
