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

import com.moisat.persistence.entities.CarreraEstudiante;
import com.moisat.persistence.entities.CarreraEstudiante;
import com.moisat.persistence.entities.CarreraEstudianteId;
import com.moisat.persistence.entities.daointerface.DaoInterface;

/**
 * Home object for domain model class CarreraEstudiante.
 * 
 * @see com.moisat.persistence.entities.CarreraEstudiante
 * @author Hibernate Tools
 */

public class CarreraEstudianteDao implements DaoInterface<CarreraEstudiante, CarreraEstudianteId> {
	private Session currentSession;
	private Transaction currentTransaction;

	public CarreraEstudianteDao() {
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
	public void persist(CarreraEstudiante entity) {
		getCurrentSession().save(entity);

	}

	@Override
	public void update(CarreraEstudiante entity) {
		// TODO Auto-generated method stub
		getCurrentSession().update(entity);

	}

	@Override
	public CarreraEstudiante findById(CarreraEstudianteId id) {
		// TODO Auto-generated method stub
		CarreraEstudiante carreraEstudiante = getCurrentSession().get(CarreraEstudiante.class, id);
		return carreraEstudiante;
	}

	@Override
	public void delete(CarreraEstudiante entity) {
		// TODO Auto-generated method stub
		getCurrentSession().delete(entity);

	}

	@Override
	public List<CarreraEstudiante> findAll() {
		// TODO Auto-generated method stub
		List<CarreraEstudiante> carreraEstudiantes = (List<CarreraEstudiante>) getCurrentSession()
				.createQuery("from CARRERA_ESTUDIANTE").list();
		return carreraEstudiantes;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		List<CarreraEstudiante> entityList = findAll();

		for (CarreraEstudiante entity : entityList) {
			delete(entity);
		}
	}
}
