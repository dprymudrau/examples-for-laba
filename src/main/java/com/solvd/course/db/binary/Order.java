package com.solvd.course.db.binary;

import java.util.Objects;

public class Order extends BaseEntity {

    private double price;
    private String carServiceName;
    private String userName;
    private String carModelName;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCarServiceName() {
        return carServiceName;
    }

    public void setCarServiceName(String carServiceName) {
        this.carServiceName = carServiceName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return getId() == order.getId() && Double.compare(order.price, price) == 0 && Objects.equals(carServiceName, order.carServiceName) && Objects.equals(userName, order.userName) && Objects.equals(carModelName, order.carModelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), price, carServiceName, userName, carModelName);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + getId() +
                ", price=" + price +
                ", carServiceName='" + carServiceName + '\'' +
                ", userName='" + userName + '\'' +
                ", carModelName='" + carModelName + '\'' +
                '}';
    }
}
