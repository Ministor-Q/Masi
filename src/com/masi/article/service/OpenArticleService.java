package com.masi.article.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.masi.article.dao.OpenArticleDao;
import com.masi.hibernate.Djgz;
import com.masi.hibernate.Jxgz;
import com.masi.hibernate.Kygz;
import com.masi.hibernate.Rcpy;
import com.masi.hibernate.Sy;
import com.masi.hibernate.Szdw;
import com.masi.hibernate.Xsgz;
import com.masi.hibernate.Xwgg;
import com.masi.hibernate.Xygk;
import com.masi.hibernate.Zyxz;

public class OpenArticleService {
	private OpenArticleDao openArticleDao;

	public Object getArticle(String code, String entity) {
		String sql = "From " + entity + " entity where entity."
				+ entity.toLowerCase() + "code=?";
		Object obj = openArticleDao.getEntity(code, sql);
		return obj;
	}

	/**
	 * 
	 * @author Ministor_X
	 * @param code
	 * @return
	 */
	public List<Object> getArticle(String code) {
		String path = "";
		String pathtemp = "";
		List<Object> lo = new ArrayList<Object>();
		if (code.substring(0, 2).equals("00")) {
			Sy sy = new Sy();
			sy.setSycode(code);
			pathtemp = ((Sy) getArticle(code, "Sy")).getSyaddrtemp();
			code = code.substring(2);
		} else if (code.substring(0, 2).equals("02")) {
			Xygk xygk = ((Xygk) getArticle(code, "Xygk"));
			xygk.setXygkcode(code);
			path = xygk.getXygkaddr();
			pathtemp = xygk.getXygkaddrtemp();
			xygk.setXygkreadednum(xygk.getXygkreadednum() + 1);
			openArticleDao.save(xygk);
		} else if (code.substring(0, 2).equals("03")) {
			Jxgz jxgz = ((Jxgz) getArticle(code, "Jxgz"));
			jxgz.setJxgzcode(code);
			path = jxgz.getJxgzaddr();
			pathtemp = jxgz.getJxgzaddrtemp();
			jxgz.setJxgzreadednum(jxgz.getJxgzreadednum() + 1);
			openArticleDao.save(jxgz);
		} else if (code.substring(0, 2).equals("04")) {
			Kygz kygz = ((Kygz) getArticle(code, "Kygz"));
			kygz.setKygzcode(code);
			path = ((Kygz) getArticle(code, "Kygz")).getKygzaddr();
			pathtemp = ((Kygz) getArticle(code, "Kygz")).getKygzaddrtemp();
			kygz.setKygzreadednum(kygz.getKygzreadednum() + 1);
			openArticleDao.save(kygz);
		} else if (code.substring(0, 2).equals("05")) {
			Rcpy rcpy = ((Rcpy) getArticle(code, "Rcpy"));
			rcpy.setRcpycode(code);
			path = ((Rcpy) getArticle(code, "Rcpy")).getRcpyaddr();
			pathtemp = ((Rcpy) getArticle(code, "Rcpy")).getRcpyaddrtemp();
			rcpy.setRcpyreadednum(rcpy.getRcpyreadednum() + 1);
			openArticleDao.save(rcpy);
		} else if (code.substring(0, 2).equals("06")) {
			Xsgz xsgz = ((Xsgz) getArticle(code, "Xsgz"));
			xsgz.setXsgzcode(code);
			path = ((Xsgz) getArticle(code, "Xsgz")).getXsgzaddr();
			pathtemp = ((Xsgz) getArticle(code, "Xsgz")).getXsgzaddrtemp();
			xsgz.setXsgzreadednum(xsgz.getXsgzreadednum() + 1);
			openArticleDao.save(xsgz);
		} else if (code.substring(0, 2).equals("07")) {
			Xwgg xwgg = ((Xwgg) getArticle(code, "Xwgg"));
			xwgg.setXwggcode(code);
			path = xwgg.getXwggaddr();
			pathtemp = xwgg.getXwggaddrtemp();
			xwgg.setXwggreadednum(xwgg.getXwggreadednum() + 1);
			openArticleDao.save(xwgg);
			/*
			 * try { new
			 * Doc2Html().convert2Html(((Xwgg)getArticle(code,"Xwgg")).
			 * getXwggaddr
			 * ()+"/"+((Xwgg)getArticle(code,"Xwgg")).getXwggname()+"."
			 * +((Xwgg)getArticle
			 * (code,"Xwgg")).getXwggtype(),((Xwgg)getArticle(code
			 * ,"Xwgg")).getXwggaddrtemp()); } catch (TransformerException e) {
			 * // TODO Auto-generated catch block e.printStackTrace(); } catch
			 * (IOException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } catch (ParserConfigurationException e) {
			 * // TODO Auto-generated catch block e.printStackTrace(); }
			 */
		} else if (code.substring(0, 2).equals("08")) {
			Djgz djgz = ((Djgz) getArticle(code, "Djgz"));
			djgz.setDjgzcode(code);
			path = ((Djgz) getArticle(code, "Djgz")).getDjgzaddr();
			pathtemp = ((Djgz) getArticle(code, "Djgz")).getDjgzaddrtemp();
			djgz.setDjgzreadednum(djgz.getDjgzreadednum() + 1);
			openArticleDao.save(djgz);
		} /*else if (code.substring(0, 2).equals("09")) {
			Szdw szdw = ((Szdw) getArticle(code, "Szdw"));
			szdw.setSzdwcode(code);
			path = ((Szdw) getArticle(code, "Szdw")).getSzdwaddr();
			pathtemp = ((Szdw) getArticle(code, "Szdw")).getSzdwaddrtemp();
			szdw.setSzdwreadednum(szdw.getSzdwreadednum() + 1);
			openArticleDao.save(szdw);
		} */else if (code.substring(0, 2).equals("10")) {
			Zyxz zyxz = new Zyxz();
			zyxz.setZyxzcode(code);
			path = ((Zyxz) getArticle(code, "Zyxz")).getZyxzaddr();
			pathtemp = ((Zyxz) getArticle(code, "Zyxz")).getZyxzaddrtemp();
		}
		try {
			Document jsoup = Jsoup.parse(new File(pathtemp), "UTF-8");
			jsoup.body().removeClass("b1");
			jsoup.body().removeClass("b2");
			jsoup.body().getElementsByClass("td1").removeAttr("width");
			lo.add(code.substring(0, 4));
			lo.add(jsoup);
			return lo;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public OpenArticleDao getOpenArticleDao() {
		return openArticleDao;
	}

	public void setOpenArticleDao(OpenArticleDao openArticleDao) {
		this.openArticleDao = openArticleDao;
	}
}
