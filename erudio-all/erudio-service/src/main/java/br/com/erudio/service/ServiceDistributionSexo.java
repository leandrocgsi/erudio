package br.com.erudio.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.erudio.utils.database.beans.BeanSexo;
import br.com.erudio.utils.database.interfaces.ISexoService;
import br.com.erudio.utils.service.interfaces.ISexoUtilServices;

@Named
public class ServiceDistributionSexo implements ISexoUtilServices {

    private final Logger logger = Logger.getLogger(getClass());
    @Inject
    private ISexoService sexoService;

    @Override
    public Integer saveSexo(BeanSexo sexo) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Salvando o sexo de nome " + sexo.getDescricaoSexo() + " e ID " + sexo.getIdSexo()+".");
        }
        return this.sexoService.save(sexo);
    }

    @Override
    public void updateSexo(BeanSexo sexo) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Atualizando o sexo com o ID " + sexo.getIdSexo()+".");
        }
        this.sexoService.update(sexo);
    }

    @Override
    public void deleteSexo(BeanSexo sexo) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Deletando o sexo com o ID " + sexo.getIdSexo()+".");
        }
        this.sexoService.delete(sexo);
    }

    @Override
    public List<BeanSexo> findAllSexos() {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando todos os sexos");
        }
        return this.sexoService.findAll();
    }

    @Override
    public BeanSexo findSexoById(Integer id) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Buscando a sexo com o ID " + id + ".");
        }
        return this.sexoService.findById(id);
    }
}
