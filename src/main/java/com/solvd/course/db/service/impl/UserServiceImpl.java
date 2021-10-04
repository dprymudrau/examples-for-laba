package com.solvd.course.db.service.impl;

import com.solvd.course.db.binary.User;
import com.solvd.course.db.dao.UserDAO;
import com.solvd.course.db.service.UserService;
import com.solvd.course.db.util.MyBatisDaoFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);

    private static final SqlSessionFactory SESSION_FACTORY = MyBatisDaoFactory.getSqlSessionFactory();

    @Override
    public User create(User user) {
        try(SqlSession sqlSession = SESSION_FACTORY.openSession()) {
            UserDAO userDAO = sqlSession.getMapper(UserDAO.class);

            try {
                userDAO.create(user);

                sqlSession.commit();
            } catch (Exception e) {
                sqlSession.rollback();
                LOGGER.error(e.getMessage(), e);
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return user;
    }

    @Override
    public User getById(Long id) {
        User user;
        try(SqlSession sqlSession = SESSION_FACTORY.openSession()) {
            UserDAO userDAO = sqlSession.getMapper(UserDAO.class);
            user = userDAO.getById(id);
        }
        return user;
    }
}
