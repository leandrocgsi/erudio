package br.com.erudio.database.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ForeignKey;

import br.com.erudio.database.utils.BaseEntity;

@Entity
@Table(name="pessoa")
public class EntityPessoa extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="IdPessoa")
    private Integer idPessoa;
    @Column(name="NomePessoa", nullable=false, length=120)
    private String nomePessoa;
    @Column(name = "CPF", length = 14)
    private String cpf;
    @Column(name = "RG", length = 16)
    private String rg;
    @Temporal(TemporalType.DATE)
    @Column(name = "DataCadastro")
    private Date dataCadastro;
    @Temporal(TemporalType.DATE)
    @Column(name = "DataDesvinculacao")
    private Date dataDesvinculacao;
    @Column(name = "Responsavel", length = 100)
    private String responsavel;
    @Column(name = "EMail1", length = 140)
    private String email1;
    @Column(name = "EMail2",length = 140)
    private String email2;
    @Column(name = "Telefone1", length = 20)
    private String telefone1;
    @Column(name = "Telefone2", length=20)
    private String telefone2;
    @Column(name = "TipoPessoa", length=20,insertable=false, updatable=false)
    private String tipoPessoa;
    @Column(name = "OutrasInformacoes", length = 600)
    private String outrasInformacoes;
    @Column(name = "Pai", length = 130)
    private String pai;
    @Column(name = "Mae", length = 130)
    private String mae;
    @Column(name = "Naturalidade", length = 130)
    private String naturalidade;
    @Temporal(TemporalType.DATE)
    @Column(name = "DataNascimento")
    private Date dataNascimento;

    @OneToOne(mappedBy = "pessoa", fetch = FetchType.LAZY)
    @ForeignKey(name="Pessoa_Possui_Endereco")
    private EntityEndereco endereco;

    @ManyToOne(optional=true)
    @ForeignKey(name="PessoaSexo")
    @JoinColumn(name="IdSexo", referencedColumnName="IdSexo")
    private final EntitySexo sexo;

    public EntityPessoa() {
        this.sexo = new EntitySexo();
    }

    public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataDesvinculacao() {
		return dataDesvinculacao;
	}

	public void setDataDesvinculacao(Date dataDesvinculacao) {
		this.dataDesvinculacao = dataDesvinculacao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}

	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EntityEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(EntityEndereco endereco) {
		this.endereco = endereco;
	}

	public EntitySexo getSexo() {
		return sexo;
	}

}