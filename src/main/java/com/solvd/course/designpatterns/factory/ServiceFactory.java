package com.solvd.course.designpatterns.factory;

import com.solvd.course.designpatterns.factory.exampleclasses.SomeService;
import com.solvd.course.designpatterns.factory.exampleclasses.SomeServiceFirstImpl;
import com.solvd.course.designpatterns.factory.exampleclasses.SomeServiceSecondImpl;
import com.solvd.course.designpatterns.util.IncorrectTypeException;

public class ServiceFactory {

    public SomeService getService(String type) {
        if(type == null || type.isEmpty()) {
            throw new IncorrectTypeException("Service type should be declared");
        }
        switch (type) {
            case "first": return new SomeServiceFirstImpl();
            case "second": return new SomeServiceSecondImpl();
            default: throw new IncorrectTypeException("Unsupported service type. 'first' and 'second' types supported only");
        }
    }
}
