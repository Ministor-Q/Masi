package com.masi.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Norfile entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.masi.hibernate.Norfile
 * @author MyEclipse Persistence Tools
 */

public class NorfileDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(NorfileDAO.class);
	// property constants
	public static final String FILENAME = "filename";
	public static final String FILETYPE = "filetype";
	public static final String FILEATTRI = "fileattri";
	public static final String FILEADDR = "fileaddr";
	public static final String FILEADDRTEMP = "fileaddrtemp";
	public static final String FILEREADEDNUM = "filereadednum";
	public static final String FILEPUBLISHER = "filepublisher";

	protected void initDao() {
		// do nothing
	}

	public void save(Norfile transientInstance) {
		log.debug("saving Norfile instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Norfile persistentInstance) {
		log.debug("deleting Norfile instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Norfile findById(java.lang.String id) {
		log.debug("getting Norfile instance with id: " + id);
		try {
			Norfile instance = (Norfile) getHibernateTemplate().get(
					"com.masi.hibernate.Norfile", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Norfile instance) {
		log.debug("finding Norfile instance by example");
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
		log.debug("finding Norfile instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Norfile as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFilename(Object filename) {
		return findByProperty(FILENAME, filename);
	}

	public List findByFiletype(Object filetype) {
		return findByProperty(FILETYPE, filetype);
	}

	public List findByFileattri(Object fileattri) {
		return findByProperty(FILEATTRI, fileattri);
	}

	public List findByFileaddr(Object fileaddr) {
		return findByProperty(FILEADDR, fileaddr);
	}

	public List findByFileaddrtemp(Object fileaddrtemp) {
		return findByProperty(FILEADDRTEMP, fileaddrtemp);
	}

	public List findByFilereadednum(Object filereadednum) {
		return findByProperty(FILEREADEDNUM, filereadednum);
	}

	public List findByFilepublisher(Object filepublisher) {
		return findByProperty(FILEPUBLISHER, filepublisher);
	}

	public List findAll() {
		log.debug("finding all Norfile instances");
		try {
			String queryString = "from Norfile";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Norfile merge(Norfile detachedInstance) {
		log.debug("merging Norfile instance");
		try {
			Norfile result = (Norfile) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Norfile instance) {
		log.debug("attaching dirty Norfile instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Norfile instance) {
		log.debug("attaching clean Norfile instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static NorfileDAO getFromApplicationContext(ApplicationContext ctx) {
		return (NorfileDAO) ctx.getBean("NorfileDAO");
	}
}