package br.com.erudio.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.erudio.utils.database.beans.BeanTipoEndereco;
import br.com.erudio.utils.database.interfaces.ITipoEnderecoService;
import br.com.erudio.utils.service.interfaces.ITipoEnderecoUtilServices;

@Named
public class ServiceDistributionTipoEndereco implements ITipoEnderecoUtilServices {

    private final Logger logger = Logger.getLogger(getClass());
    @Inject
    private ITipoEnderecoService tipoEnderecoService;

    @Override
    public Integer saveTipoEndereco(BeanTipoEndereco tipoEndereco) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Salvando o tipo de endereco de nome " + tipoEndereco.getDescricaoTipoEndereco() + " e ID " + tipoEndereco.getIdTipoEndereco()+".");
        }
        return this.tipoEnderecoService.save(tipoEndereco);
    }

    @Override
    public void updateTipoEndereco(BeanTipoEndereco tipoEndereco) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Atualizando o tipo de endereco com o ID " + tipoEndereco.getIdTipoEndereco()+".");
        }
        this.tipoEnderecoService.update(tipoEndereco);
    }

    @Override
    public void deleteTipoEndereco(BeanTipoEndereco tipoEndereco) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Deletando o tipo de endereco com o ID " + tipoEndereco.getIdTipoEndereco()+".");
        }
        this.tipoEnderecoService.delete(tipoEndereco);
    }

    @Override
    public List<BeanTipoEndereco> findAllTipoEnderecos() {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando todos os tipo de enderecos");
        }
        return this.tipoEnderecoService.findAll();
    }

    @Override
    public BeanTipoEndereco findTipoEnderecoById(Integer id) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando a tipo de endereco com o ID " + id + ".");
        }
        return this.tipoEnderecoService.findById(id);
    }
}
