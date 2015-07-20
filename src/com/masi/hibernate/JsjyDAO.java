package com.masi.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Jsjy
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Jsjy
 * @author MyEclipse Persistence Tools
 */

public class JsjyDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(JsjyDAO.class);
	// property constants
	public static final String JSID = "jsid";
	public static final String JYSID = "jysid";
	public static final String JSJS = "jsjs";

	protected void initDao() {
		// do nothing
	}

	public void save(Jsjy transientInstance) {
		log.debug("saving Jsjy instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Jsjy persistentInstance) {
		log.debug("deleting Jsjy instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Jsjy findById(java.lang.String id) {
		log.debug("getting Jsjy instance with id: " + id);
		try {
			Jsjy instance = (Jsjy) getHibernateTemplate().get(
					"com.masi.hibernate.Jsjy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Jsjy instance) {
		log.debug("finding Jsjy instance by example");
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
		log.debug("finding Jsjy instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Jsjy as model where model."
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

	public List findByJysid(Object jysid) {
		return findByProperty(JYSID, jysid);
	}

	public List findByJsjs(Object jsjs) {
		return findByProperty(JSJS, jsjs);
	}

	public List findAll() {
		log.debug("finding all Jsjy instances");
		try {
			String queryString = "from Jsjy";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Jsjy merge(Jsjy detachedInstance) {
		log.debug("merging Jsjy instance");
		try {
			Jsjy result = (Jsjy) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Jsjy instance) {
		log.debug("attaching dirty Jsjy instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Jsjy instance) {
		log.debug("attaching clean Jsjy instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static JsjyDAO getFromApplicationContext(ApplicationContext ctx) {
		return (JsjyDAO) ctx.getBean("JsjyDAO");
	}
}