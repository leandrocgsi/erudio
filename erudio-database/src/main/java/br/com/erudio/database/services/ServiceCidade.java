package br.com.erudio.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.erudio.database.entities.EntityCidade;
import br.com.erudio.database.interfaces.ICidadeDAO;
import br.com.erudio.database.utils.GenericService;
import br.com.erudio.database.utils.interfaces.IGenericDAO;
import br.com.erudio.utils.database.beans.BeanCidade;
import br.com.erudio.utils.database.interfaces.ICidadeService;

@Named
public class ServiceCidade extends GenericService<BeanCidade, EntityCidade, Integer>implements ICidadeService{

	@Inject
	private ICidadeDAO cidadeDAO;

	@Override
	protected IGenericDAO<EntityCidade, Integer> getConcreteDAO() {
		return this.cidadeDAO;
	}



}
