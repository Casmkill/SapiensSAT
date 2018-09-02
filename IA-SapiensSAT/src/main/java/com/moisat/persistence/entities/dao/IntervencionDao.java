package com.moisat.persistence.entities.dao;
// Generated Sep 1, 2018 11:44:51 AM by Hibernate Tools 5.2.3.Final

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.moisat.persistence.entities.Intervencion;
import com.moisat.persistence.entities.daointerface.DaoInterface;

/**
 * Home object for domain model class Intervencion.
 * @see com.moisat.persistence.entities.Intervencion
 * @author Hibernate Tools
 */

public class IntervencionDao implements DaoInterface<Intervencion, Long>{

	private Session currentSession;
	private Transaction currentTransaction;

	public IntervencionDao() {
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
	public void persist(Intervencion entity) {
		getCurrentSession().save(entity);

	}

	@Override
	public void update(Intervencion entity) {
		// TODO Auto-generated method stub
		getCurrentSession().update(entity);

	}

	@Override
	public Intervencion findById(Long  id) {
		// TODO Auto-generated method stub
		Intervencion intervencion = getCurrentSession().get(Intervencion.class, id);
		return intervencion;
	}

	@Override
	public void delete(Intervencion entity) {
		// TODO Auto-generated method stub
		getCurrentSession().delete(entity);

	}

	@Override
	public List<Intervencion> findAll() {
		// TODO Auto-generated method stub
		List<Intervencion> intervenciones = (List<Intervencion>) getCurrentSession().createQuery("from INTERVENCION").list();
		return intervenciones;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		List<Intervencion> entityList = findAll();

		for (Intervencion entity : entityList) {
			delete(entity);
		}
	}
}
