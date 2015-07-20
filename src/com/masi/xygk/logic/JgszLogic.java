package com.masi.xygk.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.masi.hibernate.Norfile;
import com.masi.hibernate.Xygk;
import com.masi.util.ParseHtml;
import com.masi.xygk.service.JgszService;
import com.opensymphony.xwork2.ActionSupport;

@Entity
public class JgszLogic  extends ActionSupport{
	private JgszService jgszService;
	private String result;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public JgszService getJgszService() {
		return jgszService;
	}
	public void setJgszService(JgszService jgszService) {
		this.jgszService = jgszService;
	}



	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpSession session =ServletActionContext.getRequest().getSession();
		response.setCharacterEncoding("UTF-8");
		Xygk xygk =new Xygk();
		xygk.setXygkname("机构设置");
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
		Document jsoup = jgszService.getXyjj(xygk);
		String title = jsoup.title();
		//System.out.println(jsoup.getElementsByClass("p1"));
		System.out.println(jsoup.html());
		jsoup.body().getElementsByClass("td1").removeAttr("width");
		System.out.println(jsoup.body().cssSelector());
		//session.setAttribute("XyjjTitle", title);
		session.setAttribute("JgszArticle",jsoup.html());
		session.setAttribute("attri", "机构设置");
		result = jsoup.html();
    	//PrintWriter out =response.getWriter();
    	//out.print(title+";;");
    	//out.flush();
    	//out.close();
		//response.sendRedirect("/jsp/xygk/xyjj.jsp");
		return "jgsz";
	}
}
