package com.masi.djgz.dao;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Djgz;

public class DjgzDao extends HibernateDaoSupport{
	public List<Djgz> queryForPage(final String hql, final int offset, final int length) {
		List<Djgz> list = getHibernateTemplate().executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException,SQLException{
		Query query = session.createQuery(hql);
		query.setFirstResult(offset);
		query.setMaxResults(length);
		List<Djgz> list = query.list();
		return list;
		}
		});
		return list;
	}
	public int getAllRowCount(String hql) {
		// TODO Auto-generated method stub
	 return getHibernateTemplate().find(hql).size();
	}
}
