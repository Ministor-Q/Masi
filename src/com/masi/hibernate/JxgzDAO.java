package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Jxgz
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Jxgz
 * @author MyEclipse Persistence Tools
 */

public class JxgzDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(JxgzDAO.class);
	// property constants
	public static final String JXGZNAME = "jxgzname";
	public static final String JXGZTYPE = "jxgztype";
	public static final String JXGZATTRI = "jxgzattri";
	public static final String JXGZADDR = "jxgzaddr";
	public static final String JXGZADDRTEMP = "jxgzaddrtemp";
	public static final String JXGZKEYWORD = "jxgzkeyword";
	public static final String JXGZREADEDNUM = "jxgzreadednum";
	public static final String JXGZPUBLISHER = "jxgzpublisher";
	public static final String JXGZCODE = "jxgzcode";

	protected void initDao() {
		// do nothing
	}

	public void save(Jxgz transientInstance) {
		log.debug("saving Jxgz instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Jxgz persistentInstance) {
		log.debug("deleting Jxgz instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Jxgz findById(java.lang.Integer id) {
		log.debug("getting Jxgz instance with id: " + id);
		try {
			Jxgz instance = (Jxgz) getHibernateTemplate().get(
					"com.masi.hibernate.Jxgz", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Jxgz instance) {
		log.debug("finding Jxgz instance by example");
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
		log.debug("finding Jxgz instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Jxgz as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByJxgzname(Object jxgzname) {
		return findByProperty(JXGZNAME, jxgzname);
	}

	public List findByJxgztype(Object jxgztype) {
		return findByProperty(JXGZTYPE, jxgztype);
	}

	public List findByJxgzattri(Object jxgzattri) {
		return findByProperty(JXGZATTRI, jxgzattri);
	}

	public List findByJxgzaddr(Object jxgzaddr) {
		return findByProperty(JXGZADDR, jxgzaddr);
	}

	public List findByJxgzaddrtemp(Object jxgzaddrtemp) {
		return findByProperty(JXGZADDRTEMP, jxgzaddrtemp);
	}

	public List findByJxgzkeyword(Object jxgzkeyword) {
		return findByProperty(JXGZKEYWORD, jxgzkeyword);
	}

	public List findByJxgzreadednum(Object jxgzreadednum) {
		return findByProperty(JXGZREADEDNUM, jxgzreadednum);
	}

	public List findByJxgzpublisher(Object jxgzpublisher) {
		return findByProperty(JXGZPUBLISHER, jxgzpublisher);
	}

	public List findByJxgzcode(Object jxgzcode) {
		return findByProperty(JXGZCODE, jxgzcode);
	}

	public List findAll() {
		log.debug("finding all Jxgz instances");
		try {
			String queryString = "from Jxgz";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Jxgz merge(Jxgz detachedInstance) {
		log.debug("merging Jxgz instance");
		try {
			Jxgz result = (Jxgz) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Jxgz instance) {
		log.debug("attaching dirty Jxgz instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Jxgz instance) {
		log.debug("attaching clean Jxgz instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static JxgzDAO getFromApplicationContext(ApplicationContext ctx) {
		return (JxgzDAO) ctx.getBean("JxgzDAO");
	}
}