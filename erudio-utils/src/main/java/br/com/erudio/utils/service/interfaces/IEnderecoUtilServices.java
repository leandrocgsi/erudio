package br.com.erudio.utils.service.interfaces;

import java.util.List;

import br.com.erudio.utils.database.beans.BeanEndereco;

public interface IEnderecoUtilServices {

    Integer saveEndereco(BeanEndereco endereco);
    void updateEndereco(BeanEndereco endereco);
    void deleteEndereco(BeanEndereco endereco);
    List<BeanEndereco> findAllEnderecos();
    BeanEndereco findEnderecoById(Integer id);
}
