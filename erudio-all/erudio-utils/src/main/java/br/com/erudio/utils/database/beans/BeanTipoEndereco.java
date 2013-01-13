package br.com.erudio.utils.database.beans;

import java.util.List;

import br.com.erudio.utils.beans.BaseBean;

public class BeanTipoEndereco extends BaseBean{

    private static final long serialVersionUID = 1L;

    private Integer idTipoEndereco;
    private String descricaoTipoEndereco;

    private List<BeanEndereco> enderecos;

    public BeanTipoEndereco() {
    }

    public String getDescricaoTipoEndereco() {
        return descricaoTipoEndereco;
    }

    public void setDescricaoTipoEndereco(String descricaoTipoEndereco) {
        this.descricaoTipoEndereco = descricaoTipoEndereco;
    }

    public List<BeanEndereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<BeanEndereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Integer getIdTipoEndereco() {
        return idTipoEndereco;
    }

    public void setIdTipoEndereco(Integer idTipoEndereco) {
        this.idTipoEndereco = idTipoEndereco;
    }

}
