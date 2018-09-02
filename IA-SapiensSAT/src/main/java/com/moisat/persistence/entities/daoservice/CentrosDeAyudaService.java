package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.CentrosDeAyuda;
import com.moisat.persistence.entities.dao.CentrosDeAyudaDao;

public class CentrosDeAyudaService {

	
	
    private static CentrosDeAyudaDao centrosDeAyudaDao;

    public CentrosDeAyudaService() {

        centrosDeAyudaDao = new CentrosDeAyudaDao();

    }

 

    public void persist(CentrosDeAyuda entity) {

        centrosDeAyudaDao.openCurrentSessionwithTransaction();

        centrosDeAyudaDao.persist(entity);

        centrosDeAyudaDao.closeCurrentSessionwithTransaction();

    }



    public void update(CentrosDeAyuda entity) {

        centrosDeAyudaDao.openCurrentSessionwithTransaction();

        centrosDeAyudaDao.update(entity);

        centrosDeAyudaDao.closeCurrentSessionwithTransaction();

    }

 

    public CentrosDeAyuda findById(Long id) {

        centrosDeAyudaDao.openCurrentSession();

        CentrosDeAyuda centrosDeAyuda = centrosDeAyudaDao.findById(id);

        centrosDeAyudaDao.closeCurrentSession();

        return centrosDeAyuda;

    }

 

    public void delete(Long id) {

        centrosDeAyudaDao.openCurrentSessionwithTransaction();

        CentrosDeAyuda centrosDeAyuda = centrosDeAyudaDao.findById(id);

        centrosDeAyudaDao.delete(centrosDeAyuda);

        centrosDeAyudaDao.closeCurrentSessionwithTransaction();

    }

 

    public List<CentrosDeAyuda> findAll() {

        centrosDeAyudaDao.openCurrentSession();

        List<CentrosDeAyuda> centrosDeAyudas = centrosDeAyudaDao.findAll();

        centrosDeAyudaDao.closeCurrentSession();

        return centrosDeAyudas;

    }

 

    public void deleteAll() {

        centrosDeAyudaDao.openCurrentSessionwithTransaction();

        centrosDeAyudaDao.deleteAll();

        centrosDeAyudaDao.closeCurrentSessionwithTransaction();

    }

 

    public CentrosDeAyudaDao centrosDeAyudaDao() {

        return centrosDeAyudaDao;

    }

}
