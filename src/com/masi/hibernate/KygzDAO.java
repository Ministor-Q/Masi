package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Kygz
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Kygz
 * @author MyEclipse Persistence Tools
 */

public class KygzDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(KygzDAO.class);
	// property constants
	public static final String KYGZNAME = "kygzname";
	public static final String KYGZTYPE = "kygztype";
	public static final String KYGZATTRI = "kygzattri";
	public static final String KYGZADDR = "kygzaddr";
	public static final String KYGZADDRTEMP = "kygzaddrtemp";
	public static final String KYGZKEYWORD = "kygzkeyword";
	public static final String KYGZREADEDNUM = "kygzreadednum";
	public static final String KYGZPUBLISHER = "kygzpublisher";
	public static final String KYGZCODE = "kygzcode";

	protected void initDao() {
		// do nothing
	}

	public void save(Kygz transientInstance) {
		log.debug("saving Kygz instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Kygz persistentInstance) {
		log.debug("deleting Kygz instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Kygz findById(java.lang.Integer id) {
		log.debug("getting Kygz instance with id: " + id);
		try {
			Kygz instance = (Kygz) getHibernateTemplate().get(
					"com.masi.hibernate.Kygz", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Kygz instance) {
		log.debug("finding Kygz instance by example");
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
		log.debug("finding Kygz instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Kygz as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByKygzname(Object kygzname) {
		return findByProperty(KYGZNAME, kygzname);
	}

	public List findByKygztype(Object kygztype) {
		return findByProperty(KYGZTYPE, kygztype);
	}

	public List findByKygzattri(Object kygzattri) {
		return findByProperty(KYGZATTRI, kygzattri);
	}

	public List findByKygzaddr(Object kygzaddr) {
		return findByProperty(KYGZADDR, kygzaddr);
	}

	public List findByKygzaddrtemp(Object kygzaddrtemp) {
		return findByProperty(KYGZADDRTEMP, kygzaddrtemp);
	}

	public List findByKygzkeyword(Object kygzkeyword) {
		return findByProperty(KYGZKEYWORD, kygzkeyword);
	}

	public List findByKygzreadednum(Object kygzreadednum) {
		return findByProperty(KYGZREADEDNUM, kygzreadednum);
	}

	public List findByKygzpublisher(Object kygzpublisher) {
		return findByProperty(KYGZPUBLISHER, kygzpublisher);
	}

	public List findByKygzcode(Object kygzcode) {
		return findByProperty(KYGZCODE, kygzcode);
	}

	public List findAll() {
		log.debug("finding all Kygz instances");
		try {
			String queryString = "from Kygz";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Kygz merge(Kygz detachedInstance) {
		log.debug("merging Kygz instance");
		try {
			Kygz result = (Kygz) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Kygz instance) {
		log.debug("attaching dirty Kygz instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Kygz instance) {
		log.debug("attaching clean Kygz instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KygzDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KygzDAO) ctx.getBean("KygzDAO");
	}
}