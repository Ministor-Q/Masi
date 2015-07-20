package com.masi.test;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class Test  extends HibernateDaoSupport{
	/*private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public void test(){
		System.out.println(""+hibernateTemplate);
		this.hibernateTemplate.find("from bg");
		System.out.println("11");

	}*/
	@org.junit.Test
	public void test(){
		System.out.println(Integer.parseInt("01"));

	}
	
	
}
