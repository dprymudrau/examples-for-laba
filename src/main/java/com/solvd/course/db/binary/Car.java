package com.solvd.course.db.binary;

import java.util.Objects;

public class Car {
    private int id;
    private String modelName;
    private String number;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && userId == car.userId && Objects.equals(modelName, car.modelName) && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelName, number, userId);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", number='" + number + '\'' +
                ", userId=" + userId +
                '}';
    }
}
