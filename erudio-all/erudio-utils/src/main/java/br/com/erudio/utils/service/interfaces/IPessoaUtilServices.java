package br.com.erudio.utils.service.interfaces;

import java.util.List;

import br.com.erudio.utils.database.beans.BeanPessoa;

public interface IPessoaUtilServices {

    Integer savePessoa(BeanPessoa pessoa);
    void updatePessoa(BeanPessoa pessoa);
    void deletePessoa(BeanPessoa pessoa);
    List<BeanPessoa> findAllPessoas();
    BeanPessoa findPessoaById(Integer id);
    List<BeanPessoa> findPessoaByLogin(String username);
}
