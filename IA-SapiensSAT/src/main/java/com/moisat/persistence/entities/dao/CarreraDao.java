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
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.moisat.persistence.entities.Carrera;
import com.moisat.persistence.entities.Carrera;
import com.moisat.persistence.entities.daointerface.DaoInterface;

/**
 * Home object for domain model class Carrera.
 * 
 * @see com.moisat.persistence.entities.Carrera
 * @author Hibernate Tools
 */

public class CarreraDao implements DaoInterface<Carrera, Long> {
	private Session currentSession;
	private Transaction currentTransaction;

	public CarreraDao() {
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

		Configuration configuration = new Configuration().configure();

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()

				.applySettings(configuration.getProperties());

		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

		return sessionFactory;

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
	public void persist(Carrera entity) {
		getCurrentSession().save(entity);

	}

	@Override
	public void update(Carrera entity) {
		// TODO Auto-generated method stub
		getCurrentSession().update(entity);

	}

	@Override
	public Carrera findById(Long id) {
		// TODO Auto-generated method stub
		Carrera carrera = getCurrentSession().get(Carrera.class, id);
		return carrera;
	}

	@Override
	public void delete(Carrera entity) {
		// TODO Auto-generated method stub
		getCurrentSession().delete(entity);

	}

	@Override
	public List<Carrera> findAll() {
		// TODO Auto-generated method stub
		List<Carrera> carreras = (List<Carrera>) getCurrentSession().createQuery("from CARRERA").list();
		return carreras;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		List<Carrera> entityList = findAll();

		for (Carrera entity : entityList) {
			delete(entity);
		}
	}

}
