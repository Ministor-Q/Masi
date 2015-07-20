package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for szdw
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.szdw
 * @author MyEclipse Persistence Tools
 */

public class SzdwDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(SzdwDAO.class);
	// property constants
	public static final String SZDWNAME = "szdwname";
	public static final String SZDWTYPE = "szdwtype";
	public static final String SZDWATTRI = "szdwattri";
	public static final String SZDWADDR = "szdwaddr";
	public static final String SZDWADDRTEMP = "szdwaddrtemp";
	public static final String SZDWKEYWORD = "szdwkeyword";
	public static final String SZDWPICADDR = "szdwpicaddr";
	public static final String SZDWPICCODE = "szdwpiccode";
	public static final String SZDWREADEDNUM = "szdwreadednum";
	public static final String SZDWPUBLISHER = "szdwpublisher";
	public static final String SZDWCODE = "szdwcode";

	protected void initDao() {
		// do nothing
	}

	public void save(Szdw transientInstance) {
		log.debug("saving szdw instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Szdw persistentInstance) {
		log.debug("deleting szdw instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Szdw findById(java.lang.Integer id) {
		log.debug("getting Szdw instance with id: " + id);
		try {
			Szdw instance = (Szdw) getHibernateTemplate().get(
					"com.masi.hibernate.Szdw", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Szdw instance) {
		log.debug("finding Szdw instance by example");
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
		log.debug("finding Szdw instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Szdw as model where model." + propertyName
					+ "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByszdwname(Object szdwname) {
		return findByProperty(SZDWNAME, szdwname);
	}

	public List findByszdwtype(Object szdwtype) {
		return findByProperty(SZDWTYPE, szdwtype);
	}

	public List findByszdwattri(Object szdwattri) {
		return findByProperty(SZDWATTRI, szdwattri);
	}

	public List findByszdwaddr(Object szdwaddr) {
		return findByProperty(SZDWADDR, szdwaddr);
	}

	public List findByszdwaddrtemp(Object szdwaddrtemp) {
		return findByProperty(SZDWADDRTEMP, szdwaddrtemp);
	}

	public List findByszdwkeyword(Object szdwkeyword) {
		return findByProperty(SZDWKEYWORD, szdwkeyword);
	}

	public List findByszdwpicaddr(Object szdwpicaddr) {
		return findByProperty(SZDWPICADDR, szdwpicaddr);
	}

	public List findByszdwpiccode(Object szdwpiccode) {
		return findByProperty(SZDWPICCODE, szdwpiccode);
	}

	public List findByszdwreadednum(Object szdwreadednum) {
		return findByProperty(SZDWREADEDNUM, szdwreadednum);
	}

	public List findByszdwpublisher(Object szdwpublisher) {
		return findByProperty(SZDWPUBLISHER, szdwpublisher);
	}

	public List findByszdwcode(Object szdwcode) {
		return findByProperty(SZDWCODE, szdwcode);
	}

	public List findAll() {
		log.debug("finding all Szdw instances");
		try {
			String queryString = "from Szdw";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Szdw merge(Szdw detachedInstance) {
		log.debug("merging szdw instance");
		try {
			Szdw result = (Szdw) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Szdw instance) {
		log.debug("attaching dirty szdw instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Szdw instance) {
		log.debug("attaching clean szdw instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SzdwDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SzdwDAO) ctx.getBean("SzdwDAO");
	}
}