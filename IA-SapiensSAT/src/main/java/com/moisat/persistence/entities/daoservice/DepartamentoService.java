package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.Departamento;
import com.moisat.persistence.entities.dao.DepartamentoDao;

public class DepartamentoService {

	
	
    private static DepartamentoDao departamentoDao;

    public DepartamentoService() {
        departamentoDao = new DepartamentoDao();
    }

 

    public void persist(Departamento entity) {

        departamentoDao.openCurrentSessionwithTransaction();
        departamentoDao.persist(entity);
        departamentoDao.closeCurrentSessionwithTransaction();
    }



    public void update(Departamento entity) {

        departamentoDao.openCurrentSessionwithTransaction();
        departamentoDao.update(entity);
        departamentoDao.closeCurrentSessionwithTransaction();

    }

 

    public Departamento findById(String id) {

        departamentoDao.openCurrentSession();
        Departamento departamento = departamentoDao.findById(id);
        departamentoDao.closeCurrentSession();
        return departamento;
    }

 

    public void delete(String id) {

        departamentoDao.openCurrentSessionwithTransaction();
        Departamento departamento = departamentoDao.findById(id);
        departamentoDao.delete(departamento);
        departamentoDao.closeCurrentSessionwithTransaction();

    }

 

    public List<Departamento> findAll() {

        departamentoDao.openCurrentSession();

        List<Departamento> departamentos = departamentoDao.findAll();

        departamentoDao.closeCurrentSession();

        return departamentos;

    }

 

    public void deleteAll() {

        departamentoDao.openCurrentSessionwithTransaction();

        departamentoDao.deleteAll();

        departamentoDao.closeCurrentSessionwithTransaction();

    }

 

    public DepartamentoDao departamentoDao() {

        return departamentoDao;

    }

}
