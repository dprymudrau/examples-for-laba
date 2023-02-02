package com.solvd.course.designpatterns.abstractfactory.binaryclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecondTypeSecondSubclass implements SecondTypeOfEntity {

    private final static Logger LOG = LogManager.getLogger(SecondTypeSecondSubclass.class);
    @Override
    public void tellThem() {
        LOG.info("This is Second Type second subclass");
    }
}
