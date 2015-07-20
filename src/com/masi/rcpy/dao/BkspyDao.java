package com.masi.rcpy.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Rcpy;

public class BkspyDao extends HibernateDaoSupport{
	public List<Rcpy> queryForPage(final String hql, final int offset, final int length) {
		List<Rcpy> list = getHibernateTemplate().executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException,SQLException{
		Query query = session.createQuery(hql);
		query.setFirstResult(offset);
		query.setMaxResults(length);
		List<Rcpy> list = query.list();
		return list;
		}
		});
		return list;
	}
	public int getAllRowCount(String hql) {
		// TODO Auto-generated method stub
	 return getHibernateTemplate().find(hql).size();
	}

	public Rcpy getBkspy(Rcpy file) {
		// TODO Auto-generated method stub
		String sql ="from Rcpy file where file.rcpyname=?";
		List<Rcpy> ln =getHibernateTemplate().find(sql,new Object[]{file.getRcpyname()});
		return ln.get(0);
	}

}
