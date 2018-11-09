package com.came.dao;

import com.came.interfaces.TipoprogDao;
import com.came.model.TipoprogEntity;

import javax.persistence.Query;
import java.util.List;

public class ImplTipoprogDao extends persistence implements TipoprogDao {

    @Override
    public List<TipoprogEntity> listarTipoPrograma() {
        this.conectar();
        List<TipoprogEntity> lista;
        try {
            Query query = this.em.createQuery("select a from TipoprogEntity a");
            lista = query.getResultList();
        } catch (Exception e) {
            throw e;
        }finally {
            this.cerrar();
        }
        return lista;
    }

    @Override
    public TipoprogEntity obtenerTipoPrograma(int Codigo) {
        this.conectar();
        List<TipoprogEntity> lista = null;
        try {
            Query query = this.em.createQuery("select a from TipoprogEntity a where a.codtippg = :codigo");
            query.setParameter("codigo",Codigo);
            lista = query.getResultList();
            if (lista.size() > 0){
                return lista.get(0);
            }
            return null;
        } catch (Exception e) {
            throw e;
        }finally {
            this.cerrar();
        }
    }

}
