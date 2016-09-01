package br.com.erudio.database.daos;

import javax.inject.Named;

import br.com.erudio.database.entities.EntityCidade;
import br.com.erudio.database.interfaces.ICidadeDAO;
import br.com.erudio.database.utils.GenericDAO;

@Named
public class CidadeDAO extends GenericDAO<EntityCidade, Integer> implements ICidadeDAO{

}