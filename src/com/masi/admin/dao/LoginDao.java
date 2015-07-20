package com.masi.admin.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Admin;

public class LoginDao extends HibernateDaoSupport {

	/**
	 * 查询admin表中用户记录list
	 * @param name
	 * @param password
	 * @return
	 */
	public List<Admin> login(String name, String password) {
		List<Admin> list = getHibernateTemplate()
				.find("from Admin u where u.username=? and u.userpwd=? ",
						new Object[] { name, password });
		List<Admin> list2 = super
		.getHibernateTemplate()
		.find("from Admin u where u.userid=1 ",
				null);

		return list;
	}

}
