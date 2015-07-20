package com.masi.rcpy.service;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import com.masi.hibernate.Rcpy;
import com.masi.rcpy.dao.BkspyDao;
import com.masi.util.Doc2Html;
import com.masi.util.Page;

public class BkspyService {
	private BkspyDao bkspyDao;

	public BkspyDao getBkspyDao() {
		return bkspyDao;
	}

	public void setBkspyDao(BkspyDao bkspyDao) {
		this.bkspyDao = bkspyDao;
	}

	public Page queryForPage(int pageSize, int pages , String attri) {
		final String hql = "from Rcpy rcpy where rcpy.rcpyattri = '"+attri+"' order by rcpy.rcpyloadtime DESC";
		int allRow = bkspyDao.getAllRowCount(hql);
		int totalPage = Page.countTotalPage(pageSize, allRow);
		final int offset = Page.countOffset(pageSize, pages);
		final int length = pageSize;
		final int currentPage = Page.countCurrentPage(pages);	
		@SuppressWarnings("unchecked")
		List<Rcpy> list = bkspyDao.queryForPage(hql, offset, length);
		Page page = new Page();
		page.setPageSize(pageSize);
		page.setCurrentPage(currentPage);
		page.setAllRow(allRow);
		page.setTotalPage(totalPage);
		page.setList(list);
		page.init();
		return page;
	}
	
	
	
	
	/*public String getBkspy(Rcpy file) {
		file= bkspyDao.getBkspy(file);
		String path =file.getRcpyaddrtemp();
		try {
			new Doc2Html().convert2Html(file.getRcpyaddr()+"/"+file.getRcpyname()+"."+file.getRcpytype(),path);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		return path;
	}*/
	
	
	
	
}
