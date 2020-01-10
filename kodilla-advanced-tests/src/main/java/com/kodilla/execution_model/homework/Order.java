package com.kodilla.execution_model.homework;

import java.util.Date;

public class Order {
    private double price;
    private Date orderDate;
    private String name;

    public Order(double price, Date orderDate, String name) {
        this.price = price;
        this.orderDate = orderDate;
        this.name = name;
    }

    public double getPrice() {
        return price;
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
                "Price=" + price +
                ", orderDate=" + orderDate +
                ", name='" + name + '\'' +
                '}';
    }
}
