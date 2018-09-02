package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Actor;
import com.moisat.persistence.entities.dao.ActorDao;

public class ActorService {
	
	
    private static ActorDao actorDao;

    public ActorService() {

        actorDao = new ActorDao();

    }

 

    public void persist(Actor entity) {

        actorDao.openCurrentSessionwithTransaction();

        actorDao.persist(entity);

        actorDao.closeCurrentSessionwithTransaction();

    }



    public void update(Actor entity) {

        actorDao.openCurrentSessionwithTransaction();

        actorDao.update(entity);

        actorDao.closeCurrentSessionwithTransaction();

    }

 

    public Actor findById(Long id) {

        actorDao.openCurrentSession();

        Actor actor = actorDao.findById(id);

        actorDao.closeCurrentSession();

        return actor;

    }

 

    public void delete(Long id) {

        actorDao.openCurrentSessionwithTransaction();

        Actor actor = actorDao.findById(id);

        actorDao.delete(actor);

        actorDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Actor> findAll() {

        actorDao.openCurrentSession();

        List<Actor> actores = actorDao.findAll();

        actorDao.closeCurrentSession();

        return actores;

    }

 

    public void deleteAll() {

        actorDao.openCurrentSessionwithTransaction();

        actorDao.deleteAll();

        actorDao.closeCurrentSessionwithTransaction();

    }

 

    public ActorDao actorDao() {

        return actorDao;

    }


}
