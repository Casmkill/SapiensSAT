package com.moisat.persistence.entities.daoservice;

import java.util.List;

import com.moisat.persistence.entities.ProtocoloAtencion;
import com.moisat.persistence.entities.dao.ProtocoloAtencionDao;

public class ProtocoloAtencionService {

	
	
    private static ProtocoloAtencionDao protocoloAtencionDao;

    public ProtocoloAtencionService() {

        protocoloAtencionDao = new ProtocoloAtencionDao();

    }

 

    public void persist(ProtocoloAtencion entity) {

        protocoloAtencionDao.openCurrentSessionwithTransaction();

        protocoloAtencionDao.persist(entity);

        protocoloAtencionDao.closeCurrentSessionwithTransaction();

    }



    public void update(ProtocoloAtencion entity) {

        protocoloAtencionDao.openCurrentSessionwithTransaction();

        protocoloAtencionDao.update(entity);

        protocoloAtencionDao.closeCurrentSessionwithTransaction();

    }

 

    public ProtocoloAtencion findById(Long id) {

        protocoloAtencionDao.openCurrentSession();

        ProtocoloAtencion protocoloAtencion = protocoloAtencionDao.findById(id);

        protocoloAtencionDao.closeCurrentSession();

        return protocoloAtencion;

    }

 

    public void delete(Long id) {

        protocoloAtencionDao.openCurrentSessionwithTransaction();

        ProtocoloAtencion protocoloAtencion = protocoloAtencionDao.findById(id);

        protocoloAtencionDao.delete(protocoloAtencion);

        protocoloAtencionDao.closeCurrentSessionwithTransaction();

    }

 

    public List<ProtocoloAtencion> findAll() {

        protocoloAtencionDao.openCurrentSession();

        List<ProtocoloAtencion> protocolosAtencion = protocoloAtencionDao.findAll();

        protocoloAtencionDao.closeCurrentSession();

        return protocolosAtencion;

    }

 

    public void deleteAll() {

        protocoloAtencionDao.openCurrentSessionwithTransaction();

        protocoloAtencionDao.deleteAll();

        protocoloAtencionDao.closeCurrentSessionwithTransaction();

    }

 

    public ProtocoloAtencionDao protocoloAtencionDao() {

        return protocoloAtencionDao;

    }

}
