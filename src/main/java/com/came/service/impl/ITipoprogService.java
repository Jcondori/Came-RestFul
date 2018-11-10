package com.came.service.impl;

import com.came.model.TipoprogEntity;

import java.util.List;

public interface ITipoprogService {

    List<TipoprogEntity> listarTipoPrograma();

    TipoprogEntity obtenerTipoPrograma(int Codigo);

    void agregar(TipoprogEntity model);

    void modificar(TipoprogEntity model);

}
