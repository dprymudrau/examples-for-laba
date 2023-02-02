package com.solvd.course.designpatterns.factory.exampleclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeServiceFirstImpl implements SomeService {
    private final static Logger LOG = LogManager.getLogger(SomeServiceFirstImpl.class);
    @Override
    public void doAction() {
        LOG.info("This is the First implementation");
    }
}
