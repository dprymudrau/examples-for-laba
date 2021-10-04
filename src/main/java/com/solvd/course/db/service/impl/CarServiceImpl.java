package com.solvd.course.db.service.impl;

import com.solvd.course.db.binary.Car;
import com.solvd.course.db.dao.CarDAO;
import com.solvd.course.db.service.CarService;
import com.solvd.course.db.util.MyBatisDaoFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class CarServiceImpl implements CarService {

    private static final SqlSessionFactory SESSION_FACTORY = MyBatisDaoFactory.getSqlSessionFactory();

    @Override
    public Car getById(Long id) {
        Car car;
        try(SqlSession sqlSession = SESSION_FACTORY.openSession()) {
            CarDAO carDAO = sqlSession.getMapper(CarDAO.class);
            car = carDAO.getById(id);
        }
        return car;
    }

}
