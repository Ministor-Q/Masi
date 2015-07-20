package com.masi.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Jsfb
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Jsfb
 * @author MyEclipse Persistence Tools
 */

public class JsfbDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(JsfbDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(Jsfb transientInstance) {
		log.debug("saving Jsfb instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Jsfb persistentInstance) {
		log.debug("deleting Jsfb instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Jsfb findById(com.masi.hibernate.JsfbId id) {
		log.debug("getting Jsfb instance with id: " + id);
		try {
			Jsfb instance = (Jsfb) getHibernateTemplate().get(
					"com.masi.hibernate.Jsfb", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Jsfb instance) {
		log.debug("finding Jsfb instance by example");
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
		log.debug("finding Jsfb instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Jsfb as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Jsfb instances");
		try {
			String queryString = "from Jsfb";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Jsfb merge(Jsfb detachedInstance) {
		log.debug("merging Jsfb instance");
		try {
			Jsfb result = (Jsfb) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Jsfb instance) {
		log.debug("attaching dirty Jsfb instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Jsfb instance) {
		log.debug("attaching clean Jsfb instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static JsfbDAO getFromApplicationContext(ApplicationContext ctx) {
		return (JsfbDAO) ctx.getBean("JsfbDAO");
	}
}