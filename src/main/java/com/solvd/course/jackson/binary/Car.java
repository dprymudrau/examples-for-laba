package com.solvd.course.jackson.binary;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {

    @JsonProperty
    private String model;

    @JsonProperty
    private String year;

    @JsonProperty("number")
    private String num;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
