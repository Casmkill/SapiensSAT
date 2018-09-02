package com.moisat.persistence.entities.dao;
// Generated Sep 1, 2018 11:44:51 AM by Hibernate Tools 5.2.3.Final

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.moisat.persistence.entities.FactorRiesgo;

import com.moisat.persistence.entities.daointerface.DaoInterface;

/**
 * Home object for domain model class FactorRiesgo.
 * @see com.moisat.persistence.entities.FactorRiesgo
 * @author Hibernate Tools
 */

public class FactorRiesgoDao implements DaoInterface<FactorRiesgo, Long>{

	private Session currentSession;
	private Transaction currentTransaction;

	public FactorRiesgoDao() {
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
	public void persist(FactorRiesgo entity) {
		getCurrentSession().save(entity);

	}

	@Override
	public void update(FactorRiesgo entity) {
		// TODO Auto-generated method stub
		getCurrentSession().update(entity);

	}

	@Override
	public FactorRiesgo findById(Long  id) {
		// TODO Auto-generated method stub
		FactorRiesgo factorRiesgo = getCurrentSession().get(FactorRiesgo.class, id);
		return factorRiesgo;
	}

	@Override
	public void delete(FactorRiesgo entity) {
		// TODO Auto-generated method stub
		getCurrentSession().delete(entity);

	}

	@Override
	public List<FactorRiesgo> findAll() {
		// TODO Auto-generated method stub
		List<FactorRiesgo> factoresRiesgo = (List<FactorRiesgo>) getCurrentSession().createQuery("from FACTOR_RIESGO").list();
		return factoresRiesgo;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		List<FactorRiesgo> entityList = findAll();

		for (FactorRiesgo entity : entityList) {
			delete(entity);
		}
	}
}
