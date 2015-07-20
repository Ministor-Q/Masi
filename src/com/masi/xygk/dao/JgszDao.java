package com.masi.xygk.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Norfile;
import com.masi.hibernate.Xygk;

public class JgszDao extends HibernateDaoSupport{

	public Norfile getJgszArticle(Norfile file) {
			String sql="from Norfile file where file.filename =?";
			List<Norfile> lf = this.getHibernateTemplate().find(sql,new Object[]{file.getFilename()});
			return lf.get(0);
		
	}
	public Xygk getXyjj(Xygk xygk) {
		String sql="from Xygk xygk where xygk.xygkname =?";
		List<Xygk> lf = this.getHibernateTemplate().find(sql,new Object[]{xygk.getXygkname()});
		return lf.get(0);
	}


}
