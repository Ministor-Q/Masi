package com.masi.zyxz.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Xwgg;
import com.masi.hibernate.Zyxz;

public class CywjDao extends HibernateDaoSupport{


	public int getAllRowCount(String hql) {
		 return getHibernateTemplate().find(hql).size();
	}

	public List<Zyxz> queryForPage( final String hql, final int offset, final int length) {
		List<Zyxz> list = getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException,SQLException{
			Query query = session.createQuery(hql);
			query.setFirstResult(offset);
			query.setMaxResults(length);
			List<Zyxz> list = query.list();
			return list;
			}
			});
			return list;
	}

}
