package br.com.erudio.database.daos;

import javax.inject.Named;

import br.com.erudio.database.entities.EntityPessoa;
import br.com.erudio.database.interfaces.IPessoaDAO;
import br.com.erudio.database.utils.GenericDAO;
import java.util.List;

@Named
public class PessoaDAO extends GenericDAO<EntityPessoa, Integer> implements IPessoaDAO{
    
    	@Override
	public List<EntityPessoa> findByLogin(String username) {
		return executeQuery("SELECT ep FROM EntityPessoa ep WHERE ep.login = '" + username + "'");
	}

}
