package br.com.erudio.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.erudio.utils.database.beans.BeanCidade;
import br.com.erudio.utils.database.interfaces.ICidadeService;
import br.com.erudio.utils.service.interfaces.IServices;

@Named
public class Services implements IServices{

	private final Logger logger = Logger.getLogger(getClass());

	@Inject
	private ICidadeService cidadeService;

	@Override
	public List<BeanCidade> findAllCidades() {
		if (this.logger.isDebugEnabled()) {
			this.logger.debug("Buscando todas as cidades");
		}
		return this.cidadeService.findAll();
	}

}
