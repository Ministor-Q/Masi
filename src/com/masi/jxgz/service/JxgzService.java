package com.masi.jxgz.service;

import java.util.List;

import com.masi.hibernate.Jxgz;
import com.masi.jxgz.dao.JxgzDao;
import com.masi.util.Page;

public class JxgzService {
private JxgzDao jxgzDao;

public JxgzDao getJxgzDao() {
	return jxgzDao;
}

public void setJxgzDao(JxgzDao jxgzDao) {
	this.jxgzDao = jxgzDao;
}
public Page queryForPage(int pageSize, int pages , String attri) {
	final String hql = "from Jxgz jxgz where jxgz.jxgzattri = '"+attri+"' order by jxgz.jxgzloadtime DESC ";
	int allRow = jxgzDao.getAllRowCount(hql);
	int totalPage = Page.countTotalPage(pageSize, allRow);
	final int offset = Page.countOffset(pageSize, pages);
	final int length = pageSize;
	final int currentPage = Page.countCurrentPage(pages);	
	@SuppressWarnings("unchecked")
	List<Jxgz> list = jxgzDao.queryForPage(hql, offset, length);
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
