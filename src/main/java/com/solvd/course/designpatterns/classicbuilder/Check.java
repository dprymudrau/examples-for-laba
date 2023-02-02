package com.solvd.course.designpatterns.classicbuilder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Check {
    private final static Logger LOG = LogManager.getLogger(Check.class);
    public static void main(String[] args) {
        User user = User.builder()
                .setAge(25)
                .setFirstName("Dzmitry")
                .setLastName("Prymudrau")
                .build();

        LOG.info(user.toString());

    }
}
