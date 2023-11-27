package javarg_programa.tp_integrador.repository;

public interface IGenericRepository<T> {
    T create(T t);
    
    void delete(T t);
 
    T find(T t);
 
    T update(T t);
 
    //Iterable<T> findAll();
}
