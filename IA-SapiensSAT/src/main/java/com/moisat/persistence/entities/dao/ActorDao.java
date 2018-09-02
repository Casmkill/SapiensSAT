package com.moisat.persistence.entities.dao;
// Generated Sep 1, 2018 11:44:51 AM by Hibernate Tools 5.2.3.Final

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.moisat.persistence.entities.Actor;
import com.moisat.persistence.entities.daointerface.DaoInterface;
import org.hibernate.SessionFactory;

/**
 * Home object for domain model class Actor.
 * 
 * @see com.moisat.persistence.entities.Actor
 * @author Hibernate Tools
 */

public class ActorDao implements DaoInterface<Actor, Long> {

	private Session currentSession;
	private Transaction currentTransaction;

	public ActorDao() {
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
	public void persist(Actor entity) {
		getCurrentSession().save(entity);

	}

	@Override
	public void update(Actor entity) {
		// TODO Auto-generated method stub
		getCurrentSession().update(entity);

	}

	@Override
	public Actor findById(Long id) {
		// TODO Auto-generated method stub
		Actor actor = getCurrentSession().get(Actor.class, id);
		return actor;
	}

	@Override
	public void delete(Actor entity) {
		// TODO Auto-generated method stub
		getCurrentSession().delete(entity);

	}

	@Override
	public List<Actor> findAll() {
		// TODO Auto-generated method stub
		List<Actor> actores = (List<Actor>) getCurrentSession().createQuery("from ACTOR").list();
		return actores;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		List<Actor> entityList = findAll();

		for (Actor entity : entityList) {
			delete(entity);
		}
	}

}
