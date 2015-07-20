package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Ckw
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Ckw
 * @author MyEclipse Persistence Tools
 */

public class CkwDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(CkwDAO.class);
	// property constants
	public static final String CBWCH = "cbwch";
	public static final String CBWLX = "cbwlx";
	public static final String CBS = "cbs";
	public static final String CBWMC = "cbwmc";
	public static final String ZZLB = "zzlb";

	protected void initDao() {
		// do nothing
	}

	public void save(Ckw transientInstance) {
		log.debug("saving Ckw instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ckw persistentInstance) {
		log.debug("deleting Ckw instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ckw findById(java.lang.String id) {
		log.debug("getting Ckw instance with id: " + id);
		try {
			Ckw instance = (Ckw) getHibernateTemplate().get(
					"com.masi.hibernate.Ckw", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ckw instance) {
		log.debug("finding Ckw instance by example");
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
		log.debug("finding Ckw instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ckw as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCbwch(Object cbwch) {
		return findByProperty(CBWCH, cbwch);
	}

	public List findByCbwlx(Object cbwlx) {
		return findByProperty(CBWLX, cbwlx);
	}

	public List findByCbs(Object cbs) {
		return findByProperty(CBS, cbs);
	}

	public List findByCbwmc(Object cbwmc) {
		return findByProperty(CBWMC, cbwmc);
	}

	public List findByZzlb(Object zzlb) {
		return findByProperty(ZZLB, zzlb);
	}

	public List findAll() {
		log.debug("finding all Ckw instances");
		try {
			String queryString = "from Ckw";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ckw merge(Ckw detachedInstance) {
		log.debug("merging Ckw instance");
		try {
			Ckw result = (Ckw) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ckw instance) {
		log.debug("attaching dirty Ckw instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ckw instance) {
		log.debug("attaching clean Ckw instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CkwDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CkwDAO) ctx.getBean("CkwDAO");
	}
}