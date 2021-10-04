package com.solvd.course.db.dao;

public interface AbstractDAO<T> {

    void create(T t);

    T getById(Long id);
}
