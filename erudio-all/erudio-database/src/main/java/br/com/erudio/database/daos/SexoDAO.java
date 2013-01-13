package br.com.erudio.database.daos;

import javax.inject.Named;

import br.com.erudio.database.entities.EntitySexo;
import br.com.erudio.database.interfaces.ISexoDAO;
import br.com.erudio.database.utils.GenericDAO;

@Named
public class SexoDAO extends GenericDAO<EntitySexo, Integer> implements ISexoDAO{

}
