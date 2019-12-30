package com.kodilla.execution_model.homework;

import java.util.Date;

public class Order {
    private double Price;
    private Date orderDate;
    private String name;

    public Order(double price, Date orderDate, String name) {
        Price = price;
        this.orderDate = orderDate;
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Price=" + Price +
                ", orderDate=" + orderDate +
                ", name='" + name + '\'' +
                '}';
    }
}
