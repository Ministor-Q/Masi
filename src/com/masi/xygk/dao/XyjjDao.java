package com.masi.xygk.dao;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Xygk;


@Entity
public class XyjjDao extends HibernateDaoSupport{

	@SuppressWarnings("unchecked")
	public Xygk getXyjj(Xygk xygk) {
		String sql="from Xygk xygk where xygk.xygkname =?";
		List<Xygk> lf = this.getHibernateTemplate().find(sql,new Object[]{xygk.getXygkname()});
		return lf.get(0);
	}

	

}
