package com.solvd.course.designpatterns.abstractfactory.factoryclasses;

import com.solvd.course.designpatterns.abstractfactory.binaryclasses.FirstTypeFirstSubclass;
import com.solvd.course.designpatterns.abstractfactory.binaryclasses.FirstTypeOfEntity;
import com.solvd.course.designpatterns.abstractfactory.binaryclasses.FirstTypeSecondSubclass;
import com.solvd.course.designpatterns.abstractfactory.binaryclasses.SecondTypeOfEntity;
import com.solvd.course.designpatterns.util.IncorrectTypeException;

public class FirstTypeOfClassesFactory extends AbstractFactory {

    @Override
    public FirstTypeOfEntity getFirstTypeOfEntity(String firstType) {
        if(firstType == null || firstType.isEmpty()) {
            throw new IncorrectTypeException("Type should be declared");
        }
        switch (firstType) {
            case "firstTypeFirst": return new FirstTypeFirstSubclass();
            case "firstTypeSecond": return new FirstTypeSecondSubclass();
            default: throw new IncorrectTypeException("only 'firstTypeFirst' or  'firstTypeSecond' supported");
        }
    }

    @Override
    public SecondTypeOfEntity getSecondTypeOfEntity(String secondType) {
        return null;
    }
}
