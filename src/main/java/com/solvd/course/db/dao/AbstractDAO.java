package com.solvd.course.db.dao;

public interface AbstractDAO<T> {
    T getById(int id);

    void insertEntity(T t);
}
