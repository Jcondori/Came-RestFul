package com.came.dao.impl;

import com.came.dao.ITipoprogDao;
import com.came.model.TipoprogEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class ImplTipoprogDao implements ITipoprogDao {

    @PersistenceContext(unitName = "CamePU")
    public EntityManager em;

    @Override
    public List<TipoprogEntity> listarTipoPrograma() {
        List<TipoprogEntity> lista;
        try {
            Query query = this.em.createQuery("select a from TipoprogEntity a ORDER BY a.codtippg asc ");
            lista = query.getResultList();
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }

    @Override
    public TipoprogEntity obtenerTipoPrograma(int Codigo) {
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
        }
    }

    @Override
    public void agregar(TipoprogEntity model) {
        try{
            this.em.persist(model);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public void modificar(TipoprogEntity model) {

    }

}
