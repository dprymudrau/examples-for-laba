package com.solvd.course.designpatterns.factory;

public class Check {

    //Factory used when you have a lot of implementations of same interface|abstract class
    //and create object with same steps a lot of times in project
    public static void main(String[] args) {
        ServiceFactory serviceFactory = new ServiceFactory();
        serviceFactory.getService("first").doAction();
        serviceFactory.getService("second").doAction();
    }
}
