package com.solvd.course.designpatterns.abstractfactory.binaryclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecondTypeFirstSubclass implements SecondTypeOfEntity {
    private final static Logger LOG = LogManager.getLogger(SecondTypeFirstSubclass.class);
    @Override
    public void tellThem() {
        LOG.info("This is Second Type first subclass");
    }
}
