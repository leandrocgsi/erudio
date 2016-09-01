package br.com.erudio.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.erudio.utils.database.beans.BeanCidade;
import br.com.erudio.utils.database.interfaces.ICidadeService;
import br.com.erudio.utils.service.interfaces.ICidadeUtilServices;

@Named
public class ServiceDistributionCidade implements ICidadeUtilServices {

    private final Logger logger = Logger.getLogger(getClass());
    @Inject
    private ICidadeService cidadeService;

    @Override
    public Integer saveCidade(BeanCidade cidade) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Salvando a cidade de nome " + cidade.getNome() + " e ID " + cidade.getIdCidade()+".");
        }
        return this.cidadeService.save(cidade);
    }

    @Override
    public void updateCidade(BeanCidade cidade) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Atualizando a cidade com o ID " + cidade.getIdCidade()+".");
        }
        this.cidadeService.update(cidade);
    }

    @Override
    public void deleteCidade(BeanCidade cidade) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Deletando a cidade com o ID " + cidade.getIdCidade()+".");
        }
        this.cidadeService.delete(cidade);
    }

    @Override
    public List<BeanCidade> findAllCidades() {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando todas as cidades");
        }
        return this.cidadeService.findAll();
    }

    @Override
    public BeanCidade findCidadeById(Integer id) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando a cidade com o ID " + id + ".");
        }
        return this.cidadeService.findById(id);
    }
}
