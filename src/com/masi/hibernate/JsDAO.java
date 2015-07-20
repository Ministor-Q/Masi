package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Js
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Js
 * @author MyEclipse Persistence Tools
 */

public class JsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(JsDAO.class);
	// property constants
	public static final String JSXM = "jsxm";
	public static final String JSXB = "jsxb";
	public static final String JSZC = "jszc";
	public static final String JSJG = "jsjg";
	public static final String BYYX = "byyx";
	public static final String JSXW = "jsxw";
	public static final String ZPLJ = "zplj";
	public static final String TYPE = "type";

	protected void initDao() {
		// do nothing
	}

	public void save(Js transientInstance) {
		log.debug("saving Js instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Js persistentInstance) {
		log.debug("deleting Js instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Js findById(java.lang.String id) {
		log.debug("getting Js instance with id: " + id);
		try {
			Js instance = (Js) getHibernateTemplate().get(
					"com.masi.hibernate.Js", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Js instance) {
		log.debug("finding Js instance by example");
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
		log.debug("finding Js instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Js as model where model." + propertyName
					+ "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJsxm(Object jsxm) {
		return findByProperty(JSXM, jsxm);
	}

	public List findByJsxb(Object jsxb) {
		return findByProperty(JSXB, jsxb);
	}

	public List findByJszc(Object jszc) {
		return findByProperty(JSZC, jszc);
	}

	public List findByJsjg(Object jsjg) {
		return findByProperty(JSJG, jsjg);
	}

	public List findByByyx(Object byyx) {
		return findByProperty(BYYX, byyx);
	}

	public List findByJsxw(Object jsxw) {
		return findByProperty(JSXW, jsxw);
	}

	public List findByZplj(Object zplj) {
		return findByProperty(ZPLJ, zplj);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findAll() {
		log.debug("finding all Js instances");
		try {
			String queryString = "from Js";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Js merge(Js detachedInstance) {
		log.debug("merging Js instance");
		try {
			Js result = (Js) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Js instance) {
		log.debug("attaching dirty Js instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Js instance) {
		log.debug("attaching clean Js instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static JsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (JsDAO) ctx.getBean("JsDAO");
	}
}