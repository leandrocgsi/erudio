package br.com.erudio.utils.service.interfaces;

import java.util.List;

import br.com.erudio.utils.database.beans.BeanSexo;

public interface ISexoUtilServices {

    Integer saveSexo(BeanSexo sexo);
    void updateSexo(BeanSexo sexo);
    void deleteSexo(BeanSexo sexo);
    List<BeanSexo> findAllSexos();
    BeanSexo findSexoById(Integer id);
}
