package com.solvd.course.db.binary;

import java.util.Objects;

public class Car extends BaseEntity {

    private String modelName;
    private String number;
    private int userId;

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
        return getId() == car.getId() && userId == car.userId && Objects.equals(modelName, car.modelName) && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), modelName, number, userId);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + getId() +
                ", modelName='" + modelName + '\'' +
                ", number='" + number + '\'' +
                ", userId=" + userId +
                '}';
    }
}
