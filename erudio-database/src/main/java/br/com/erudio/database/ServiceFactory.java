package br.com.erudio.database;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.erudio.utils.database.interfaces.ICidadeService;
import br.com.erudio.utils.database.interfaces.IDatabaseService;
import br.com.erudio.utils.database.interfaces.IEnderecoService;
import br.com.erudio.utils.database.interfaces.IPessoaService;
import br.com.erudio.utils.database.interfaces.ISexoService;
import br.com.erudio.utils.database.interfaces.ITipoEnderecoService;
import br.com.erudio.utils.database.interfaces.ITipoLogradouroService;

@Named
public class ServiceFactory implements IDatabaseService {

	@Inject
	public ICidadeService cidadeService;

	@Inject
	public IEnderecoService enderecoService;

	@Inject
	public IPessoaService pessoaService;

	@Inject
	public ISexoService sexoService;

	@Inject
	public ITipoEnderecoService tipoEnderecoService;

	@Inject
	public ITipoLogradouroService tipoLogradouroService;

	@Override
	public ICidadeService getCidadeService() {
		return this.cidadeService;
	}

	@Override
	public IEnderecoService getEnderecoService() {
		return this.enderecoService;
	}

	@Override
	public IPessoaService getPessoaService() {
		return this.pessoaService;
	}

	@Override
	public ISexoService getSexoService() {
		return this.sexoService;
	}

	@Override
	public ITipoEnderecoService getTipoEnderecoService() {
		return this.tipoEnderecoService;
	}

	@Override
	public ITipoLogradouroService getTipoLogradouroService() {
		return this.tipoLogradouroService;
	}

}
