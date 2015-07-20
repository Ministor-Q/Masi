package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Xwgg
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Xwgg
 * @author MyEclipse Persistence Tools
 */

public class XwggDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(XwggDAO.class);
	// property constants
	public static final String XWGGNAME = "xwggname";
	public static final String XWGGTYPE = "xwggtype";
	public static final String XWGGATTRI = "xwggattri";
	public static final String XWGGADDR = "xwggaddr";
	public static final String XWGGADDRTEMP = "xwggaddrtemp";
	public static final String XWGGKEYWORD = "xwggkeyword";
	public static final String XWGGREADEDNUM = "xwggreadednum";
	public static final String XWGGPUBLISHER = "xwggpublisher";
	public static final String XWGGCODE = "xwggcode";

	protected void initDao() {
		// do nothing
	}

	public void save(Xwgg transientInstance) {
		log.debug("saving Xwgg instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xwgg persistentInstance) {
		log.debug("deleting Xwgg instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xwgg findById(java.lang.Integer id) {
		log.debug("getting Xwgg instance with id: " + id);
		try {
			Xwgg instance = (Xwgg) getHibernateTemplate().get(
					"com.masi.hibernate.Xwgg", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xwgg instance) {
		log.debug("finding Xwgg instance by example");
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
		log.debug("finding Xwgg instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Xwgg as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXwggname(Object xwggname) {
		return findByProperty(XWGGNAME, xwggname);
	}

	public List findByXwggtype(Object xwggtype) {
		return findByProperty(XWGGTYPE, xwggtype);
	}

	public List findByXwggattri(Object xwggattri) {
		return findByProperty(XWGGATTRI, xwggattri);
	}

	public List findByXwggaddr(Object xwggaddr) {
		return findByProperty(XWGGADDR, xwggaddr);
	}

	public List findByXwggaddrtemp(Object xwggaddrtemp) {
		return findByProperty(XWGGADDRTEMP, xwggaddrtemp);
	}

	public List findByXwggkeyword(Object xwggkeyword) {
		return findByProperty(XWGGKEYWORD, xwggkeyword);
	}

	public List findByXwggreadednum(Object xwggreadednum) {
		return findByProperty(XWGGREADEDNUM, xwggreadednum);
	}

	public List findByXwggpublisher(Object xwggpublisher) {
		return findByProperty(XWGGPUBLISHER, xwggpublisher);
	}

	public List findByXwggcode(Object xwggcode) {
		return findByProperty(XWGGCODE, xwggcode);
	}

	public List findAll() {
		log.debug("finding all Xwgg instances");
		try {
			String queryString = "from Xwgg";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xwgg merge(Xwgg detachedInstance) {
		log.debug("merging Xwgg instance");
		try {
			Xwgg result = (Xwgg) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xwgg instance) {
		log.debug("attaching dirty Xwgg instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xwgg instance) {
		log.debug("attaching clean Xwgg instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XwggDAO getFromApplicationContext(ApplicationContext ctx) {
		return (XwggDAO) ctx.getBean("XwggDAO");
	}
}