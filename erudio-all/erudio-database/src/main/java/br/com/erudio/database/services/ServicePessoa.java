package br.com.erudio.database.services;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.erudio.database.entities.EntityPessoa;
import br.com.erudio.database.interfaces.IPessoaDAO;
import br.com.erudio.database.utils.GenericService;
import br.com.erudio.database.utils.interfaces.IGenericDAO;
import br.com.erudio.utils.database.beans.BeanPessoa;
import br.com.erudio.utils.database.interfaces.IPessoaService;

@Named
public class ServicePessoa extends GenericService<BeanPessoa, EntityPessoa, Integer>implements IPessoaService{

	@Inject
	private IPessoaDAO pessoaDAO;

	@Override
	protected IGenericDAO<EntityPessoa, Integer> getConcreteDAO() {
		return this.pessoaDAO;
	}

}