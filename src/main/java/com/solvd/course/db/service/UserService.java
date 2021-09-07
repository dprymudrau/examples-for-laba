package com.solvd.course.db.service;

import com.solvd.course.db.binary.User;
import com.solvd.course.db.dao.UserDAO;
import com.solvd.course.db.util.MyBatisDaoFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {

    public User getUserById(int id) {
        SqlSessionFactory sqlSessionFactory = MyBatisDaoFactory.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDAO userDAO = sqlSession.getMapper(UserDAO.class);
        User user = userDAO.getById(1);
        sqlSession.close();
        return user;
    }
}
