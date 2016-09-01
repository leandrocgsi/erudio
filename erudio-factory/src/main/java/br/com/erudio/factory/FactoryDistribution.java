package br.com.erudio.factory;

import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.erudio.factory.interfaces.IFactoryDistribution;

@Named
public class FactoryDistribution implements IFactoryDistribution{

	private final Logger logger = Logger.getLogger(getClass());

	@Override
	public void startApplication() {
		if (this.logger.isInfoEnabled()){
			this.logger.info("Aplicação inicializada :-)");
		}
	}


}
