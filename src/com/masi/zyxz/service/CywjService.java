package com.masi.zyxz.service;

import java.util.List;

import com.masi.hibernate.Xwgg;
import com.masi.hibernate.Zyxz;
import com.masi.util.Page;
import com.masi.zyxz.dao.CywjDao;

public class CywjService {
private CywjDao cywjDao;

public CywjDao getCywjDao() {
	return cywjDao;
}

public void setCywjDao(CywjDao cywjDao) {
	this.cywjDao = cywjDao;
}

public Page queryForPage(int pageSize, int pages , String attri) {
	final String hql = "from Zyxz zyxz where zyxz.zyxzattri = '"+attri+"' order by zyxz.zyxzloadtime DESC";
	int allRow = cywjDao.getAllRowCount(hql);
	int totalPage = Page.countTotalPage(pageSize, allRow);
	final int offset = Page.countOffset(pageSize, pages);
	final int length = pageSize;
	final int currentPage = Page.countCurrentPage(pages);	
	List<Zyxz> list = cywjDao.queryForPage(hql, offset, length);
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
