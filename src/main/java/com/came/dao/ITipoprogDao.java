package com.came.dao;

import com.came.model.TipoprogEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ITipoprogDao {

    List<TipoprogEntity> listarTipoPrograma();

    TipoprogEntity obtenerTipoPrograma(int Codigo);

    void agregar(TipoprogEntity model);

    void modificar(TipoprogEntity model);

}
