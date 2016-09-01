package br.com.erudio.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.erudio.utils.database.beans.BeanTipoLogradouro;
import br.com.erudio.utils.database.interfaces.ITipoLogradouroService;
import br.com.erudio.utils.service.interfaces.ITipoLogradouroUtilServices;

@Named
public class ServiceDistributionTipoLogradouro implements ITipoLogradouroUtilServices {

    private final Logger logger = Logger.getLogger(getClass());
    @Inject
    private ITipoLogradouroService tipoLogradouroService;

    @Override
    public Integer saveTipoLogradouro(BeanTipoLogradouro tipoLogradouro) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Salvando o tipo de logradouro de nome " + tipoLogradouro.getDescricaoTipoLogradouro() + " e ID " + tipoLogradouro.getIdTipoLogradouro()+".");
        }
        return this.tipoLogradouroService.save(tipoLogradouro);
    }

    @Override
    public void updateTipoLogradouro(BeanTipoLogradouro tipoLogradouro) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Atualizando o tipo de logradouro com o ID " + tipoLogradouro.getIdTipoLogradouro()+".");
        }
        this.tipoLogradouroService.update(tipoLogradouro);
    }

    @Override
    public void deleteTipoLogradouro(BeanTipoLogradouro tipoLogradouro) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Deletando o tipo de logradouro com o ID " + tipoLogradouro.getIdTipoLogradouro()+".");
        }
        this.tipoLogradouroService.delete(tipoLogradouro);
    }

    @Override
    public List<BeanTipoLogradouro> findAllTipoLogradouros() {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando todos os tipo de logradouros");
        }
        return this.tipoLogradouroService.findAll();
    }

    @Override
    public BeanTipoLogradouro findTipoLogradouroById(Integer id) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando a tipo de logradouro com o ID " + id + ".");
        }
        return this.tipoLogradouroService.findById(id);
    }
}
