package br.com.erudio.utils.database.interfaces;

public interface IDatabaseService {
	public ICidadeService getCidadeService();
	public IEnderecoService getEnderecoService();
	public IPessoaService getPessoaService();
	public ISexoService getSexoService();
	public ITipoEnderecoService getTipoEnderecoService();
	public ITipoLogradouroService getTipoLogradouroService();
}
