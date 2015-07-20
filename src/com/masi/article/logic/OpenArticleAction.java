package com.masi.article.logic;

import java.util.ArrayList;
import java.util.List;


import org.apache.struts2.ServletActionContext;
import org.jsoup.nodes.Document;


import com.masi.article.service.OpenArticleService;
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
import com.masi.util.DataSource;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OpenArticleAction extends ActionSupport{
	
	

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public String article;
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	private String code;
	private OpenArticleService openArticleService;
	//private String result;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public OpenArticleService getOpenArticleService() {
		return openArticleService;
	}
	public void setOpenArticleService(OpenArticleService openArticleService) {
		this.openArticleService = openArticleService;
	}
	
	@Override
	public String execute() throws Exception {
		List<Object> lo=new ArrayList<Object>();
		lo =openArticleService.getArticle(code);
		 String html =((Document)lo.get(1)).html();
		 article =html;
		 ActionContext.getContext().getSession().put("attri", new DataSource().getTitleByCode(lo.get(0).toString()));
		 ActionContext.getContext().getSession().put("article",article);
		 
		 /*HttpServletResponse resp =ServletActionContext.getResponse();
		 resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print(html);*/
		return lo.get(0).toString().substring(0,2);
	}
	
	

}
