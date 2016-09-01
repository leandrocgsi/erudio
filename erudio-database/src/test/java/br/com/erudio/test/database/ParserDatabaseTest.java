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
		cidadeBean.setNome("CANCÚN");
		cidadeBean.setSigla("QR");
		cidadeBean.setEstado("QUINTANA ROO");

		EntityCidade categoryEntity = ParserDatabase.parserBeanToEntity(cidadeBean, EntityCidade.class);

		logger.debug(categoryEntity);
	}

	@Test
	public void testeListParserDatabase() {
		BeanCidade cidadeBean1 = new BeanCidade();

		cidadeBean1.setIdCidade(10000);
		cidadeBean1.setNome("TANGAMANDÁPIO");
		cidadeBean1.setSigla("MC");
		cidadeBean1.setEstado("MICHOACÁN");

		BeanCidade cidadeBean2 = new BeanCidade();

		cidadeBean2.setIdCidade(10001);
		cidadeBean2.setNome("TRUJILLO");
		cidadeBean2.setSigla("TR");
		cidadeBean2.setEstado("TRUJILLO");

		List<BeanCidade> categoriesBeans = new ArrayList<BeanCidade>();

		categoriesBeans.add(cidadeBean1);
		categoriesBeans.add(cidadeBean2);

		List<EntityCidade> categoriesEntities = ParserDatabase.parserListBeansToEntities(categoriesBeans, EntityCidade.class);

		logger.debug(categoriesEntities);
	}
}
