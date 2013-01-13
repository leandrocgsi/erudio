package br.com.erudio.database.daos;

import javax.inject.Named;

import br.com.erudio.database.entities.EntityPessoa;
import br.com.erudio.database.interfaces.IPessoaDAO;
import br.com.erudio.database.utils.GenericDAO;

@Named
public class PessoaDAO extends GenericDAO<EntityPessoa, Integer> implements IPessoaDAO{

}
