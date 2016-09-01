package br.com.erudio.database.daos;

import javax.inject.Named;

import br.com.erudio.database.entities.EntityEndereco;
import br.com.erudio.database.interfaces.IEnderecoDAO;
import br.com.erudio.database.utils.GenericDAO;

@Named
public class EnderecoDAO extends GenericDAO<EntityEndereco, Integer> implements IEnderecoDAO{

}
