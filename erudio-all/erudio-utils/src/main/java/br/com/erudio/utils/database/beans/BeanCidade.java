package br.com.erudio.utils.database.beans;

import java.util.List;

import br.com.erudio.utils.beans.BaseBean;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BeanCidade extends BaseBean{

    private static final long serialVersionUID = 1L;

    private Integer idCidade;
    private String nome;
    private String sigla;
    private String estado;

    private List<BeanEndereco> enderecos;

    public BeanCidade() {
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

	public List<BeanEndereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<BeanEndereco> enderecos) {
		this.enderecos = enderecos;
	}

}
