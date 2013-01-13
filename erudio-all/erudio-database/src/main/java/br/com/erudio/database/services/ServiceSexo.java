package br.com.erudio.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.erudio.database.entities.EntitySexo;
import br.com.erudio.database.interfaces.ISexoDAO;
import br.com.erudio.database.utils.GenericService;
import br.com.erudio.database.utils.interfaces.IGenericDAO;
import br.com.erudio.utils.database.beans.BeanSexo;
import br.com.erudio.utils.database.interfaces.ISexoService;

@Named
public class ServiceSexo extends GenericService<BeanSexo, EntitySexo, Integer>implements ISexoService{

	@Inject
	private ISexoDAO sexoDAO;

	@Override
	protected IGenericDAO<EntitySexo, Integer> getConcreteDAO() {
		return this.sexoDAO;
	}



}
