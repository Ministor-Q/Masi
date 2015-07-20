package com.masi.szdw.dao;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Szdw;

public class SzdwDao extends HibernateDaoSupport{
	public List<Szdw> queryForPage(final String hql, final int offset, final int length) {
		List<Szdw> list = getHibernateTemplate().executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException,SQLException{
		Query query = session.createQuery(hql);
		query.setFirstResult(offset);
		query.setMaxResults(length);
		List<Szdw> list = query.list();
		return list;
		}
		});
		return list;
	}
	public int getAllRowCount(String hql) {
	 return getHibernateTemplate().find(hql).size();
	}
	public List<Szdw> getAllListByAttri(String attri,String sql) {
		List<Szdw> lo = getHibernateTemplate().find(sql,new Object[]{attri});
		return lo;
		
		
	}
}
