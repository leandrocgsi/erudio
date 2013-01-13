package br.com.erudio.database.utils;

import java.io.Serializable;
import java.util.List;

import br.com.erudio.utils.beans.BaseBean;
import br.com.erudio.utils.database.interfaces.IServiceBase;

public abstract class GenericService<T extends BaseBean, K extends BaseEntity, ID extends Serializable>
	extends GenericServiceWithKey<T, K, ID, ID> implements IServiceBase<T, ID> {

	/////////////////////////////////////////////////////////////////////////////////
	// PUBLIC METHODS (IServiceBase)
	/////////////////////////////////////////////////////////////////////////////////

	@Override
	public T findById(ID id) {
		return parserEntity(this.getConcreteDAO().findById(id));
	}

	@Override
	public List<T> findAll() {
		return parserEntity(this.getConcreteDAO().findAll());
	}

	@Override
	public ID save(T bean) {
		return getConcreteDAO().save(parserBean(bean));
	}

	@Override
	public void update(T bean) {
		this.getConcreteDAO().update(parserBean(bean));
	}

	@Override
	public void delete(T bean) {
		this.getConcreteDAO().delete(parserBean(bean));
	}
}