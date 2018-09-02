package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Carrera;
import com.moisat.persistence.entities.dao.CarreraDao;

public class CarreraService {

	
	
    private static CarreraDao carreraDao;

    public CarreraService() {

        carreraDao = new CarreraDao();

    }

 

    public void persist(Carrera entity) {

        carreraDao.openCurrentSessionwithTransaction();

        carreraDao.persist(entity);

        carreraDao.closeCurrentSessionwithTransaction();

    }



    public void update(Carrera entity) {

        carreraDao.openCurrentSessionwithTransaction();

        carreraDao.update(entity);

        carreraDao.closeCurrentSessionwithTransaction();

    }

 

    public Carrera findById(Long id) {

        carreraDao.openCurrentSession();

        Carrera carrera = carreraDao.findById(id);

        carreraDao.closeCurrentSession();

        return carrera;

    }

 

    public void delete(Long id) {

        carreraDao.openCurrentSessionwithTransaction();

        Carrera carrera = carreraDao.findById(id);

        carreraDao.delete(carrera);

        carreraDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Carrera> findAll() {

        carreraDao.openCurrentSession();

        List<Carrera> carreras = carreraDao.findAll();

        carreraDao.closeCurrentSession();

        return carreras;

    }

 

    public void deleteAll() {

        carreraDao.openCurrentSessionwithTransaction();

        carreraDao.deleteAll();

        carreraDao.closeCurrentSessionwithTransaction();

    }

 

    public CarreraDao carreraDao() {

        return carreraDao;

    }

}
