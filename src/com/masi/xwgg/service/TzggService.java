package com.masi.xwgg.service;

import java.util.List;

import com.masi.hibernate.Xwgg;
import com.masi.util.Page;
import com.masi.xwgg.dao.TzggDao;

public class TzggService {
	private TzggDao tzggDao;

	public TzggDao getTzggDao() {
		return tzggDao;
	}

	public void setTzggDao(TzggDao tzggDao) {
		this.tzggDao = tzggDao;
	}
	public Page queryForPage(int pageSize, int pages , String attri) {
		final String hql = "from Xwgg xwgg where xwgg.xwggattri = '"+attri+"' order by xwgg.xwggloadtime DESC";
		int allRow = tzggDao.getAllRowCount(hql);
		int totalPage = Page.countTotalPage(pageSize, allRow);
		final int offset = Page.countOffset(pageSize, pages);
		final int length = pageSize;
		final int currentPage = Page.countCurrentPage(pages);	
		List<Xwgg> list = tzggDao.queryForPage(hql, offset, length);
		Page page = new Page();
		page.setPageSize(pageSize);
		page.setCurrentPage(currentPage);
		page.setAllRow(allRow);
		page.setTotalPage(totalPage);
		page.setList(list);
		page.init();
		return page;
	}
	
}
