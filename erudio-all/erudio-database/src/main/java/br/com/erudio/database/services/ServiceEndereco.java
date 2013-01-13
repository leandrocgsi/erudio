package br.com.erudio.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.erudio.database.entities.EntityEndereco;
import br.com.erudio.database.interfaces.IEnderecoDAO;
import br.com.erudio.database.utils.GenericService;
import br.com.erudio.database.utils.interfaces.IGenericDAO;
import br.com.erudio.utils.database.beans.BeanEndereco;
import br.com.erudio.utils.database.interfaces.IEnderecoService;

@Named
public class ServiceEndereco extends GenericService<BeanEndereco, EntityEndereco, Integer>implements IEnderecoService{

	@Inject
	private IEnderecoDAO enderecoDAO;

	@Override
	protected IGenericDAO<EntityEndereco, Integer> getConcreteDAO() {
		return this.enderecoDAO;
	}



}
