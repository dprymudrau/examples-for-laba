package com.solvd.course.db;

import com.solvd.course.db.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        UserService userService = new UserService();
        log.info(userService.getUserById(1));
    }
}
