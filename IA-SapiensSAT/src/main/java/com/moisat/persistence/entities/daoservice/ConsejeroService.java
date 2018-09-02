package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Consejero;
import com.moisat.persistence.entities.ConsejeroId;
import com.moisat.persistence.entities.dao.ConsejeroDao;

public class ConsejeroService {

	
	
    private static ConsejeroDao consejeroDao;

    public ConsejeroService() {

        consejeroDao = new ConsejeroDao();

    }

 

    public void persist(Consejero entity) {

        consejeroDao.openCurrentSessionwithTransaction();

        consejeroDao.persist(entity);

        consejeroDao.closeCurrentSessionwithTransaction();

    }



    public void update(Consejero entity) {

        consejeroDao.openCurrentSessionwithTransaction();

        consejeroDao.update(entity);

        consejeroDao.closeCurrentSessionwithTransaction();

    }

 

    public Consejero findById(ConsejeroId id) {

        consejeroDao.openCurrentSession();

        Consejero consejero = consejeroDao.findById(id);

        consejeroDao.closeCurrentSession();

        return consejero;

    }

 

    public void delete(ConsejeroId id) {

        consejeroDao.openCurrentSessionwithTransaction();

        Consejero consejero = consejeroDao.findById(id);

        consejeroDao.delete(consejero);

        consejeroDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Consejero> findAll() {

        consejeroDao.openCurrentSession();

        List<Consejero> consejeros = consejeroDao.findAll();

        consejeroDao.closeCurrentSession();

        return consejeros;

    }

 

    public void deleteAll() {

        consejeroDao.openCurrentSessionwithTransaction();

        consejeroDao.deleteAll();

        consejeroDao.closeCurrentSessionwithTransaction();

    }

 

    public ConsejeroDao consejeroDao() {

        return consejeroDao;

    }

}
