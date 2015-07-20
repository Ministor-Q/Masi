package com.masi.xwgg.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Xwgg;

@Entity
public class TzggDao extends HibernateDaoSupport{
	public List queryForPage(final String hql, final int offset, final int length) {
		List<Xwgg> list = getHibernateTemplate().executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException,SQLException{
		Query query = session.createQuery(hql);
		query.setFirstResult(offset);
		query.setMaxResults(length);
		List<Xwgg> list = query.list();
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
