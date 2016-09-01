package br.com.erudio.utils.database.beans;

import java.util.List;

import br.com.erudio.utils.beans.BaseBean;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BeanTipoLogradouro extends BaseBean{

    private static final long serialVersionUID = 1L;

    private Integer idTipoLogradouro;
    private String descricaoTipoLogradouro;
    private String sigla;
    private List<BeanEndereco> enderecos;

    public BeanTipoLogradouro() {
    }

    public String getDescricaoTipoLogradouro() {
        return descricaoTipoLogradouro;
    }

    public void setDescricaoTipoLogradouro(String descricaoTipoLogradouro) {
        this.descricaoTipoLogradouro = descricaoTipoLogradouro;
    }

    public List<BeanEndereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<BeanEndereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Integer getIdTipoLogradouro() {
        return idTipoLogradouro;
    }

    public void setIdTipoLogradouro(Integer idTipoLogradouro) {
        this.idTipoLogradouro = idTipoLogradouro;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

}
