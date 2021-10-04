package com.solvd.course.db;

import com.solvd.course.db.binary.User;
import com.solvd.course.db.service.CarService;
import com.solvd.course.db.service.UserService;
import com.solvd.course.db.service.impl.CarServiceImpl;
import com.solvd.course.db.service.impl.UserServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        log.info(userService.getById(1L));

        CarService carService = new CarServiceImpl();
        log.info(carService.getById(1L));

        User user = new User();
        user.setName("Alex");
        user.setAge(15);

        User createdUser = userService.create(user);
        log.info(createdUser);
    }
}
