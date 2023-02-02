package com.solvd.course.designpatterns.simplebuilder;

import com.solvd.course.designpatterns.simplebuilder.binary.FirstClass;

public class SimpleBuilder {
    public FirstClass generateFirstClass() {
        FirstClass firstClass = new FirstClass("First Class");
        return firstClass;
    }
}
