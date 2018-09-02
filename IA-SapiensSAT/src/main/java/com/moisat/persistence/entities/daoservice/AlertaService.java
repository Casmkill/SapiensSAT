package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Alerta;
import com.moisat.persistence.entities.dao.AlertaDao;

public class AlertaService {
	

	
	
    private static AlertaDao alertaDao;

    public AlertaService() {

        alertaDao = new AlertaDao();

    }

 

    public void persist(Alerta entity) {

        alertaDao.openCurrentSessionwithTransaction();

        alertaDao.persist(entity);

        alertaDao.closeCurrentSessionwithTransaction();

    }



    public void update(Alerta entity) {

        alertaDao.openCurrentSessionwithTransaction();

        alertaDao.update(entity);

        alertaDao.closeCurrentSessionwithTransaction();

    }

 

    public Alerta findById(Long id) {

        alertaDao.openCurrentSession();

        Alerta alerta = alertaDao.findById(id);

        alertaDao.closeCurrentSession();

        return alerta;

    }

 

    public void delete(Long id) {

        alertaDao.openCurrentSessionwithTransaction();

        Alerta alerta = alertaDao.findById(id);

        alertaDao.delete(alerta);

        alertaDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Alerta> findAll() {

        alertaDao.openCurrentSession();

        List<Alerta> alertaes = alertaDao.findAll();

        alertaDao.closeCurrentSession();

        return alertaes;

    }

 

    public void deleteAll() {

        alertaDao.openCurrentSessionwithTransaction();

        alertaDao.deleteAll();

        alertaDao.closeCurrentSessionwithTransaction();

    }

 

    public AlertaDao alertaDao() {

        return alertaDao;

    }


}
