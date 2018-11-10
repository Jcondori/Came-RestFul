package com.came.service;

import com.came.dao.ITipoprogDao;
import com.came.dao.impl.ImplTipoprogDao;
import com.came.model.TipoprogEntity;
import com.came.service.impl.ITipoprogService;

import javax.ejb.EJB;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

public class ImplTipoprogService implements ITipoprogService, Serializable {

    @EJB
    private ITipoprogDao dao;

    @Override
    public List<TipoprogEntity> listarTipoPrograma() {
        return dao.listarTipoPrograma();
    }

    @Override
    public TipoprogEntity obtenerTipoPrograma(int Codigo) {
        return dao.obtenerTipoPrograma(Codigo);
    }

    @Override
    public void agregar(TipoprogEntity model) {
        dao.agregar(model);
    }

    @Override
    public void modificar(TipoprogEntity model) {

    }
}
