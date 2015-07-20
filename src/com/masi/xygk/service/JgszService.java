package com.masi.xygk.service;

import java.io.File;
import java.io.IOException;

import javax.persistence.Entity;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.masi.hibernate.Norfile;
import com.masi.hibernate.Xygk;
import com.masi.util.Doc2Html;
import com.masi.xygk.dao.JgszDao;

@Entity
public class JgszService {

	private JgszDao jgszDao;
	
	public JgszDao getJgszDao() {
		return jgszDao;
	}

	public void setJgszDao(JgszDao jgszDao) {
		this.jgszDao = jgszDao;
	}
	public Document getXyjj(Xygk xygk) {
		xygk =jgszDao.getXyjj(xygk);
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
	/*public String getJgszArticle(Norfile file) {
		file =jgszDao.getJgszArticle(file);
		String path ="E://masi/html/机构设置.html";
		try {
			new Doc2Html().convert2Html(file.getFileaddr()+"/"+file.getFilename()+"."+file.getFiletype(),path );
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
	}		*/
}
