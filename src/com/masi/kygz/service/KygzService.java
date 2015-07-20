package com.masi.kygz.service;

import java.util.List;

import com.masi.hibernate.Jxgz;
import com.masi.hibernate.Kygz;
import com.masi.kygz.dao.KygzDao;
import com.masi.util.Page;

public class KygzService {
	private KygzDao kygzDao;

	public KygzDao getKygzDao() {
		return kygzDao;
	}

	public void setKygzDao(KygzDao kygzDao) {
		this.kygzDao = kygzDao;
	}

	public Page queryForPage(int pageSize, int pages , String attri) {
		final String hql = "from Kygz kygz where kygz.kygzattri = '"+attri+"' order by kygz.kygzloadtime DESC";
		int allRow = kygzDao.getAllRowCount(hql);
		int totalPage = Page.countTotalPage(pageSize, allRow);
		final int offset = Page.countOffset(pageSize, pages);
		final int length = pageSize;
		final int currentPage = Page.countCurrentPage(pages);	
		@SuppressWarnings("unchecked")
		List<Kygz> list = kygzDao.queryForPage(hql, offset, length);
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
