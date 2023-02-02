package com.solvd.course.designpatterns.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MineObserver extends SomeObserver {
    private final static Logger LOG = LogManager.getLogger(MineObserver.class);

    public MineObserver(Subject subject) {
        super.subject = subject;
        subject.attach(this);
    }
    @Override
    public void reactionOnAction() {
        LOG.info("state was changed");
    }
}
