package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Profesor;
import com.moisat.persistence.entities.dao.ProfesorDao;

public class ProfesorService {

	
	
    private static ProfesorDao profesorDao;

    public ProfesorService() {

        profesorDao = new ProfesorDao();

    }

 

    public void persist(Profesor entity) {

        profesorDao.openCurrentSessionwithTransaction();

        profesorDao.persist(entity);

        profesorDao.closeCurrentSessionwithTransaction();

    }



    public void update(Profesor entity) {

        profesorDao.openCurrentSessionwithTransaction();

        profesorDao.update(entity);

        profesorDao.closeCurrentSessionwithTransaction();

    }

 

    public Profesor findById(Long id) {

        profesorDao.openCurrentSession();

        Profesor profesor = profesorDao.findById(id);

        profesorDao.closeCurrentSession();

        return profesor;

    }

 

    public void delete(Long id) {

        profesorDao.openCurrentSessionwithTransaction();

        Profesor profesor = profesorDao.findById(id);

        profesorDao.delete(profesor);

        profesorDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Profesor> findAll() {

        profesorDao.openCurrentSession();

        List<Profesor> profesores = profesorDao.findAll();

        profesorDao.closeCurrentSession();

        return profesores;

    }

 

    public void deleteAll() {

        profesorDao.openCurrentSessionwithTransaction();

        profesorDao.deleteAll();

        profesorDao.closeCurrentSessionwithTransaction();

    }

 

    public ProfesorDao profesorDao() {

        return profesorDao;

    }

}
