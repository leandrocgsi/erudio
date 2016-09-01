package br.com.erudio.utils.service.interfaces;

import java.util.List;

import br.com.erudio.utils.database.beans.BeanTipoLogradouro;

public interface ITipoLogradouroUtilServices {

    Integer saveTipoLogradouro(BeanTipoLogradouro tipoLogradouro);
    void updateTipoLogradouro(BeanTipoLogradouro tipoLogradouro);
    void deleteTipoLogradouro(BeanTipoLogradouro tipoLogradouro);
    List<BeanTipoLogradouro> findAllTipoLogradouros();
    BeanTipoLogradouro findTipoLogradouroById(Integer id);
}
