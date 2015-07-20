package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Sy
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Sy
 * @author MyEclipse Persistence Tools
 */

public class SyDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(SyDAO.class);
	// property constants
	public static final String SYNAME = "syname";
	public static final String SYTYPE = "sytype";
	public static final String SYATTRI = "syattri";
	public static final String SYADDR = "syaddr";
	public static final String SYADDRTEMP = "syaddrtemp";
	public static final String SYKEYWORD = "sykeyword";
	public static final String SYPICADDR = "sypicaddr";
	public static final String SYPICCODE = "sypiccode";
	public static final String SYREADEDNUM = "syreadednum";
	public static final String SYPUBLISHER = "sypublisher";
	public static final String SYCODE = "sycode";

	protected void initDao() {
		// do nothing
	}

	public void save(Sy transientInstance) {
		log.debug("saving Sy instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sy persistentInstance) {
		log.debug("deleting Sy instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sy findById(java.lang.Integer id) {
		log.debug("getting Sy instance with id: " + id);
		try {
			Sy instance = (Sy) getHibernateTemplate().get(
					"com.masi.hibernate.Sy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Sy instance) {
		log.debug("finding Sy instance by example");
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
		log.debug("finding Sy instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sy as model where model." + propertyName
					+ "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySyname(Object syname) {
		return findByProperty(SYNAME, syname);
	}

	public List findBySytype(Object sytype) {
		return findByProperty(SYTYPE, sytype);
	}

	public List findBySyattri(Object syattri) {
		return findByProperty(SYATTRI, syattri);
	}

	public List findBySyaddr(Object syaddr) {
		return findByProperty(SYADDR, syaddr);
	}

	public List findBySyaddrtemp(Object syaddrtemp) {
		return findByProperty(SYADDRTEMP, syaddrtemp);
	}

	public List findBySykeyword(Object sykeyword) {
		return findByProperty(SYKEYWORD, sykeyword);
	}

	public List findBySypicaddr(Object sypicaddr) {
		return findByProperty(SYPICADDR, sypicaddr);
	}

	public List findBySypiccode(Object sypiccode) {
		return findByProperty(SYPICCODE, sypiccode);
	}

	public List findBySyreadednum(Object syreadednum) {
		return findByProperty(SYREADEDNUM, syreadednum);
	}

	public List findBySypublisher(Object sypublisher) {
		return findByProperty(SYPUBLISHER, sypublisher);
	}

	public List findBySycode(Object sycode) {
		return findByProperty(SYCODE, sycode);
	}

	public List findAll() {
		log.debug("finding all Sy instances");
		try {
			String queryString = "from Sy";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Sy merge(Sy detachedInstance) {
		log.debug("merging Sy instance");
		try {
			Sy result = (Sy) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Sy instance) {
		log.debug("attaching dirty Sy instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sy instance) {
		log.debug("attaching clean Sy instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SyDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SyDAO) ctx.getBean("SyDAO");
	}
}