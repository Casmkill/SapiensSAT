package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Estudiante;
import com.moisat.persistence.entities.dao.EstudianteDao;

public class EstudianteService {

	
	
    private static EstudianteDao estudianteDao;

    public EstudianteService() {

        estudianteDao = new EstudianteDao();

    }

 

    public void persist(Estudiante entity) {

        estudianteDao.openCurrentSessionwithTransaction();

        estudianteDao.persist(entity);

        estudianteDao.closeCurrentSessionwithTransaction();

    }



    public void update(Estudiante entity) {

        estudianteDao.openCurrentSessionwithTransaction();

        estudianteDao.update(entity);

        estudianteDao.closeCurrentSessionwithTransaction();

    }

 

    public Estudiante findById(Long id) {

        estudianteDao.openCurrentSession();

        Estudiante estudiante = estudianteDao.findById(id);

        estudianteDao.closeCurrentSession();

        return estudiante;

    }

 

    public void delete(Long id) {

        estudianteDao.openCurrentSessionwithTransaction();

        Estudiante estudiante = estudianteDao.findById(id);

        estudianteDao.delete(estudiante);

        estudianteDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Estudiante> findAll() {

        estudianteDao.openCurrentSession();

        List<Estudiante> estudiantees = estudianteDao.findAll();

        estudianteDao.closeCurrentSession();

        return estudiantees;

    }

 

    public void deleteAll() {

        estudianteDao.openCurrentSessionwithTransaction();

        estudianteDao.deleteAll();

        estudianteDao.closeCurrentSessionwithTransaction();

    }

 

    public EstudianteDao estudianteDao() {

        return estudianteDao;

    }

}
