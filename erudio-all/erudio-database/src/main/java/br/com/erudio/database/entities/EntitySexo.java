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
@Table(name="sexo")
public class EntitySexo extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "IdSexo", unique = true, nullable = false)
    private Integer idSexo;
    @Column(name = "DescricaoSexo", nullable = false, length = 10)
    private String descricaoSexo;

    @OneToMany(mappedBy = "sexo", fetch = FetchType.LAZY)
    @ForeignKey(name="PessoaSexo")
    private List<EntityPessoa> pessoas;

    public EntitySexo() {

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

    public List<EntityPessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<EntityPessoa> pessoas) {
        this.pessoas = pessoas;
    }

}
