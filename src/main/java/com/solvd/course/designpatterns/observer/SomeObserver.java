package com.solvd.course.designpatterns.observer;

public abstract class SomeObserver {
    protected Subject subject;
    public abstract void reactionOnAction();
}
