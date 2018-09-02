package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Intervencion;
import com.moisat.persistence.entities.dao.IntervencionDao;

public class IntervencionService {

	
	
    private static IntervencionDao intervencionDao;

    public IntervencionService() {

        intervencionDao = new IntervencionDao();

    }

 

    public void persist(Intervencion entity) {

        intervencionDao.openCurrentSessionwithTransaction();

        intervencionDao.persist(entity);

        intervencionDao.closeCurrentSessionwithTransaction();

    }



    public void update(Intervencion entity) {

        intervencionDao.openCurrentSessionwithTransaction();

        intervencionDao.update(entity);

        intervencionDao.closeCurrentSessionwithTransaction();

    }

 

    public Intervencion findById(Long id) {

        intervencionDao.openCurrentSession();

        Intervencion intervencion = intervencionDao.findById(id);

        intervencionDao.closeCurrentSession();

        return intervencion;

    }

 

    public void delete(Long id) {

        intervencionDao.openCurrentSessionwithTransaction();

        Intervencion intervencion = intervencionDao.findById(id);

        intervencionDao.delete(intervencion);

        intervencionDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Intervencion> findAll() {

        intervencionDao.openCurrentSession();

        List<Intervencion> intervenciones = intervencionDao.findAll();

        intervencionDao.closeCurrentSession();

        return intervenciones;

    }

 

    public void deleteAll() {

        intervencionDao.openCurrentSessionwithTransaction();

        intervencionDao.deleteAll();

        intervencionDao.closeCurrentSessionwithTransaction();

    }

 

    public IntervencionDao intervencionDao() {

        return intervencionDao;

    }

}
