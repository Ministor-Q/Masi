package com.masi.szdw.service;

import java.util.List;

import com.masi.hibernate.Szdw;
import com.masi.szdw.dao.SzdwDao;
import com.masi.util.GetPicBase64ByPath;
import com.masi.util.Page;

public class SzdwService {
private SzdwDao szdwDao;

public SzdwDao getszdwDao() {
	return szdwDao;
}

public void setszdwDao(SzdwDao szdwDao) {
	this.szdwDao = szdwDao;
}
public Page queryForPage(int pageSize, int pages , String attri) {
	final String hql = "from Szdw szdw where szdw.szdwattri = '"+attri+"' order by szdw.szdwloadtime DESC";
	int allRow = szdwDao.getAllRowCount(hql);
	int totalPage = Page.countTotalPage(pageSize, allRow);
	final int offset = Page.countOffset(pageSize, pages);
	final int length = pageSize;
	final int currentPage = Page.countCurrentPage(pages);	
	@SuppressWarnings("unchecked")
	List<Szdw> list = szdwDao.queryForPage(hql, offset, length);
	Page page = new Page();
	page.setPageSize(pageSize);
	page.setCurrentPage(currentPage);
	page.setAllRow(allRow);
	page.setTotalPage(totalPage);
	page.setList(list);
	page.init();
	return page;
}

public List<Szdw> getAllListByAttri(String attri) {
	String sql ="from Szdw szdw where szdw.szdwattri =? order by szdw.szdwloadtime desc ";
	List<Szdw> ls = szdwDao.getAllListByAttri(attri,sql);
	/*for(int i=0;i<ls.size();i++){
		String szdwPicPath = ls.get(i).getSzdwpicaddr();
		 ls.get(i).setSzdwcode("data:image/png;base64,"+new GetPicBase64ByPath().getPicBase64(szdwPicPath));
	}*/
	return ls;
}
}
