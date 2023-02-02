package com.solvd.course.designpatterns.abstractfactory.factoryclasses;

import com.solvd.course.designpatterns.abstractfactory.binaryclasses.*;
import com.solvd.course.designpatterns.util.IncorrectTypeException;

public class SecondTypeOfClassesFactory extends AbstractFactory {
    @Override
    public FirstTypeOfEntity getFirstTypeOfEntity(String firstType) {
        return null;
    }

    @Override
    public SecondTypeOfEntity getSecondTypeOfEntity(String secondType) {
        if(secondType == null || secondType.isEmpty()) {
            throw new IncorrectTypeException("Type should be declared");
        }
        switch (secondType) {
            case "secondTypeFirst": return new SecondTypeFirstSubclass();
            case "secondTypeSecond": return new SecondTypeSecondSubclass();
            default: throw new IncorrectTypeException("only 'firstTypeFirst' or  'firstTypeSecond' supported");
        }
    }
}
