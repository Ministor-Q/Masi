package com.masi.xsgz.dao;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Xsgz;

public class XsgzDao extends HibernateDaoSupport{
	public List<Xsgz> queryForPage(final String hql, final int offset, final int length) {
		List<Xsgz> list = getHibernateTemplate().executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException,SQLException{
		Query query = session.createQuery(hql);
		query.setFirstResult(offset);
		query.setMaxResults(length);
		List<Xsgz> list = query.list();
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
