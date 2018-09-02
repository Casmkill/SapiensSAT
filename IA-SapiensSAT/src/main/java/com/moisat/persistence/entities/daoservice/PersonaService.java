package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Persona;
import com.moisat.persistence.entities.dao.PersonaDao;

public class PersonaService {

	
	
    private static PersonaDao personaDao;

    public PersonaService() {

        personaDao = new PersonaDao();

    }

 

    public void persist(Persona entity) {

        personaDao.openCurrentSessionwithTransaction();

        personaDao.persist(entity);

        personaDao.closeCurrentSessionwithTransaction();

    }



    public void update(Persona entity) {

        personaDao.openCurrentSessionwithTransaction();

        personaDao.update(entity);

        personaDao.closeCurrentSessionwithTransaction();

    }

 

    public Persona findById(Long id) {

        personaDao.openCurrentSession();

        Persona persona = personaDao.findById(id);

        personaDao.closeCurrentSession();

        return persona;

    }

 

    public void delete(Long id) {

        personaDao.openCurrentSessionwithTransaction();

        Persona persona = personaDao.findById(id);

        personaDao.delete(persona);

        personaDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Persona> findAll() {

        personaDao.openCurrentSession();

        List<Persona> personas = personaDao.findAll();

        personaDao.closeCurrentSession();

        return personas;

    }

 

    public void deleteAll() {

        personaDao.openCurrentSessionwithTransaction();

        personaDao.deleteAll();

        personaDao.closeCurrentSessionwithTransaction();

    }

 

    public PersonaDao personaDao() {

        return personaDao;

    }

}
