package br.com.erudio.database.utils.interfaces;

import java.io.Serializable;
import java.util.List;

import br.com.erudio.database.utils.BaseEntity;

public interface IGenericDAO<T extends BaseEntity, ID extends Serializable> {
	T findById(ID id);
	List<T> findAll();
	ID save(T entity);
	void update(T entity);
	void delete(T entity);
}
