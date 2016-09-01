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
@Table(name="tipoendereco")
public class EntityTipoEndereco extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "IdTipoEndereco", nullable = false)
    private Integer idTipoEndereco;
    @Column(name = "DescricaoTipoEndereco", nullable = false, length = 35)
    private String descricaoTipoEndereco;

    @OneToMany(mappedBy = "tipoendereco", fetch = FetchType.LAZY)
    @ForeignKey(name="Endereco_TipoEndereco")
    private List<EntityEndereco> enderecos;

    public EntityTipoEndereco() {
    }

    public String getDescricaoTipoEndereco() {
        return descricaoTipoEndereco;
    }

    public void setDescricaoTipoEndereco(String descricaoTipoEndereco) {
        this.descricaoTipoEndereco = descricaoTipoEndereco;
    }

    public List<EntityEndereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EntityEndereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Integer getIdTipoEndereco() {
        return idTipoEndereco;
    }

    public void setIdTipoEndereco(Integer idTipoEndereco) {
        this.idTipoEndereco = idTipoEndereco;
    }

}
