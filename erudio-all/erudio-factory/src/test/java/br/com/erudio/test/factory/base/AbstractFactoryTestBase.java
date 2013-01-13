package br.com.erudio.test.factory.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		AbstractFactoryTestBase.BUSINESS_TEST_CONTEXT,
		AbstractFactoryTestBase.DATABASE_TEST_CONTEXT,
		AbstractFactoryTestBase.FACTORY_TEST_CONTEXT,
		AbstractFactoryTestBase.SERVICE_TEST_CONTEXT })
public class AbstractFactoryTestBase {

	public static final String BUSINESS_TEST_CONTEXT = "/ctx-erudio-business.xml";

	public static final String DATABASE_TEST_CONTEXT = "/ctx-erudio-database.xml";

	public static final String FACTORY_TEST_CONTEXT = "/ctx-erudio-test-factory.xml";

	public static final String SERVICE_TEST_CONTEXT = "/ctx-erudio-service-integration.xml";

}