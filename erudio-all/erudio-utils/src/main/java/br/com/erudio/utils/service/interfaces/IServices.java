package br.com.erudio.utils.service.interfaces;

import java.util.List;

import br.com.erudio.utils.database.beans.BeanCidade;

public interface IServices {

	public List<BeanCidade> findAllCidades();
}
