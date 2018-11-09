package com.came.interfaces;

import com.came.model.TipoprogEntity;

import java.util.List;

public interface TipoprogDao {

    List<TipoprogEntity> listarTipoPrograma();

    TipoprogEntity obtenerTipoPrograma(int Codigo);

}
