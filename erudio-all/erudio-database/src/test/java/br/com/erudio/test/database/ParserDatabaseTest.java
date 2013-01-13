package br.com.erudio.test.database;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.erudio.database.entities.EntityCidade;
import br.com.erudio.database.utils.ParserDatabase;
import br.com.erudio.utils.database.beans.BeanCidade;

public class ParserDatabaseTest {

	private static final Logger logger = Logger.getLogger(ParserDatabaseTest.class);

	@Test
	public void testeParserDatabase() {
		BeanCidade cidadeBean = new BeanCidade();


		cidadeBean.setIdCidade(9999);
		cidadeBean.setNomeCidade("Letópodia");
		cidadeBean.setSigla("MG");
		cidadeBean.setUf("MINAS GERAIS");

		EntityCidade categoryEntity = ParserDatabase.parserBeanToEntity(cidadeBean, EntityCidade.class);

		logger.debug(categoryEntity);
	}

	@Test
	public void testeListParserDatabase() {
		BeanCidade cidadeBean1 = new BeanCidade();

		cidadeBean1.setIdCidade(10000);
		cidadeBean1.setNomeCidade("Felisópodia");
		cidadeBean1.setSigla("MG");
		cidadeBean1.setUf("MINAS GERAIS");

		BeanCidade cidadeBean2 = new BeanCidade();

		cidadeBean2.setIdCidade(10001);
		cidadeBean2.setNomeCidade("Sorrisópodia");
		cidadeBean2.setSigla("MG");
		cidadeBean2.setUf("MINAS GERAIS");

		List<BeanCidade> categoriesBeans = new ArrayList<BeanCidade>();

		categoriesBeans.add(cidadeBean1);
		categoriesBeans.add(cidadeBean2);

		List<EntityCidade> categoriesEntities = ParserDatabase.parserListBeansToEntities(categoriesBeans, EntityCidade.class);

		logger.debug(categoriesEntities);
	}
}
