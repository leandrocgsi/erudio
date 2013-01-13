package br.com.erudio.utils.database.beans;

import java.util.List;

import br.com.erudio.utils.beans.BaseBean;

public class BeanSexo extends BaseBean{

    private static final long serialVersionUID = 1L;

    private Integer idSexo;
    private String descricaoSexo;

    private List<BeanPessoa> pessoas;

    public BeanSexo() {

    }

    public String getDescricaoSexo() {
        return descricaoSexo;
    }

    public void setDescricaoSexo(String descricaoSexo) {
        this.descricaoSexo = descricaoSexo;
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public List<BeanPessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<BeanPessoa> pessoas) {
        this.pessoas = pessoas;
    }

}
