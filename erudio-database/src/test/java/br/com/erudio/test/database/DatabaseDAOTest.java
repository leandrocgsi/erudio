package br.com.erudio.test.database;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.erudio.database.entities.EntitySexo;
import br.com.erudio.database.interfaces.ISexoDAO;
import br.com.erudio.test.database.base.AbstractDatabaseTestBase;

public class DatabaseDAOTest extends AbstractDatabaseTestBase{

	private final Logger logger = Logger.getLogger(getClass());
	@Inject
	private ISexoDAO sexoDAO;

	@Test
	public void testSexoDAO(){
		List<EntitySexo> sexos = this.sexoDAO.findAll();
		this.logger.debug(sexos);
	}
}
