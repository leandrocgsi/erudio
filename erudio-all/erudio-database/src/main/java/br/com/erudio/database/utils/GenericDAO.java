package br.com.erudio.database.utils;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

import br.com.erudio.database.utils.interfaces.IGenericDAO;

public abstract class GenericDAO<T extends BaseEntity, ID extends Serializable> implements IGenericDAO<T, ID>{

	private final Logger logger = Logger.getLogger(this.getClass());
	private final Class<T> persistentClass;
	private final Session session;

	@SuppressWarnings("unchecked")
	public GenericDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		this.session = getCurrentSession();

		if (this.logger.isInfoEnabled()) {
			this.logger.info(String.format("Criando um DAO para a classe a ser persistida[%s].", getPersistentClass()));
		}
	}
	// ///////////////////////////////////////////////////////////////////////////////
	// PUBLIC METHODS (IGenericDao<T, ID>)
	// ///////////////////////////////////////////////////////////////////////////////

	@Override
	@SuppressWarnings("unchecked")
	public T findById(ID id) {
		return (T) getSession().load(getPersistentClass(), id);
	}

	@Override
	public List<T> findAll() {
		return findByCriteria();
	}

	@Override
	@SuppressWarnings("unchecked")
	public ID save(T entity) {
		getSession().beginTransaction();
		Serializable id = getSession().save(entity);
		getSession().getTransaction().commit();

		return (ID)id;
	}

	@Override
	public void update(T entity) {
		getSession().beginTransaction();
		getSession().update(entity);
		getSession().getTransaction().commit();
	}

	@Override
	public void delete(T entity) {
		getSession().beginTransaction();
		getSession().delete(entity);
		getSession().getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	protected List<T> executeQuery(String query) {
		try {
			Query queryHql = getSession().createQuery(query);

			return queryHql.list();
		} catch (RuntimeException e) {
			this.logger.error(e.getMessage(), e);

			throw e;
		}
	}

	// ///////////////////////////////////////////////////////////////////////////////
	// GET AND SET METHODS
	// ///////////////////////////////////////////////////////////////////////////////

	public Session getSession() {
		if (this.session == null) {
			this.logger.error("Sessão não iniciada.");

			throw new IllegalStateException("A sessão não foi criada antes do uso do DAO");
		}

		return this.session;
	}

	/////////////////////////////////////////////////////////////////////////////////
	// PRIVATE METHODS
	/////////////////////////////////////////////////////////////////////////////////

	private Class<T> getPersistentClass() {
		return this.persistentClass;
	}

	@SuppressWarnings("unchecked")
	private List<T> findByCriteria(Criterion... criterion) {
		Criteria crit = getSession().createCriteria(getPersistentClass());

		for (Criterion c : criterion) {
			crit.add(c);
		}

		return crit.list();
	}

	private Session getCurrentSession() {
		return HibernateUtility.getSession();
	}

}
