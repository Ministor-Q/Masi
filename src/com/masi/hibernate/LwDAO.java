package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Lw
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Lw
 * @author MyEclipse Persistence Tools
 */

public class LwDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(LwDAO.class);
	// property constants
	public static final String LWTM = "lwtm";
	public static final String ZZLB = "zzlb";
	public static final String LWLX = "lwlx";
	public static final String LWQ = "lwq";
	public static final String LWJ = "lwj";
	public static final String LWFBKW = "lwfbkw";
	public static final String LWJSQK = "lwjsqk";
	public static final String SSRY = "ssry";

	protected void initDao() {
		// do nothing
	}

	public void save(Lw transientInstance) {
		log.debug("saving Lw instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Lw persistentInstance) {
		log.debug("deleting Lw instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Lw findById(java.lang.String id) {
		log.debug("getting Lw instance with id: " + id);
		try {
			Lw instance = (Lw) getHibernateTemplate().get(
					"com.masi.hibernate.Lw", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Lw instance) {
		log.debug("finding Lw instance by example");
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
		log.debug("finding Lw instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Lw as model where model." + propertyName
					+ "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLwtm(Object lwtm) {
		return findByProperty(LWTM, lwtm);
	}

	public List findByZzlb(Object zzlb) {
		return findByProperty(ZZLB, zzlb);
	}

	public List findByLwlx(Object lwlx) {
		return findByProperty(LWLX, lwlx);
	}

	public List findByLwq(Object lwq) {
		return findByProperty(LWQ, lwq);
	}

	public List findByLwj(Object lwj) {
		return findByProperty(LWJ, lwj);
	}

	public List findByLwfbkw(Object lwfbkw) {
		return findByProperty(LWFBKW, lwfbkw);
	}

	public List findByLwjsqk(Object lwjsqk) {
		return findByProperty(LWJSQK, lwjsqk);
	}

	public List findBySsry(Object ssry) {
		return findByProperty(SSRY, ssry);
	}

	public List findAll() {
		log.debug("finding all Lw instances");
		try {
			String queryString = "from Lw";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Lw merge(Lw detachedInstance) {
		log.debug("merging Lw instance");
		try {
			Lw result = (Lw) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Lw instance) {
		log.debug("attaching dirty Lw instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Lw instance) {
		log.debug("attaching clean Lw instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LwDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LwDAO) ctx.getBean("LwDAO");
	}
}