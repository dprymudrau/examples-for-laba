package com.solvd.course.designpatterns.abstractfactory.binaryclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstTypeSecondSubclass implements FirstTypeOfEntity {
    private final static Logger LOG = LogManager.getLogger(FirstTypeSecondSubclass.class);
    @Override
    public void tellUs() {
        LOG.info("This is First Type second subclass");
    }
}
