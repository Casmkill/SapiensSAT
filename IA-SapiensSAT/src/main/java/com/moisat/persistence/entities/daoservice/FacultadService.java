package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Facultad;
import com.moisat.persistence.entities.dao.FacultadDao;

public class FacultadService {

	
	
    private static FacultadDao facultadDao;

    public FacultadService() {

        facultadDao = new FacultadDao();

    }

 

    public void persist(Facultad entity) {

        facultadDao.openCurrentSessionwithTransaction();

        facultadDao.persist(entity);

        facultadDao.closeCurrentSessionwithTransaction();

    }



    public void update(Facultad entity) {

        facultadDao.openCurrentSessionwithTransaction();

        facultadDao.update(entity);

        facultadDao.closeCurrentSessionwithTransaction();

    }

 

    public Facultad findById(String id) {

        facultadDao.openCurrentSession();

        Facultad facultad = facultadDao.findById(id);

        facultadDao.closeCurrentSession();

        return facultad;

    }

 

    public void delete(String id) {

        facultadDao.openCurrentSessionwithTransaction();

        Facultad facultad = facultadDao.findById(id);

        facultadDao.delete(facultad);

        facultadDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Facultad> findAll() {

        facultadDao.openCurrentSession();

        List<Facultad> facultades = facultadDao.findAll();

        facultadDao.closeCurrentSession();

        return facultades;

    }

 

    public void deleteAll() {

        facultadDao.openCurrentSessionwithTransaction();

        facultadDao.deleteAll();

        facultadDao.closeCurrentSessionwithTransaction();

    }

 

    public FacultadDao facultadDao() {

        return facultadDao;

    }

}
