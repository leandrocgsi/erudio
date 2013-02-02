package br.com.erudio.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.erudio.utils.database.beans.BeanPessoa;
import br.com.erudio.utils.database.interfaces.IPessoaService;
import br.com.erudio.utils.service.interfaces.IPessoaUtilServices;

@Named
public class ServiceDistributionPessoa implements IPessoaUtilServices {

    private final Logger logger = Logger.getLogger(getClass());
    @Inject
    private IPessoaService pessoaService;

    @Override
    public Integer savePessoa(BeanPessoa pessoa) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Salvando a pessoa de nome " + pessoa.getNomePessoa() + " e ID " + pessoa.getIdPessoa() + ".");
        }
        return this.pessoaService.save(pessoa);
    }

    @Override
    public void updatePessoa(BeanPessoa pessoa) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Atualizando a pessoa com o ID " + pessoa.getIdPessoa() + ".");
        }
        this.pessoaService.update(pessoa);
    }

    @Override
    public void deletePessoa(BeanPessoa pessoa) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Deletando a pessoa com o ID " + pessoa.getIdPessoa() + ".");
        }
        this.pessoaService.delete(pessoa);
    }

    @Override
    public List<BeanPessoa> findAllPessoas() {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando todas as pessoas");
        }
        return this.pessoaService.findAll();
    }

    @Override
    public BeanPessoa findPessoaById(Integer id) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando a pessoa com o ID " + id + ".");
        }
        return this.pessoaService.findById(id);
    }

    @Override
    public List<BeanPessoa> findPessoaByLogin(String username) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando a pessoa pelo login \"" + username + "\".");
        }
        return this.pessoaService.findByLogin(username);
    }
}
