package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Clase;
import com.moisat.persistence.entities.dao.ClaseDao;

public class ClaseService {

	
	
    private static ClaseDao claseDao;

    public ClaseService() {

        claseDao = new ClaseDao();

    }

 

    public void persist(Clase entity) {

        claseDao.openCurrentSessionwithTransaction();

        claseDao.persist(entity);

        claseDao.closeCurrentSessionwithTransaction();

    }



    public void update(Clase entity) {

        claseDao.openCurrentSessionwithTransaction();

        claseDao.update(entity);

        claseDao.closeCurrentSessionwithTransaction();

    }

 

    public Clase findById(Long id) {

        claseDao.openCurrentSession();

        Clase clase = claseDao.findById(id);

        claseDao.closeCurrentSession();

        return clase;

    }

 

    public void delete(Long id) {

        claseDao.openCurrentSessionwithTransaction();

        Clase clase = claseDao.findById(id);

        claseDao.delete(clase);

        claseDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Clase> findAll() {

        claseDao.openCurrentSession();

        List<Clase> clases = claseDao.findAll();

        claseDao.closeCurrentSession();

        return clases;

    }

 

    public void deleteAll() {

        claseDao.openCurrentSessionwithTransaction();

        claseDao.deleteAll();

        claseDao.closeCurrentSessionwithTransaction();

    }

 

    public ClaseDao claseDao() {

        return claseDao;

    }

}
