package com.masi.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Jscb
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Jscb
 * @author MyEclipse Persistence Tools
 */

public class JscbDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(JscbDAO.class);
	// property constants
	public static final String JSID = "jsid";
	public static final String CBWID = "cbwid";
	public static final String PM = "pm";

	protected void initDao() {
		// do nothing
	}

	public void save(Jscb transientInstance) {
		log.debug("saving Jscb instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Jscb persistentInstance) {
		log.debug("deleting Jscb instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Jscb findById(java.lang.String id) {
		log.debug("getting Jscb instance with id: " + id);
		try {
			Jscb instance = (Jscb) getHibernateTemplate().get(
					"com.masi.hibernate.Jscb", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Jscb instance) {
		log.debug("finding Jscb instance by example");
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
		log.debug("finding Jscb instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Jscb as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJsid(Object jsid) {
		return findByProperty(JSID, jsid);
	}

	public List findByCbwid(Object cbwid) {
		return findByProperty(CBWID, cbwid);
	}

	public List findByPm(Object pm) {
		return findByProperty(PM, pm);
	}

	public List findAll() {
		log.debug("finding all Jscb instances");
		try {
			String queryString = "from Jscb";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Jscb merge(Jscb detachedInstance) {
		log.debug("merging Jscb instance");
		try {
			Jscb result = (Jscb) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Jscb instance) {
		log.debug("attaching dirty Jscb instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Jscb instance) {
		log.debug("attaching clean Jscb instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static JscbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (JscbDAO) ctx.getBean("JscbDAO");
	}
}