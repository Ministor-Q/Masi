package com.masi.zyxz.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Zyxz;

public class DownloadDao extends HibernateDaoSupport{

	public Zyxz getZyxz(String zyxzcode) {
		String sql ="from Zyxz zyxz where  zyxz.zyxzcode=?";
		@SuppressWarnings("unchecked")
		List<Zyxz> lz =getHibernateTemplate().find(sql, zyxzcode);
		return lz.get(0);
	}

}
