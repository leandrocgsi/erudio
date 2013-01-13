package br.com.erudio.test.factory;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.erudio.factory.interfaces.IFactoryDistribution;
import br.com.erudio.test.factory.base.AbstractFactoryTestBase;

public class ServiceDistributionTest extends AbstractFactoryTestBase{

	private static final Logger logger = Logger.getLogger(ServiceDistributionTest.class);

	@Inject
	private IFactoryDistribution factoryDistribution;

	@Test
	public void startApplication(){
		this.factoryDistribution.startApplication();

		Object waitObject = new Object();

		synchronized (waitObject) {
			while (true) {
				try {
					waitObject.wait();
				} catch (InterruptedException e) {
					logger.error(e.getMessage(),e);
				} catch (Exception e) {
					logger.error(e.getMessage(),e);
				}

			}
		}
	}

}
