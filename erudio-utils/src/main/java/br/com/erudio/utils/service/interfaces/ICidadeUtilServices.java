package br.com.erudio.utils.service.interfaces;

import java.util.List;

import br.com.erudio.utils.database.beans.BeanCidade;

public interface ICidadeUtilServices {

    Integer saveCidade(BeanCidade cidade);
    void updateCidade(BeanCidade cidade);
    void deleteCidade(BeanCidade cidade);
    List<BeanCidade> findAllCidades();
    BeanCidade findCidadeById(Integer id);
}
