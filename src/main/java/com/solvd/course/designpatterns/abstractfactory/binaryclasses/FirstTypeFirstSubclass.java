package com.solvd.course.designpatterns.abstractfactory.binaryclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FirstTypeFirstSubclass implements FirstTypeOfEntity {
    private final static Logger LOG = LogManager.getLogger(FirstTypeFirstSubclass.class);
    @Override
    public void tellUs() {
        LOG.info("This is First Type first subclass");
    }
}
