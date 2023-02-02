package com.solvd.course.designpatterns.observer;

public class Check {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new MineObserver(subject);

        subject.setState(1);
        subject.setState(2);
    }
}
