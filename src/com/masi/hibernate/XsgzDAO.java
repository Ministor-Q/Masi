package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Xsgz
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Xsgz
 * @author MyEclipse Persistence Tools
 */

public class XsgzDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(XsgzDAO.class);
	// property constants
	public static final String XSGZNAME = "xsgzname";
	public static final String XSGZTYPE = "xsgztype";
	public static final String XSGZATTRI = "xsgzattri";
	public static final String XSGZADDR = "xsgzaddr";
	public static final String XSGZADDRTEMP = "xsgzaddrtemp";
	public static final String XSGZKEYWORD = "xsgzkeyword";
	public static final String XSGZREADEDNUM = "xsgzreadednum";
	public static final String XSGZPUBLISHER = "xsgzpublisher";
	public static final String XSGZCODE = "xsgzcode";

	protected void initDao() {
		// do nothing
	}

	public void save(Xsgz transientInstance) {
		log.debug("saving Xsgz instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xsgz persistentInstance) {
		log.debug("deleting Xsgz instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xsgz findById(java.lang.Integer id) {
		log.debug("getting Xsgz instance with id: " + id);
		try {
			Xsgz instance = (Xsgz) getHibernateTemplate().get(
					"com.masi.hibernate.Xsgz", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xsgz instance) {
		log.debug("finding Xsgz instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Xsgz instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Xsgz as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXsgzname(Object xsgzname) {
		return findByProperty(XSGZNAME, xsgzname);
	}

	public List findByXsgztype(Object xsgztype) {
		return findByProperty(XSGZTYPE, xsgztype);
	}

	public List findByXsgzattri(Object xsgzattri) {
		return findByProperty(XSGZATTRI, xsgzattri);
	}

	public List findByXsgzaddr(Object xsgzaddr) {
		return findByProperty(XSGZADDR, xsgzaddr);
	}

	public List findByXsgzaddrtemp(Object xsgzaddrtemp) {
		return findByProperty(XSGZADDRTEMP, xsgzaddrtemp);
	}

	public List findByXsgzkeyword(Object xsgzkeyword) {
		return findByProperty(XSGZKEYWORD, xsgzkeyword);
	}

	public List findByXsgzreadednum(Object xsgzreadednum) {
		return findByProperty(XSGZREADEDNUM, xsgzreadednum);
	}

	public List findByXsgzpublisher(Object xsgzpublisher) {
		return findByProperty(XSGZPUBLISHER, xsgzpublisher);
	}

	public List findByXsgzcode(Object xsgzcode) {
		return findByProperty(XSGZCODE, xsgzcode);
	}

	public List findAll() {
		log.debug("finding all Xsgz instances");
		try {
			String queryString = "from Xsgz";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xsgz merge(Xsgz detachedInstance) {
		log.debug("merging Xsgz instance");
		try {
			Xsgz result = (Xsgz) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xsgz instance) {
		log.debug("attaching dirty Xsgz instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xsgz instance) {
		log.debug("attaching clean Xsgz instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XsgzDAO getFromApplicationContext(ApplicationContext ctx) {
		return (XsgzDAO) ctx.getBean("XsgzDAO");
	}
}