package br.com.erudio.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.erudio.database.entities.EntityTipoLogradouro;
import br.com.erudio.database.interfaces.ITipoLogradouroDAO;
import br.com.erudio.database.utils.GenericService;
import br.com.erudio.database.utils.interfaces.IGenericDAO;
import br.com.erudio.utils.database.beans.BeanTipoLogradouro;
import br.com.erudio.utils.database.interfaces.ITipoLogradouroService;

@Named
public class ServiceTipoLogradouro extends GenericService<BeanTipoLogradouro, EntityTipoLogradouro, Integer>implements ITipoLogradouroService{

	@Inject
	private ITipoLogradouroDAO tipoLogradouroDAO;

	@Override
	protected IGenericDAO<EntityTipoLogradouro, Integer> getConcreteDAO() {
		return this.tipoLogradouroDAO;
	}



}
