package br.com.erudio.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.erudio.database.entities.EntityTipoEndereco;
import br.com.erudio.database.interfaces.ITipoEnderecoDAO;
import br.com.erudio.database.utils.GenericService;
import br.com.erudio.database.utils.interfaces.IGenericDAO;
import br.com.erudio.utils.database.beans.BeanTipoEndereco;
import br.com.erudio.utils.database.interfaces.ITipoEnderecoService;

@Named
public class ServiceTipoEndereco extends GenericService<BeanTipoEndereco, EntityTipoEndereco, Integer>implements ITipoEnderecoService{

	@Inject
	private ITipoEnderecoDAO tipoEnderecoDAO;

	@Override
	protected IGenericDAO<EntityTipoEndereco, Integer> getConcreteDAO() {
		return this.tipoEnderecoDAO;
	}



}
