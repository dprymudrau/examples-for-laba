package com.solvd.course.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<SomeObserver> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(SomeObserver someObserver) {
        this.observers.add(someObserver);
    }

    private void notifyAllObservers() {
        this.observers.forEach(SomeObserver::reactionOnAction);
    }
}
