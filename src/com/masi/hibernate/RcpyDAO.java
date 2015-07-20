package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Rcpy
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Rcpy
 * @author MyEclipse Persistence Tools
 */

public class RcpyDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(RcpyDAO.class);
	// property constants
	public static final String RCPYNAME = "rcpyname";
	public static final String RCPYTYPE = "rcpytype";
	public static final String RCPYATTRI = "rcpyattri";
	public static final String RCPYADDR = "rcpyaddr";
	public static final String RCPYADDRTEMP = "rcpyaddrtemp";
	public static final String RCPYKEYWORD = "rcpykeyword";
	public static final String RCPYREADEDNUM = "rcpyreadednum";
	public static final String RCPYPUBLISHER = "rcpypublisher";
	public static final String RCPYCODE = "rcpycode";

	protected void initDao() {
		// do nothing
	}

	public void save(Rcpy transientInstance) {
		log.debug("saving Rcpy instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Rcpy persistentInstance) {
		log.debug("deleting Rcpy instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Rcpy findById(java.lang.Integer id) {
		log.debug("getting Rcpy instance with id: " + id);
		try {
			Rcpy instance = (Rcpy) getHibernateTemplate().get(
					"com.masi.hibernate.Rcpy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Rcpy instance) {
		log.debug("finding Rcpy instance by example");
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
		log.debug("finding Rcpy instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Rcpy as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRcpyname(Object rcpyname) {
		return findByProperty(RCPYNAME, rcpyname);
	}

	public List findByRcpytype(Object rcpytype) {
		return findByProperty(RCPYTYPE, rcpytype);
	}

	public List findByRcpyattri(Object rcpyattri) {
		return findByProperty(RCPYATTRI, rcpyattri);
	}

	public List findByRcpyaddr(Object rcpyaddr) {
		return findByProperty(RCPYADDR, rcpyaddr);
	}

	public List findByRcpyaddrtemp(Object rcpyaddrtemp) {
		return findByProperty(RCPYADDRTEMP, rcpyaddrtemp);
	}

	public List findByRcpykeyword(Object rcpykeyword) {
		return findByProperty(RCPYKEYWORD, rcpykeyword);
	}

	public List findByRcpyreadednum(Object rcpyreadednum) {
		return findByProperty(RCPYREADEDNUM, rcpyreadednum);
	}

	public List findByRcpypublisher(Object rcpypublisher) {
		return findByProperty(RCPYPUBLISHER, rcpypublisher);
	}

	public List findByRcpycode(Object rcpycode) {
		return findByProperty(RCPYCODE, rcpycode);
	}

	public List findAll() {
		log.debug("finding all Rcpy instances");
		try {
			String queryString = "from Rcpy";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Rcpy merge(Rcpy detachedInstance) {
		log.debug("merging Rcpy instance");
		try {
			Rcpy result = (Rcpy) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Rcpy instance) {
		log.debug("attaching dirty Rcpy instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Rcpy instance) {
		log.debug("attaching clean Rcpy instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static RcpyDAO getFromApplicationContext(ApplicationContext ctx) {
		return (RcpyDAO) ctx.getBean("RcpyDAO");
	}
}