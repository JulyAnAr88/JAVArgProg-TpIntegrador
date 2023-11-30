package com.javargprog.repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;

public class GenericRepositoryJPA<T> implements IGenericRepository<T> {
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA_PU");
	protected EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction et = entityManager.getTransaction();
	private Class<T> type;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public GenericRepositoryJPA() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) pt.getActualTypeArguments()[0];
	}

	public T create(final T t) {
		try{
			et.begin();
			entityManager.persist(t);
			et.commit();
		}finally {
			entityManager.close();
		} 		
		return t;
	}

	public T find(final Object id) {
		T ob;
		try{
			et.begin();
			ob=(T) entityManager.find(type, id);
			et.commit();
		}finally {
			entityManager.close();
		}
		return ob;
	}

	public T update(final T t) {
		T ob;
		try{
			et.begin();
			ob = entityManager.merge(t);
			et.commit();
		}finally {
			entityManager.close();
		}
		return ob;
	}
	
	public List<T> findAll(String nameTable) {
		List<T> lista = new ArrayList();
		try{
			et.begin();
			String query = "SELECT * FROM :T t";
			lista = (List<T>) entityManager.createQuery(query, lista.getClass())
					.setParameter(query, nameTable)
					.getResultList();
			et.commit();
		}finally {
			entityManager.close();
		}
		return lista;
	}
	
	
}
