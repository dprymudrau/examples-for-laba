package com.solvd.course.designpatterns.factory.exampleclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeServiceSecondImpl implements SomeService {
    private final static Logger LOG = LogManager.getLogger(SomeServiceSecondImpl.class);
    @Override
    public void doAction() {
        LOG.info("This is the Second implementation");
    }
}
