package br.com.erudio.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.erudio.factory.interfaces.IFactoryDistribution;

public class NorthwindMain {

	private static final String BUSINESS_CONTEXT = "/ctx-erudio-business.xml";

	private static final String DATABASE_CONTEXT = "/ctx-erudio-database.xml";

	private static final String FACTORY_CONTEXT = "/ctx-erudio-factory.xml";

	private static final String SERVICE_CONTEXT = "/ctx-erudio-service.xml";

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(BUSINESS_CONTEXT, DATABASE_CONTEXT,
				FACTORY_CONTEXT, SERVICE_CONTEXT);

		IFactoryDistribution factoryDistribution = context.getBean(IFactoryDistribution.class);

		factoryDistribution.startApplication();
	}

}
