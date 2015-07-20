package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Djgz
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Djgz
 * @author MyEclipse Persistence Tools
 */

public class DjgzDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DjgzDAO.class);
	// property constants
	public static final String DJGZNAME = "djgzname";
	public static final String DJGZTYPE = "djgztype";
	public static final String DJGZATTRI = "djgzattri";
	public static final String DJGZADDR = "djgzaddr";
	public static final String DJGZADDRTEMP = "djgzaddrtemp";
	public static final String DJGZKEYWORD = "djgzkeyword";
	public static final String DJGZREADEDNUM = "djgzreadednum";
	public static final String DJGZPUBLISHER = "djgzpublisher";
	public static final String DJGZCODE = "djgzcode";

	protected void initDao() {
		// do nothing
	}

	public void save(Djgz transientInstance) {
		log.debug("saving Djgz instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Djgz persistentInstance) {
		log.debug("deleting Djgz instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Djgz findById(java.lang.Integer id) {
		log.debug("getting Djgz instance with id: " + id);
		try {
			Djgz instance = (Djgz) getHibernateTemplate().get(
					"com.masi.hibernate.Djgz", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Djgz instance) {
		log.debug("finding Djgz instance by example");
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
		log.debug("finding Djgz instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Djgz as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDjgzname(Object djgzname) {
		return findByProperty(DJGZNAME, djgzname);
	}

	public List findByDjgztype(Object djgztype) {
		return findByProperty(DJGZTYPE, djgztype);
	}

	public List findByDjgzattri(Object djgzattri) {
		return findByProperty(DJGZATTRI, djgzattri);
	}

	public List findByDjgzaddr(Object djgzaddr) {
		return findByProperty(DJGZADDR, djgzaddr);
	}

	public List findByDjgzaddrtemp(Object djgzaddrtemp) {
		return findByProperty(DJGZADDRTEMP, djgzaddrtemp);
	}

	public List findByDjgzkeyword(Object djgzkeyword) {
		return findByProperty(DJGZKEYWORD, djgzkeyword);
	}

	public List findByDjgzreadednum(Object djgzreadednum) {
		return findByProperty(DJGZREADEDNUM, djgzreadednum);
	}

	public List findByDjgzpublisher(Object djgzpublisher) {
		return findByProperty(DJGZPUBLISHER, djgzpublisher);
	}

	public List findByDjgzcode(Object djgzcode) {
		return findByProperty(DJGZCODE, djgzcode);
	}

	public List findAll() {
		log.debug("finding all Djgz instances");
		try {
			String queryString = "from Djgz";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Djgz merge(Djgz detachedInstance) {
		log.debug("merging Djgz instance");
		try {
			Djgz result = (Djgz) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Djgz instance) {
		log.debug("attaching dirty Djgz instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Djgz instance) {
		log.debug("attaching clean Djgz instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DjgzDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DjgzDAO) ctx.getBean("DjgzDAO");
	}
}