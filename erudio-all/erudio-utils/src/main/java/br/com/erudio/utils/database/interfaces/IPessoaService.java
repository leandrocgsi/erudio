package br.com.erudio.utils.database.interfaces;

import br.com.erudio.utils.database.beans.BeanPessoa;
import java.util.List;

public interface IPessoaService extends IServiceBase<BeanPessoa, Integer> {

    public List<BeanPessoa> findByLogin(String username);
}
