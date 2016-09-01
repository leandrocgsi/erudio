package br.com.erudio.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import br.com.erudio.database.utils.BaseEntity;

@Entity
@Table(name="endereco")
public class EntityEndereco extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "IdEndereco", nullable = false)
    private Integer idEndereco;
    @Column(name = "Bairro", length = 120)
    private String bairro;
    @Column(name = "NomeLogradouro", nullable = false, length = 120)
    private String nomeLogradouro;
    @Column(name = "CEP", nullable = false, length = 9)
    private String cep;
    @Column(name = "Numero", nullable = false, length = 8)
    private String numero;
    @Column(name = "Complemento", length = 40)
    private String complemento;
    @Column(name = "Pais", length = 30)
    private String pais;
    @Column(name = "Observacao", length = 200)
    private String observacao;

    @OneToOne(optional=false, fetch = FetchType.LAZY)
    @ForeignKey(name="Pessoa_Possui_Endereco")
    @JoinColumn(name = "IdPessoa", referencedColumnName="IdPessoa")
    private EntityPessoa pessoa;

    @ManyToOne(optional=false, fetch = FetchType.EAGER)
    @ForeignKey(name="Endereco_TipoLogradouro")
    @JoinColumn(name = "IdTipoLogradouro", referencedColumnName="IdTipoLogradouro")
    private EntityTipoLogradouro tipologradouro;

    @ManyToOne(optional=false, fetch = FetchType.EAGER)
    @ForeignKey(name="Endereco_TipoEndereco")
    @JoinColumn(name = "IdTipoEndereco", referencedColumnName="IdTipoEndereco")
    private EntityTipoEndereco tipoendereco;

    @ManyToOne(optional=false, fetch = FetchType.EAGER)
    @ForeignKey(name="Endereco_Cidade")
    @JoinColumn(name = "IdCidade", referencedColumnName="IdCidade")
    private EntityCidade cidade;

    public EntityEndereco() {
        this.cidade = new EntityCidade();
        this.tipoendereco = new EntityTipoEndereco();
        this.tipologradouro = new EntityTipoLogradouro();
        this.pessoa =new EntityPessoa();
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

    public EntityCidade getCidade() {
        return cidade;
    }

    public void setCidade(EntityCidade cidade) {
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

    public EntityPessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(EntityPessoa pessoa) {
        this.pessoa = pessoa;
    }

    public EntityTipoEndereco getTipoendereco() {
        return tipoendereco;
    }

    public void setTipoendereco(EntityTipoEndereco tipoendereco) {
        this.tipoendereco = tipoendereco;
    }

    public EntityTipoLogradouro getTipologradouro() {
        return tipologradouro;
    }

    public void setTipologradouro(EntityTipoLogradouro tipologradouro) {
        this.tipologradouro = tipologradouro;
    }

}
