package com.masi.xygk.logic;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.jsoup.nodes.Document;

import com.masi.hibernate.Xygk;
import com.masi.xygk.service.XyjjService;
import com.opensymphony.xwork2.ActionSupport;

@Entity
public class XyjjLogic  extends ActionSupport{
	/**
	 * 
	 */
	private String result;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	private static final long serialVersionUID = 1L;
	private XyjjService xyjjService;
	
	public XyjjService getXyjjService() {
		return xyjjService;
	}
	public void setXyjjService(XyjjService xyjjService) {
		this.xyjjService = xyjjService;
	}

	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpSession session =ServletActionContext.getRequest().getSession();
		response.setCharacterEncoding("UTF-8");
		Xygk xygk =new Xygk();
		xygk.setXygkname("学院简介");
		//String path="E://masi/html/学院简介.html";
		//String path = new xyjjService().getXyjjArticle();
		//String content = new ParseHtml().parseHtml(path);
		
		//System.out.println(content);
		//org.w3c.dom.Document docx = org.w3c.dom.Document.
		//System.out.println(docx.getRootElement().element("head").element("title").getText());
		//System.out.println(	Jsoup.parse(content).body());
		//System.out.println(Jsoup.parse(content).body().cssSelector());
		//System.out.println(Jsoup.parse(content).head().cssSelector());
		//System.out.println(Jsoup.parse(content).body().getElementsByClass("s1"));
		//Elements element=Jsoup.parse(content).body().getElementsByClass("s1");
		Document jsoup = xyjjService.getXyjj(xygk);
		String title = jsoup.title();
		//System.out.println(jsoup.getElementsByClass("p1"));
		System.out.println(jsoup.html());
		System.out.println(jsoup.body().getElementsByClass("p2"));
		jsoup.body().getElementsByClass("td1").removeAttr("width");
		System.out.println(jsoup.html());
		//session.setAttribute("XyjjTitle", title);
		session.setAttribute("XyjjArticle",jsoup.html());
		session.setAttribute("attri", "学院简介");
		result = jsoup.html();
    	//PrintWriter out =response.getWriter();
    	//out.print(title+";;");
    	//out.flush();
    	//out.close();
		//response.sendRedirect("/jsp/xygk/xyjj.jsp");
		return "xyjj";
	}
}
