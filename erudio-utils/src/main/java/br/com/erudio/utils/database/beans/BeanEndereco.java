package br.com.erudio.utils.database.beans;

import br.com.erudio.utils.beans.BaseBean;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BeanEndereco extends BaseBean{

    private static final long serialVersionUID = 1L;

    private Integer idEndereco;
    private String bairro;
    private String nomeLogradouro;
    private String cep;
    private String numero;
    private String complemento;
    private String pais;
    private String observacao;

    private BeanPessoa pessoa;

    private BeanTipoLogradouro tipologradouro;

    private BeanTipoEndereco tipoendereco;

    private BeanCidade cidade;

    public BeanEndereco() {
        this.cidade = new BeanCidade();
        this.tipoendereco = new BeanTipoEndereco();
        this.tipologradouro = new BeanTipoLogradouro();
        this.pessoa =new BeanPessoa();
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public BeanCidade getCidade() {
        return cidade;
    }

    public void setCidade(BeanCidade cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public BeanPessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(BeanPessoa pessoa) {
        this.pessoa = pessoa;
    }

    public BeanTipoEndereco getTipoendereco() {
        return tipoendereco;
    }

    public void setTipoendereco(BeanTipoEndereco tipoendereco) {
        this.tipoendereco = tipoendereco;
    }

    public BeanTipoLogradouro getTipologradouro() {
        return tipologradouro;
    }

    public void setTipologradouro(BeanTipoLogradouro tipologradouro) {
        this.tipologradouro = tipologradouro;
    }

}
