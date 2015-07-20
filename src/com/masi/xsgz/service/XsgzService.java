package com.masi.xsgz.service;

import java.util.List;

import com.masi.hibernate.Xsgz;
import com.masi.xsgz.dao.XsgzDao;
import com.masi.util.Page;

public class XsgzService {
private XsgzDao xsgzDao;

public XsgzDao getxsgzDao() {
	return xsgzDao;
}

public void setxsgzDao(XsgzDao xsgzDao) {
	this.xsgzDao = xsgzDao;
}
public Page queryForPage(int pageSize, int pages , String attri) {
	final String hql = "from Xsgz xsgz where xsgz.xsgzattri = '"+attri+"' order by xsgz.xsgzloadtime DESC";
	int allRow = xsgzDao.getAllRowCount(hql);
	int totalPage = Page.countTotalPage(pageSize, allRow);
	final int offset = Page.countOffset(pageSize, pages);
	final int length = pageSize;
	final int currentPage = Page.countCurrentPage(pages);	
	@SuppressWarnings("unchecked")
	List<Xsgz> list = xsgzDao.queryForPage(hql, offset, length);
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
