package br.com.erudio.test.database;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.erudio.test.database.base.AbstractDatabaseTestBase;
import br.com.erudio.utils.database.beans.BeanCidade;
import br.com.erudio.utils.database.beans.BeanEndereco;
import br.com.erudio.utils.database.beans.BeanPessoa;
import br.com.erudio.utils.database.beans.BeanSexo;
import br.com.erudio.utils.database.beans.BeanTipoEndereco;
import br.com.erudio.utils.database.beans.BeanTipoLogradouro;
import br.com.erudio.utils.database.interfaces.ICidadeService;
import br.com.erudio.utils.database.interfaces.IEnderecoService;
import br.com.erudio.utils.database.interfaces.IPessoaService;
import br.com.erudio.utils.database.interfaces.ISexoService;
import br.com.erudio.utils.database.interfaces.ITipoEnderecoService;
import br.com.erudio.utils.database.interfaces.ITipoLogradouroService;

public class DatabaseServiceTest extends AbstractDatabaseTestBase{

	private final Logger logger = Logger.getLogger(getClass());

	@Inject
	private ICidadeService serviceCidade;

	@Inject
	private IEnderecoService serviceEndereco;

	@Inject
	private IPessoaService servicePessoa;

	@Inject
	private ISexoService serviceSexo;

	@Inject
	private ITipoEnderecoService serviceTipoEndereco;

	@Inject
	private ITipoLogradouroService serviceTipoLogradouro;

	@Test
	public void testCidadeService(){
		List<BeanCidade> cidades = this.serviceCidade.findAll();
		this.logger.debug(cidades);
	}

	@Test
	public void testEnderecoService(){
		List<BeanEndereco> enderecos = this.serviceEndereco.findAll();
		this.logger.debug(enderecos);
	}

	@Test
	public void testPessoaService(){
		List<BeanPessoa> pessoas = this.servicePessoa.findAll();
		this.logger.debug(pessoas);
	}

	@Test
	public void testSexoService(){
		List<BeanSexo> sexos = this.serviceSexo.findAll();
		this.logger.debug(sexos);
	}

	@Test
	public void testTipoEnderecoService(){
		List<BeanTipoEndereco> tipoEnderecos = this.serviceTipoEndereco.findAll();
		this.logger.debug(tipoEnderecos);
	}

	@Test
	public void testTipoLogradouroService(){
		List<BeanTipoLogradouro> tipoLogradouros = this.serviceTipoLogradouro.findAll();
		this.logger.debug(tipoLogradouros);
	}
}
