package com.moisat.persistence.entities.dao;
// Generated Sep 1, 2018 11:44:51 AM by Hibernate Tools 5.2.3.Final


import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.moisat.persistence.entities.Estudiante;

import com.moisat.persistence.entities.daointerface.DaoInterface;

/**
 * Home object for domain model class Estudiante.
 * @see com.moisat.persistence.entities.Estudiante
 * @author Hibernate Tools
 */

public class EstudianteDao implements DaoInterface<Estudiante, Long>{	private Session currentSession;
private Transaction currentTransaction;

public EstudianteDao() {
	// TODO Auto-generated constructor stub
}

public Session openCurrentSession() {

	currentSession = getSessionFactory().openSession();

	return currentSession;

}

public Session openCurrentSessionwithTransaction() {

	currentSession = getSessionFactory().openSession();

	currentTransaction = currentSession.beginTransaction();

	return currentSession;

}

public void closeCurrentSession() {

	currentSession.close();

}

public void closeCurrentSessionwithTransaction() {

	currentTransaction.commit();

	currentSession.close();

}

private static SessionFactory getSessionFactory() {
	try {

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()//
				.configure("hibernate.cfg.xml").build();

		// Create a metadata sources using the specified service registry.
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		return metadata.getSessionFactoryBuilder().build();
	} catch (Throwable ex) {

		System.err.println("Initial SessionFactory creation failed." + ex);
		throw new ExceptionInInitializerError(ex);
	}

}

public Session getCurrentSession() {

	return currentSession;

}

public void setCurrentSession(Session currentSession) {

	this.currentSession = currentSession;
}

public Transaction getCurrentTransaction() {

	return currentTransaction;

}

public void setCurrentTransaction(Transaction currentTransaction) {

	this.currentTransaction = currentTransaction;

}

@Override
public void persist(Estudiante entity) {
	getCurrentSession().save(entity);

}

@Override
public void update(Estudiante entity) {
	// TODO Auto-generated method stub
	getCurrentSession().update(entity);

}

@Override
public Estudiante findById(Long id) {
	// TODO Auto-generated method stub
	Estudiante estudiante = getCurrentSession().get(Estudiante.class, id);
	return estudiante;
}

@Override
public void delete(Estudiante entity) {
	// TODO Auto-generated method stub
	getCurrentSession().delete(entity);

}

@Override
public List<Estudiante> findAll() {
	// TODO Auto-generated method stub
	List<Estudiante> estudiantes = (List<Estudiante>) getCurrentSession().createQuery("from Estudiante").list();
	return estudiantes;
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	List<Estudiante> entityList = findAll();

	for (Estudiante entity : entityList) {
		delete(entity);
	}
}


}
