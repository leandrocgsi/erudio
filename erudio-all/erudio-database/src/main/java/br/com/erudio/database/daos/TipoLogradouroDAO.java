package br.com.erudio.database.daos;

import javax.inject.Named;

import br.com.erudio.database.entities.EntityTipoLogradouro;
import br.com.erudio.database.interfaces.ITipoLogradouroDAO;
import br.com.erudio.database.utils.GenericDAO;

@Named
public class TipoLogradouroDAO  extends GenericDAO<EntityTipoLogradouro, Integer> implements ITipoLogradouroDAO{

}
