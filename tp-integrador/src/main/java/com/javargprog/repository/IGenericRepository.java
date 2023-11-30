package com.javargprog.repository;

import java.util.List;

public interface IGenericRepository<T> {
    T create(T t);
   
    T find(T t);
 
    T update(T t);
    
    List<T> findAll(String nameTable);
}
