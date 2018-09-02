package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.RegistroClaseEstudiante;
import com.moisat.persistence.entities.dao.RegistroClaseEstudianteDao;

public class RegistroClaseEstudianteService {

	
	
    private static RegistroClaseEstudianteDao registroClaseEstudianteDao;

    public RegistroClaseEstudianteService() {

        registroClaseEstudianteDao = new RegistroClaseEstudianteDao();

    }

 

    public void persist(RegistroClaseEstudiante entity) {

        registroClaseEstudianteDao.openCurrentSessionwithTransaction();

        registroClaseEstudianteDao.persist(entity);

        registroClaseEstudianteDao.closeCurrentSessionwithTransaction();

    }



    public void update(RegistroClaseEstudiante entity) {

        registroClaseEstudianteDao.openCurrentSessionwithTransaction();

        registroClaseEstudianteDao.update(entity);

        registroClaseEstudianteDao.closeCurrentSessionwithTransaction();

    }

 

    public RegistroClaseEstudiante findById(Long id) {

        registroClaseEstudianteDao.openCurrentSession();

        RegistroClaseEstudiante registroClaseEstudiante = registroClaseEstudianteDao.findById(id);

        registroClaseEstudianteDao.closeCurrentSession();

        return registroClaseEstudiante;

    }

 

    public void delete(Long id) {

        registroClaseEstudianteDao.openCurrentSessionwithTransaction();

        RegistroClaseEstudiante registroClaseEstudiante = registroClaseEstudianteDao.findById(id);

        registroClaseEstudianteDao.delete(registroClaseEstudiante);

        registroClaseEstudianteDao.closeCurrentSessionwithTransaction();

    }

 

    public List<RegistroClaseEstudiante> findAll() {

        registroClaseEstudianteDao.openCurrentSession();

        List<RegistroClaseEstudiante> registroClaseEstudiantees = registroClaseEstudianteDao.findAll();

        registroClaseEstudianteDao.closeCurrentSession();

        return registroClaseEstudiantees;

    }

 

    public void deleteAll() {

        registroClaseEstudianteDao.openCurrentSessionwithTransaction();

        registroClaseEstudianteDao.deleteAll();

        registroClaseEstudianteDao.closeCurrentSessionwithTransaction();

    }

 

    public RegistroClaseEstudianteDao registroClaseEstudianteDao() {

        return registroClaseEstudianteDao;

    }

}
