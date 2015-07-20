package com.masi.admin.dao;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class DeleteDao extends HibernateDaoSupport {

	public String delete(final String hsql){
		
		Object obj = super.getHibernateTemplate().execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query = session.createQuery(hsql);
				int ii = query.executeUpdate();
				System.out.println(ii);
				return "success";
			}
		});
		return obj.toString();
	}
	
    /**
     * 删除单个文件
     * @param   sPath    被删除文件的文件名
     * @return 单个文件删除成功返回true，否则返回false
     */
    public boolean deleteFile(String sPath) {
        boolean flag = false;
        File file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }
    
    public String[] queryByCode(String tableName1, String code){
    	String sql = "select * from masi." + tableName1 + " where " + tableName1 + "code= '"+code+"'";
    	Session session=this.getSession();
    	Transaction transaction=session.beginTransaction();
    	 SQLQuery s=(SQLQuery) session.createSQLQuery(sql); 
    	  
    	  s.addScalar(tableName1+"addr",Hibernate.STRING); //列名, 数据类型
    	  s.addScalar(tableName1+"name",Hibernate.STRING);
    	  s.addScalar(tableName1+"type",Hibernate.STRING);
    	  s.addScalar(tableName1+"addrtemp",Hibernate.STRING);
    	  if(tableName1.equalsIgnoreCase("sy")){
    		  s.addScalar("sypicaddr",Hibernate.STRING);
    	  }
    	  List list=s.list();
    	 
    	  Object[] objects=(Object[])list.get(0);
    	  
    	  String[] strArray = new String[3];
    	  strArray[0] = objects[0].toString()+"//"+objects[1].toString()+"."+objects[2].toString();
    	  strArray[1] = objects[3].toString();
    	  if(tableName1.equalsIgnoreCase("sy")){
    		  strArray[2] = objects[4].toString();
    	  }
    	  return strArray;
    }
	
}
