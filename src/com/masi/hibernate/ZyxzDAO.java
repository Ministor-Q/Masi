package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Zyxz
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Zyxz
 * @author MyEclipse Persistence Tools
 */

public class ZyxzDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(ZyxzDAO.class);
	// property constants
	public static final String ZYXZNAME = "zyxzname";
	public static final String ZYXZTYPE = "zyxztype";
	public static final String ZYXZATTRI = "zyxzattri";
	public static final String ZYXZADDR = "zyxzaddr";
	public static final String ZYXZADDRTEMP = "zyxzaddrtemp";
	public static final String ZYXZKEYWORD = "zyxzkeyword";
	public static final String ZYXZREADEDNUM = "zyxzreadednum";
	public static final String ZYXZPUBLISHER = "zyxzpublisher";
	public static final String ZYXZCODE = "zyxzcode";

	protected void initDao() {
		// do nothing
	}

	public void save(Zyxz transientInstance) {
		log.debug("saving Zyxz instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Zyxz persistentInstance) {
		log.debug("deleting Zyxz instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Zyxz findById(java.lang.Integer id) {
		log.debug("getting Zyxz instance with id: " + id);
		try {
			Zyxz instance = (Zyxz) getHibernateTemplate().get(
					"com.masi.hibernate.Zyxz", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Zyxz instance) {
		log.debug("finding Zyxz instance by example");
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
		log.debug("finding Zyxz instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Zyxz as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByZyxzname(Object zyxzname) {
		return findByProperty(ZYXZNAME, zyxzname);
	}

	public List findByZyxztype(Object zyxztype) {
		return findByProperty(ZYXZTYPE, zyxztype);
	}

	public List findByZyxzattri(Object zyxzattri) {
		return findByProperty(ZYXZATTRI, zyxzattri);
	}

	public List findByZyxzaddr(Object zyxzaddr) {
		return findByProperty(ZYXZADDR, zyxzaddr);
	}

	public List findByZyxzaddrtemp(Object zyxzaddrtemp) {
		return findByProperty(ZYXZADDRTEMP, zyxzaddrtemp);
	}

	public List findByZyxzkeyword(Object zyxzkeyword) {
		return findByProperty(ZYXZKEYWORD, zyxzkeyword);
	}

	public List findByZyxzreadednum(Object zyxzreadednum) {
		return findByProperty(ZYXZREADEDNUM, zyxzreadednum);
	}

	public List findByZyxzpublisher(Object zyxzpublisher) {
		return findByProperty(ZYXZPUBLISHER, zyxzpublisher);
	}

	public List findByZyxzcode(Object zyxzcode) {
		return findByProperty(ZYXZCODE, zyxzcode);
	}

	public List findAll() {
		log.debug("finding all Zyxz instances");
		try {
			String queryString = "from Zyxz";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Zyxz merge(Zyxz detachedInstance) {
		log.debug("merging Zyxz instance");
		try {
			Zyxz result = (Zyxz) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Zyxz instance) {
		log.debug("attaching dirty Zyxz instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Zyxz instance) {
		log.debug("attaching clean Zyxz instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ZyxzDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ZyxzDAO) ctx.getBean("ZyxzDAO");
	}
}