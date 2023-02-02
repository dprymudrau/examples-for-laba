package com.solvd.course.designpatterns.abstractfactory.factoryclasses;

import com.solvd.course.designpatterns.abstractfactory.binaryclasses.FirstTypeOfEntity;
import com.solvd.course.designpatterns.abstractfactory.binaryclasses.SecondTypeOfEntity;

public abstract class AbstractFactory {
    public abstract FirstTypeOfEntity getFirstTypeOfEntity(String firstType);
    public abstract SecondTypeOfEntity getSecondTypeOfEntity(String secondType);
}
