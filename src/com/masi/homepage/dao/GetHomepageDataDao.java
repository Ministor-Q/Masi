package com.masi.homepage.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Xwgg;

public class GetHomepageDataDao extends HibernateDaoSupport{

	public  List<Object> queryHomepage(String sql) {
		List<Object> lo = getHibernateTemplate().find(sql);
		return lo;
	}
	public List<Object> queryHomepage(final String hql, final int length) {
		List<Object> list = getHibernateTemplate().executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException,SQLException{
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(length);
		List<Object> list = query.list();
		return list;
		}
		});
		return list;
	}
}
