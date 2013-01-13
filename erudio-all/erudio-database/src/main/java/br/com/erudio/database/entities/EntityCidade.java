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
@Table(name="cidade")
public class EntityCidade extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "IdCidade", nullable = false)
    private Integer idCidade;
    @Column(name = "NomeCidade", nullable = false, length = 100)
    private String nomeCidade;
    @Column(name = "Sigla", nullable = false, length = 2)
    private String sigla;
    @Column(name = "UF", nullable = false, length = 30)
    private String uf;
    @Column(name = "Pais", nullable = false, length = 60)
    private String pais;

    @OneToMany(mappedBy = "cidade", fetch = FetchType.LAZY)
    @ForeignKey(name="Endereco_Cidade")
    private List<EntityEndereco> enderecos;

    public EntityCidade() {
    }

    public List<EntityEndereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EntityEndereco> enderecos) {
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
