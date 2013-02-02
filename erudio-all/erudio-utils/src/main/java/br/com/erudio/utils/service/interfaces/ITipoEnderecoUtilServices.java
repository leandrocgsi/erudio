package br.com.erudio.utils.service.interfaces;

import java.util.List;

import br.com.erudio.utils.database.beans.BeanTipoEndereco;

public interface ITipoEnderecoUtilServices {

    Integer saveTipoEndereco(BeanTipoEndereco tipoEndereco);
    void updateTipoEndereco(BeanTipoEndereco tipoEndereco);
    void deleteTipoEndereco(BeanTipoEndereco tipoEndereco);
    List<BeanTipoEndereco> findAllTipoEnderecos();
    BeanTipoEndereco findTipoEnderecoById(Integer id);
}
