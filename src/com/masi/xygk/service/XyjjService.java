package com.masi.xygk.service;

import java.io.File;
import java.io.IOException;

import javax.persistence.Entity;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.masi.hibernate.Xygk;
import com.masi.util.Doc2Html;
import com.masi.xygk.dao.XyjjDao;

@Entity
public class XyjjService {
	private XyjjDao xyjjDao;
	
	public XyjjDao getXyjjDao() {
		return xyjjDao;
	}

	public void setXyjjDao(XyjjDao xyjjDao) {
		this.xyjjDao = xyjjDao;
	}

	public Document getXyjj(Xygk xygk) {
		xygk =xyjjDao.getXyjj(xygk);
		String path =xygk.getXygkaddrtemp();
		Document jsoup=null;
		try {
			jsoup = Jsoup.parse(new File(path),"UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jsoup.body().removeClass("b1");
		jsoup.body().removeClass("b2");
		jsoup.body().getElementsByClass("td1").removeAttr("width");
		
		
		return jsoup;
	}
	
	
	
}
