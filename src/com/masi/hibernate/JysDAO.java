package com.masi.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Jys
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.masi.hibernate.Jys
 * @author MyEclipse Persistence Tools
 */

public class JysDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(JysDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(Jys transientInstance) {
		log.debug("saving Jys instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Jys persistentInstance) {
		log.debug("deleting Jys instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Jys findById(com.masi.hibernate.JysId id) {
		log.debug("getting Jys instance with id: " + id);
		try {
			Jys instance = (Jys) getHibernateTemplate().get(
					"com.masi.hibernate.Jys", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Jys instance) {
		log.debug("finding Jys instance by example");
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
		log.debug("finding Jys instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Jys as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Jys instances");
		try {
			String queryString = "from Jys";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Jys merge(Jys detachedInstance) {
		log.debug("merging Jys instance");
		try {
			Jys result = (Jys) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Jys instance) {
		log.debug("attaching dirty Jys instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Jys instance) {
		log.debug("attaching clean Jys instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static JysDAO getFromApplicationContext(ApplicationContext ctx) {
		return (JysDAO) ctx.getBean("JysDAO");
	}
}