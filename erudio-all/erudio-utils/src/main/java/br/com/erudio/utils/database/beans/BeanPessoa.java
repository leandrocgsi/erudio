package br.com.erudio.utils.database.beans;

import java.util.Date;

import br.com.erudio.utils.beans.BaseBean;

public class BeanPessoa extends BaseBean{

    private static final long serialVersionUID = 1L;

    private Integer idPessoa;
    private String nomePessoa;
    private String cpf;
    private String rg;
    private Date dataCadastro;
    private Date dataDesvinculacao;
    private String responsavel;
    private String email1;
    private String email2;
    private String telefone1;
    private String telefone2;
    private String tipoPessoa;
    private String outrasInformacoes;
    private String pai;
    private String mae;
    private String naturalidade;
    private Date dataNascimento;

    private BeanEndereco endereco;

    private final BeanSexo sexo;

    public BeanPessoa() {
        this.sexo = new BeanSexo();
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

	public BeanEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(BeanEndereco endereco) {
		this.endereco = endereco;
	}

	public BeanSexo getSexo() {
		return sexo;
	}

}