package br.com.erudio.test.database;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.erudio.test.database.base.AbstractDatabaseTestBase;
import br.com.erudio.utils.database.interfaces.ICidadeService;
import br.com.erudio.utils.database.interfaces.IDatabaseService;
import br.com.erudio.utils.database.interfaces.IEnderecoService;
import br.com.erudio.utils.database.interfaces.ISexoService;
import br.com.erudio.utils.database.interfaces.ITipoEnderecoService;
import br.com.erudio.utils.database.interfaces.ITipoLogradouroService;

public class DatabaseTest extends AbstractDatabaseTestBase{

	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private IDatabaseService databaseService;

	@Test
	public void testCidadeService(){
		ICidadeService cidadeService = this.databaseService.getCidadeService();

		this.logger.debug(cidadeService.findAll());
	}

	@Test
	public void testEndereco(){
		IEnderecoService enderecoService = this.databaseService.getEnderecoService();

		this.logger.debug(enderecoService.findAll());
	}

	@Test
	public void testSexo(){
		ISexoService sexoService = this.databaseService.getSexoService();

		this.logger.debug(sexoService.findAll());
	}

	@Test
	public void testTipoEndereco(){
		ITipoEnderecoService tipoEnderecoService = this.databaseService.getTipoEnderecoService();

		this.logger.debug(tipoEnderecoService.findAll());
	}

	@Test
	public void testTipoLogradouro(){
		ITipoLogradouroService tipoLogradouroService = this.databaseService.getTipoLogradouroService();

		this.logger.debug(tipoLogradouroService.findAll());
	}

}
