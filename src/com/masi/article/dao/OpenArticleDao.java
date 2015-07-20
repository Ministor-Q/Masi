package com.masi.article.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Xygk;
import com.opensymphony.xwork2.ActionSupport;

public class OpenArticleDao extends HibernateDaoSupport{

	public Object getEntity(String code,String sql) {
		List<Object> lo=getHibernateTemplate().find(sql, new Object[]{code});
		
		return lo.get(0);
	}

	public void save(Object obj) {
		try{
		getHibernateTemplate().saveOrUpdate(obj);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
