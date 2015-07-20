package com.masi.admin.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.masi.admin.dao.ManageDao;
import com.masi.hibernate.Manage;
import com.masi.hibernate.Xwgg;
import com.masi.util.Page;
import com.masi.util.TableNameHandle;

public class ManageService {

	private ManageDao manageDao;
	
	public List<Object> find(String firstTitle, String secondTitle) throws Exception{
		
		return manageDao.find(firstTitle, secondTitle);
		
	}
	
	public Page queryForPage(String tableCode, int pageSize, int pages) {
		
		String tableName = TableNameHandle.tableName(tableCode);
		String tableName1 = tableName.substring(0,1).toUpperCase() + tableName.substring(1);
		String colName = tableName + "code";
		String sql = null;
		if(tableCode.equals("0101")){
			sql = "from com.masi.hibernate." + tableName1 + " where " 
			+ colName + " >= '000000000000000000' and " + colName + " <= " + "'"+tableCode+"999999999999999999' order by "+tableName+"loadtime";
		}else{
			sql = "from com.masi.hibernate." + tableName1 + " where " 
			+ colName + " >= " + "'"+tableCode+"0000000000' and " + colName + " <= " + "'"+tableCode+"9999999999' order by "+tableName+"loadtime";
		}
		final String hql = sql;
		
		int allRow = manageDao.getAllRowCount(hql);
		int totalPage = Page.countTotalPage(pageSize, allRow);
		final int offset = Page.countOffset(pageSize, pages);
		final int length = pageSize;
		final int currentPage = Page.countCurrentPage(pages);	
		List<Object> list = manageDao.queryForPage(hql, offset, length);
		JSONArray json = JSONArray.fromObject(list);
		List<Manage> jsonList = new ArrayList<Manage>();
		
		for(int i = 0; i < json.size(); i++){
			JSONObject jsonObj = (JSONObject) json.get(i);
			Manage manage = new Manage();
			manage.setCode(jsonObj.getString(tableName+"code"));
			manage.setName(jsonObj.getString(tableName+"name"));
			if(tableName.equals("sy")){
				manage.setLoadtime(manage.getCode().substring(6,10)+"-"+manage.getCode().substring(10,12)+"-"+manage.getCode().substring(12,14));
			}else{
				manage.setLoadtime(manage.getCode().substring(4,8)+"-"+manage.getCode().substring(8,10)+"-"+manage.getCode().substring(10,12));
			}
			jsonList.add(manage);
			
		}
		
		Page page = new Page();
		page.setPageSize(pageSize);
		page.setCurrentPage(currentPage);
		page.setAllRow(allRow);
		page.setTotalPage(totalPage);
		page.setList(jsonList);
		page.init();
		return page;
	}

	public ManageDao getManageDao() {
		return manageDao;
	}

	public void setManageDao(ManageDao manageDao) {
		this.manageDao = manageDao;
	}
	
	
	
}
