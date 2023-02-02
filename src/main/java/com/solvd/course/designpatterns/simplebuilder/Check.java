package com.solvd.course.designpatterns.simplebuilder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Check {
    private static final Logger LOG = LogManager.getLogger(Check.class);

    //Simple builder needed to generate needed objects that require same steps in generation
    public static void main(String[] args) {
        LOG.info(new SimpleBuilder().generateFirstClass().getName());
    }
}
