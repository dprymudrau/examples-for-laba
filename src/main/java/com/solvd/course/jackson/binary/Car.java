package com.solvd.course.jackson.binary;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {

    @JsonProperty
    private String model;

    @JsonProperty
    private int year;

    @JsonProperty("number")
    private String num;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", num='" + num + '\'' +
                '}';
    }
}
