package com.masi.admin.service;

import java.io.File;

import com.masi.admin.dao.DeleteDao;
import com.masi.util.TableNameHandle;

public class DeleteService {

	private DeleteDao deleteDao;

	public String delete(String[] codes){
		String tableName = "";
		if(codes[0].substring(0,2).equals("00")){
			tableName = "sy";
		}else{
			tableName = TableNameHandle.tableName(codes[0].substring(0,4));
		}
		String tableName1 = tableName.substring(0,1).toUpperCase() + tableName.substring(1);
		String colName = tableName + "code";
		
		for(int i = 0; i < codes.length; i++){
			String[] strs = deleteDao.queryByCode(tableName1, codes[i]);
			deleteDao.deleteFile(strs[0]);
			deleteDao.deleteFile(strs[1]);
			if(tableName.equals("sy")){
				deleteDao.deleteFile(strs[2]);
			}
			String path = "E://masi/docpic/";
			if(codes[i].substring(0,2).equals("00")){
				path = path + codes[i].substring(2,6)+"/" + codes[i].substring(6);
			}else{
				path = path +codes[i].substring(0,4)+"/"+codes[i].substring(4);
			}
			deleteDirectory(path);
		}
		
		
		String hql = "delete from com.masi.hibernate."+tableName1+" where ";
		for(int i = 0; i < codes.length; i++){
			hql += colName + " = '"+codes[i]+"' ";
			if(i!=codes.length-1){
				hql += " or ";
			}
		}
		final String hsql = hql;
		return deleteDao.delete(hsql);
	}
	
	public DeleteDao getDeleteDao() {
		return deleteDao;
	}

	public void setDeleteDao(DeleteDao deleteDao) {
		this.deleteDao = deleteDao;
	}
	
	private void deleteDirectory(String path){
	 try {
	        deleteAllFile(path); //删除完里面所有内容
	        String filePath = path;
	        filePath = filePath.toString();
	        File myFilePath = new File(filePath);
	        myFilePath.delete(); //删除空文件夹
	     } catch (Exception e) {
	       e.printStackTrace(); 
	     }
	}
	
	private boolean deleteAllFile(String path){
		boolean flag = false;
		File file = new File(path);
	       if (!file.exists()) {
	         return flag;
	       }
	       if (!file.isDirectory()) {
	         return flag;
	       }
	       String[] tempList = file.list();
	       File temp = null;
	       for (int i = 0; i < tempList.length; i++) {
	          if (path.endsWith(File.separator)) {
	             temp = new File(path + tempList[i]);
	          } else {
	              temp = new File(path + File.separator + tempList[i]);
	          }
	          if (temp.isFile()) {
	             temp.delete();
	          }
	       }
	       if(file.list().length == 0){
	    	   return true;
	       }
		return flag;
	}
	
}
