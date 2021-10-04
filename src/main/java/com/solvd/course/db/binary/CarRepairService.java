package com.solvd.course.db.binary;

import java.util.Objects;

public class CarRepairService extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarRepairService that = (CarRepairService) o;
        return getId() == that.getId() && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), name);
    }

    @Override
    public String toString() {
        return "CarService{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                '}';
    }
}
