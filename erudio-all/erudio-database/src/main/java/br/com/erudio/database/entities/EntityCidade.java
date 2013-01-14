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
    @Column(name = "Nome", nullable = false, length = 100)
    private String nome;
    @Column(name = "Sigla", length = 2)
    private String sigla;
    @Column(name = "Estado", length = 30)
    private String estado;

    @OneToMany(mappedBy = "cidade", fetch = FetchType.LAZY)
    @ForeignKey(name="Endereco_Cidade")
    private List<EntityEndereco> enderecos;

    public EntityCidade() {
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<EntityEndereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EntityEndereco> enderecos) {
        this.enderecos = enderecos;
    }

}
