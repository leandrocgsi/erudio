package br.com.erudio.utils.database.interfaces;

import java.io.Serializable;
import java.util.List;

import br.com.erudio.utils.beans.BaseBean;

public interface IServiceBase<T extends BaseBean,ID extends Serializable> {
	T findById(ID id);
	List<T> findAll();
	ID save(T bean);
	void update(T bean);
	void delete(T bean);
}
