package com.solvd.course.designpatterns.abstractfactory;

import com.solvd.course.designpatterns.abstractfactory.factoryclasses.AbstractFactory;
import com.solvd.course.designpatterns.abstractfactory.factoryclasses.FirstTypeOfClassesFactory;
import com.solvd.course.designpatterns.abstractfactory.factoryclasses.SecondTypeOfClassesFactory;

public class Check {

    //Abstract factory is used when you project already have a lot of factories and you need to use them in numerous
    // amount of places in project so it will be easier to introduce abstraction for them for future extensibility
    // and reusage
    public static void main(String[] args) {
        AbstractFactory firstFactory = new FirstTypeOfClassesFactory();
        firstFactory.getFirstTypeOfEntity("firstTypeFirst").tellUs();
        firstFactory.getFirstTypeOfEntity("firstTypeSecond").tellUs();

        AbstractFactory secondFactory = new SecondTypeOfClassesFactory();
        secondFactory.getSecondTypeOfEntity("secondTypeFirst").tellThem();
        secondFactory.getSecondTypeOfEntity("secondTypeSecond").tellThem();
    }
}
