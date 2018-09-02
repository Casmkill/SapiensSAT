package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Asignatura;
import com.moisat.persistence.entities.dao.AsignaturaDao;

public class AsignaturaService {

	
	
    private static AsignaturaDao asignaturaDao;

    public AsignaturaService() {

        asignaturaDao = new AsignaturaDao();

    }

 

    public void persist(Asignatura entity) {

        asignaturaDao.openCurrentSessionwithTransaction();

        asignaturaDao.persist(entity);

        asignaturaDao.closeCurrentSessionwithTransaction();

    }



    public void update(Asignatura entity) {

        asignaturaDao.openCurrentSessionwithTransaction();

        asignaturaDao.update(entity);

        asignaturaDao.closeCurrentSessionwithTransaction();

    }

 

    public Asignatura findById(Long id) {

        asignaturaDao.openCurrentSession();

        Asignatura asignatura = asignaturaDao.findById(id);

        asignaturaDao.closeCurrentSession();

        return asignatura;

    }

 

    public void delete(Long id) {

        asignaturaDao.openCurrentSessionwithTransaction();

        Asignatura asignatura = asignaturaDao.findById(id);

        asignaturaDao.delete(asignatura);

        asignaturaDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Asignatura> findAll() {

        asignaturaDao.openCurrentSession();

        List<Asignatura> asignaturaes = asignaturaDao.findAll();

        asignaturaDao.closeCurrentSession();

        return asignaturaes;

    }

 

    public void deleteAll() {

        asignaturaDao.openCurrentSessionwithTransaction();

        asignaturaDao.deleteAll();

        asignaturaDao.closeCurrentSessionwithTransaction();

    }

 

    public AsignaturaDao asignaturaDao() {

        return asignaturaDao;

    }

}
