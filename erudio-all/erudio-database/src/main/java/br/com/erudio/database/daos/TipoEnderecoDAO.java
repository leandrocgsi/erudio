package br.com.erudio.database.daos;

import javax.inject.Named;

import br.com.erudio.database.entities.EntityTipoEndereco;
import br.com.erudio.database.interfaces.ITipoEnderecoDAO;
import br.com.erudio.database.utils.GenericDAO;

@Named
public class TipoEnderecoDAO extends GenericDAO<EntityTipoEndereco, Integer> implements ITipoEnderecoDAO{

}
