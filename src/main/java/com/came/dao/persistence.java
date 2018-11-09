package com.came.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class persistence {

    public EntityManager em;
    public EntityManagerFactory emf;

    public void conectar(){
        emf = Persistence.createEntityManagerFactory("CamePersistence");
        em = emf.createEntityManager();
    }

    public void cerrar(){
        em.close();
        emf.close();
    }

}
