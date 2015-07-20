package com.masi.admin.dao;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.masi.hibernate.Xwgg;
import com.masi.util.DataSource;

public class ManageDao extends HibernateDaoSupport {

	
	
	public List<Object> find(String firstTitle, String secondTitle) throws Exception{
		String title = firstTitle + "_" + secondTitle;
		title = new String(title.getBytes("UTF-8"),"UTF-8");
		String codeString = new DataSource().getCodeByTitle(title);
		String tableName = tableName(codeString);
		tableName = tableName.substring(0,1).toUpperCase() + tableName.substring(1);
		String colName = tableName + "code";
		
		String sql = "from com.masi.hibernate." + tableName + " where " + colName + " >= " + "'"+codeString+"000000000000' and " + colName + " <= " + "'"+codeString+"999999999999'";
		List<Object> objList = super.getHibernateTemplate().find(sql);
		return objList;
	}
	
	public List queryForPage(final String hql, final int offset, final int length) {
		List<Object> list = getHibernateTemplate().executeFind(new HibernateCallback(){
		public Object doInHibernate(Session session) throws HibernateException,SQLException{
		Query query = session.createQuery(hql);
		query.setFirstResult(offset);
		query.setMaxResults(length);
		List<Object> list = query.list();
		return list;
		}
		});
		return list;
	}
	
	public static String tableName(String codeString){
		char code = codeString.charAt(1);
		String tableName = null;
		switch (code) {
		case '1':
			tableName = "sy";
			break;
		case '2':
			tableName = "xygk";
			break;
		case '3':
			tableName = "jxgz";
			break;
		case '4':
			tableName = "kygz";
			break;
		case '5':
			tableName = "rcpy";
			break;
		case '6':
			tableName = "xsgz";
			break;
		case '7':
			tableName = "xwgg";
			break;
		case '8':
			tableName = "djgz";
			break;
		case '9':
			tableName = "szdw";
			break;
		case '0':
			tableName = "zyxz";
			break;
		default:
			break;
		}
		
		return tableName;
		
	}

	public int getAllRowCount(String hql) {
	 return getHibernateTemplate().find(hql).size();
	}
	
}
