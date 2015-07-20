package com.masi.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Bg
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Bg
 * @author MyEclipse Persistence Tools
 */

public class BgDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(BgDAO.class);
	// property constants
	public static final String JSID = "jsid";
	public static final String BGSID = "bgsid";
	public static final String BGJS = "bgjs";

	protected void initDao() {
		// do nothing
	}

	public void save(Bg transientInstance) {
		log.debug("saving Bg instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Bg persistentInstance) {
		log.debug("deleting Bg instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Bg findById(java.lang.String id) {
		log.debug("getting Bg instance with id: " + id);
		try {
			Bg instance = (Bg) getHibernateTemplate().get(
					"com.masi.hibernate.Bg", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Bg instance) {
		log.debug("finding Bg instance by example");
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
		log.debug("finding Bg instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Bg as model where model." + propertyName
					+ "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJsid(Object jsid) {
		return findByProperty(JSID, jsid);
	}

	public List findByBgsid(Object bgsid) {
		return findByProperty(BGSID, bgsid);
	}

	public List findByBgjs(Object bgjs) {
		return findByProperty(BGJS, bgjs);
	}

	public List findAll() {
		log.debug("finding all Bg instances");
		try {
			String queryString = "from Bg";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Bg merge(Bg detachedInstance) {
		log.debug("merging Bg instance");
		try {
			Bg result = (Bg) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Bg instance) {
		log.debug("attaching dirty Bg instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Bg instance) {
		log.debug("attaching clean Bg instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BgDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BgDAO) ctx.getBean("BgDAO");
	}
}