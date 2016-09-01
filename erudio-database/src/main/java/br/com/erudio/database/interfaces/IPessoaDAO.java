package br.com.erudio.database.interfaces;

import br.com.erudio.database.entities.EntityPessoa;
import br.com.erudio.database.utils.interfaces.IGenericDAO;
import java.util.List;

public interface IPessoaDAO extends IGenericDAO<EntityPessoa, Integer>{

    List<EntityPessoa> findByLogin(String username);
}
