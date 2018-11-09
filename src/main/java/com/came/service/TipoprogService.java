package com.came.service;

import com.came.dao.ImplTipoprogDao;
import com.came.model.TipoprogEntity;

import java.util.List;

public class TipoprogService extends ImplTipoprogDao {

    @Override
    public List<TipoprogEntity> listarTipoPrograma() {
        return super.listarTipoPrograma();
    }

    @Override
    public TipoprogEntity obtenerTipoPrograma(int Codigo) {
        return super.obtenerTipoPrograma(Codigo);
    }
}
