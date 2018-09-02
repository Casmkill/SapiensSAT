package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.FactorRiesgo;
import com.moisat.persistence.entities.dao.FactorRiesgoDao;

public class FactorRiesgoService {

	
	
    private static FactorRiesgoDao factorRiesgoDao;

    public FactorRiesgoService() {

        factorRiesgoDao = new FactorRiesgoDao();

    }

 

    public void persist(FactorRiesgo entity) {

        factorRiesgoDao.openCurrentSessionwithTransaction();

        factorRiesgoDao.persist(entity);

        factorRiesgoDao.closeCurrentSessionwithTransaction();

    }



    public void update(FactorRiesgo entity) {

        factorRiesgoDao.openCurrentSessionwithTransaction();

        factorRiesgoDao.update(entity);

        factorRiesgoDao.closeCurrentSessionwithTransaction();

    }

 

    public FactorRiesgo findById(Long id) {

        factorRiesgoDao.openCurrentSession();

        FactorRiesgo factorRiesgo = factorRiesgoDao.findById(id);

        factorRiesgoDao.closeCurrentSession();

        return factorRiesgo;

    }

 

    public void delete(Long id) {

        factorRiesgoDao.openCurrentSessionwithTransaction();

        FactorRiesgo factorRiesgo = factorRiesgoDao.findById(id);

        factorRiesgoDao.delete(factorRiesgo);

        factorRiesgoDao.closeCurrentSessionwithTransaction();

    }

 

    public List<FactorRiesgo> findAll() {

        factorRiesgoDao.openCurrentSession();

        List<FactorRiesgo> factoresRiesgo = factorRiesgoDao.findAll();

        factorRiesgoDao.closeCurrentSession();

        return factoresRiesgo;

    }

 

    public void deleteAll() {

        factorRiesgoDao.openCurrentSessionwithTransaction();

        factorRiesgoDao.deleteAll();

        factorRiesgoDao.closeCurrentSessionwithTransaction();

    }

 

    public FactorRiesgoDao factorRiesgoDao() {

        return factorRiesgoDao;

    }

}
