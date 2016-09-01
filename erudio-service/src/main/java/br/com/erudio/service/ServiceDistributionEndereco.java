package br.com.erudio.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.erudio.utils.database.beans.BeanEndereco;
import br.com.erudio.utils.database.interfaces.IEnderecoService;
import br.com.erudio.utils.service.interfaces.IEnderecoUtilServices;

@Named
public class ServiceDistributionEndereco implements IEnderecoUtilServices {

    private final Logger logger = Logger.getLogger(getClass());
    @Inject
    private IEnderecoService enderecoService;

    @Override
    public Integer saveEndereco(BeanEndereco endereco) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Salvando o endereco de nome " + endereco.getNomeLogradouro()+ " e ID " + endereco.getIdEndereco()+".");
        }
        return this.enderecoService.save(endereco);
    }

    @Override
    public void updateEndereco(BeanEndereco endereco) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Atualizando o endereco com o ID " + endereco.getIdEndereco()+".");
        }
        this.enderecoService.update(endereco);
    }

    @Override
    public void deleteEndereco(BeanEndereco endereco) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Deletando o endereco com o ID " + endereco.getIdEndereco()+".");
        }
        this.enderecoService.delete(endereco);
    }

    @Override
    public List<BeanEndereco> findAllEnderecos() {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando todos os enderecos");
        }
        return this.enderecoService.findAll();
    }

    @Override
    public BeanEndereco findEnderecoById(Integer id) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando o endereco com o ID " + id + ".");
        }
        return this.enderecoService.findById(id);
    }
}
