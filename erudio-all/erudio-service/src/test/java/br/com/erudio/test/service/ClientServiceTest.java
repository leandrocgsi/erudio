package br.com.erudio.test.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.erudio.test.service.base.AbstractServiceTestBase;
import br.com.erudio.utils.database.beans.BeanCidade;
import br.com.erudio.utils.service.interfaces.ICidadeUtilServices;

public class ClientServiceTest extends AbstractServiceTestBase {

	private static final Logger logger = Logger.getLogger(ClientServiceTest.class);

	@Inject
	private ICidadeUtilServices services;

	@Test
	public void clientTest() {
		List<BeanCidade> cidades = this.services.findAllCidades();

		if (logger.isDebugEnabled()) {
			logger.debug(cidades);
		}
	}
}
