package br.com.erudio.database.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import br.com.erudio.database.utils.BaseEntity;

@Entity
@Table(name="tipologradouro")
public class EntityTipoLogradouro extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "IdTipoLogradouro", nullable = false)
    private Integer idTipoLogradouro;
    @Column(name = "DescricaoTipoLogradouro", nullable = false, length = 40)
    private String descricaoTipoLogradouro;
    @Column(name = "Sigla", nullable = false, length = 20)
    private String sigla;

    @OneToMany(mappedBy = "tipologradouro", fetch = FetchType.LAZY)
    @ForeignKey(name="Endereco_TipoLogradouro")
    private List<EntityEndereco> enderecos;

    public EntityTipoLogradouro() {
    }

    public String getDescricaoTipoLogradouro() {
        return descricaoTipoLogradouro;
    }

    public void setDescricaoTipoLogradouro(String descricaoTipoLogradouro) {
        this.descricaoTipoLogradouro = descricaoTipoLogradouro;
    }

    public List<EntityEndereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EntityEndereco> enderecos) {
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
