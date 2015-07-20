package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Jx
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Jx
 * @author MyEclipse Persistence Tools
 */

public class JxDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(JxDAO.class);
	// property constants
	public static final String JSMC = "jsmc";
	public static final String BFJG = "bfjg";
	public static final String HJDJ = "hjdj";
	public static final String HJDM = "hjdm";
	public static final String CMLB = "cmlb";
	public static final String SSRY = "ssry";

	protected void initDao() {
		// do nothing
	}

	public void save(Jx transientInstance) {
		log.debug("saving Jx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Jx persistentInstance) {
		log.debug("deleting Jx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Jx findById(java.lang.String id) {
		log.debug("getting Jx instance with id: " + id);
		try {
			Jx instance = (Jx) getHibernateTemplate().get(
					"com.masi.hibernate.Jx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Jx instance) {
		log.debug("finding Jx instance by example");
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
		log.debug("finding Jx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Jx as model where model." + propertyName
					+ "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJsmc(Object jsmc) {
		return findByProperty(JSMC, jsmc);
	}

	public List findByBfjg(Object bfjg) {
		return findByProperty(BFJG, bfjg);
	}

	public List findByHjdj(Object hjdj) {
		return findByProperty(HJDJ, hjdj);
	}

	public List findByHjdm(Object hjdm) {
		return findByProperty(HJDM, hjdm);
	}

	public List findByCmlb(Object cmlb) {
		return findByProperty(CMLB, cmlb);
	}

	public List findBySsry(Object ssry) {
		return findByProperty(SSRY, ssry);
	}

	public List findAll() {
		log.debug("finding all Jx instances");
		try {
			String queryString = "from Jx";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Jx merge(Jx detachedInstance) {
		log.debug("merging Jx instance");
		try {
			Jx result = (Jx) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Jx instance) {
		log.debug("attaching dirty Jx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Jx instance) {
		log.debug("attaching clean Jx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static JxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (JxDAO) ctx.getBean("JxDAO");
	}
}