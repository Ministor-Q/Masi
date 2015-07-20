package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Xygk
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Xygk
 * @author MyEclipse Persistence Tools
 */

public class XygkDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(XygkDAO.class);
	// property constants
	public static final String XYGKNAME = "xygkname";
	public static final String XYGKTYPE = "xygktype";
	public static final String XYGKATTRI = "xygkattri";
	public static final String XYGKADDR = "xygkaddr";
	public static final String XYGKADDRTEMP = "xygkaddrtemp";
	public static final String XYGKREADEDNUM = "xygkreadednum";
	public static final String XYGKPUBLISHER = "xygkpublisher";
	public static final String XYGKCODE = "xygkcode";

	protected void initDao() {
		// do nothing
	}

	public void save(Xygk transientInstance) {
		log.debug("saving Xygk instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xygk persistentInstance) {
		log.debug("deleting Xygk instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xygk findById(java.lang.Integer id) {
		log.debug("getting Xygk instance with id: " + id);
		try {
			Xygk instance = (Xygk) getHibernateTemplate().get(
					"com.masi.hibernate.Xygk", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xygk instance) {
		log.debug("finding Xygk instance by example");
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
		log.debug("finding Xygk instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Xygk as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXygkname(Object xygkname) {
		return findByProperty(XYGKNAME, xygkname);
	}

	public List findByXygktype(Object xygktype) {
		return findByProperty(XYGKTYPE, xygktype);
	}

	public List findByXygkattri(Object xygkattri) {
		return findByProperty(XYGKATTRI, xygkattri);
	}

	public List findByXygkaddr(Object xygkaddr) {
		return findByProperty(XYGKADDR, xygkaddr);
	}

	public List findByXygkaddrtemp(Object xygkaddrtemp) {
		return findByProperty(XYGKADDRTEMP, xygkaddrtemp);
	}

	public List findByXygkreadednum(Object xygkreadednum) {
		return findByProperty(XYGKREADEDNUM, xygkreadednum);
	}

	public List findByXygkpublisher(Object xygkpublisher) {
		return findByProperty(XYGKPUBLISHER, xygkpublisher);
	}

	public List findByXygkcode(Object xygkcode) {
		return findByProperty(XYGKCODE, xygkcode);
	}

	public List findAll() {
		log.debug("finding all Xygk instances");
		try {
			String queryString = "from Xygk";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xygk merge(Xygk detachedInstance) {
		log.debug("merging Xygk instance");
		try {
			Xygk result = (Xygk) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xygk instance) {
		log.debug("attaching dirty Xygk instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xygk instance) {
		log.debug("attaching clean Xygk instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static XygkDAO getFromApplicationContext(ApplicationContext ctx) {
		return (XygkDAO) ctx.getBean("XygkDAO");
	}
}