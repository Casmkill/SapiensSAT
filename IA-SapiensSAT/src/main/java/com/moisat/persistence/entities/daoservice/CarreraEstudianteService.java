package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.CarreraEstudiante;
import com.moisat.persistence.entities.CarreraEstudianteId;
import com.moisat.persistence.entities.dao.CarreraEstudianteDao;

public class CarreraEstudianteService {

	
	
    private static CarreraEstudianteDao carreraEstudianteDao;

    public CarreraEstudianteService() {

        carreraEstudianteDao = new CarreraEstudianteDao();

    }

 

    public void persist(CarreraEstudiante entity) {

        carreraEstudianteDao.openCurrentSessionwithTransaction();

        carreraEstudianteDao.persist(entity);

        carreraEstudianteDao.closeCurrentSessionwithTransaction();

    }



    public void update(CarreraEstudiante entity) {

        carreraEstudianteDao.openCurrentSessionwithTransaction();

        carreraEstudianteDao.update(entity);

        carreraEstudianteDao.closeCurrentSessionwithTransaction();

    }

 

    public CarreraEstudiante findById(CarreraEstudianteId  id) {

        carreraEstudianteDao.openCurrentSession();

        CarreraEstudiante carreraEstudiante = carreraEstudianteDao.findById(id);

        carreraEstudianteDao.closeCurrentSession();

        return carreraEstudiante;

    }

 

    public void delete(CarreraEstudianteId id) {

        carreraEstudianteDao.openCurrentSessionwithTransaction();

        CarreraEstudiante carreraEstudiante = carreraEstudianteDao.findById(id);

        carreraEstudianteDao.delete(carreraEstudiante);

        carreraEstudianteDao.closeCurrentSessionwithTransaction();

    }

 

    public List<CarreraEstudiante> findAll() {

        carreraEstudianteDao.openCurrentSession();

        List<CarreraEstudiante> carreraEstudiantes = carreraEstudianteDao.findAll();

        carreraEstudianteDao.closeCurrentSession();

        return carreraEstudiantes;

    }

 

    public void deleteAll() {

        carreraEstudianteDao.openCurrentSessionwithTransaction();

        carreraEstudianteDao.deleteAll();

        carreraEstudianteDao.closeCurrentSessionwithTransaction();

    }

 

    public CarreraEstudianteDao carreraEstudianteDao() {

        return carreraEstudianteDao;

    }

}
