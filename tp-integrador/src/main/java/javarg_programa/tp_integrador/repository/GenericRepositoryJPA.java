package javarg_programa.tp_integrador.repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class GenericRepositoryJPA<T> implements IGenericRepository<T> {
	  protected EntityManager entityManager;
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
	    entityManager.persist(t);
	    return t;
	  }
	  public void delete(final Object objeto) {
	     entityManager.remove(entityManager.merge(objeto));
	  }
	  public T find(final Object id) {
	    return (T) entityManager.find(type, id);
	  }
	  public T update(final T t) {
	    return entityManager.merge(t);
	  }
}
