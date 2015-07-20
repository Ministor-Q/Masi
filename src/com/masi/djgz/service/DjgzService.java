package com.masi.djgz.service;

import java.util.List;

import com.masi.hibernate.Djgz;
import com.masi.djgz.dao.DjgzDao;
import com.masi.util.Page;

public class DjgzService {
private DjgzDao djgzDao;

public DjgzDao getdjgzDao() {
	return djgzDao;
}

public void setdjgzDao(DjgzDao djgzDao) {
	this.djgzDao = djgzDao;
}
public Page queryForPage(int pageSize, int pages , String attri) {
	final String hql = "from Djgz djgz where djgz.djgzattri = '"+attri+"' order by djgz.djgzloadtime DESC";
	int allRow = djgzDao.getAllRowCount(hql);
	int totalPage = Page.countTotalPage(pageSize, allRow);
	final int offset = Page.countOffset(pageSize, pages);
	final int length = pageSize;
	final int currentPage = Page.countCurrentPage(pages);	
	@SuppressWarnings("unchecked")
	List<Djgz> list = djgzDao.queryForPage(hql, offset, length);
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
