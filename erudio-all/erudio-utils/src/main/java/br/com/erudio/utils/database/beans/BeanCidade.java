package br.com.erudio.utils.database.beans;

import java.util.List;

import br.com.erudio.utils.beans.BaseBean;

public class BeanCidade extends BaseBean{

    private static final long serialVersionUID = 1L;

    private Integer idCidade;
    private String nomeCidade;
    private String sigla;
    private String uf;
    private String pais;

    private List<BeanEndereco> enderecos;

    public BeanCidade() {
    }

    public List<BeanEndereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<BeanEndereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
