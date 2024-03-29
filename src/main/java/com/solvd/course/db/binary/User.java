package com.solvd.course.db.binary;

import java.util.List;
import java.util.Objects;

public class User extends BaseEntity {

    private String name;
    private int age;
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User users = (User) o;
        return getId() == users.getId() && age == users.age && Objects.equals(name, users.name) && Objects.equals(cars, users.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), name, age, cars);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
