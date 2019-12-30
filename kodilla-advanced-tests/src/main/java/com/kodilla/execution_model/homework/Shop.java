package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getOrder(int index) {
        if (index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }

    public List<Order> getOrdersByDate(Date startDate, Date endDate) {
        List<Order> foundOrders = orders.stream()
                .filter(order -> order.getOrderDate().after(startDate) && order.getOrderDate().before(endDate))
                .collect(Collectors.toList());
        if (foundOrders.size() > 0)
            return foundOrders;
        else
            return null;
    }

    public List<Order> getOrdersByPrice(double minPrice, double maxPrice) {
        List<Order> foundOrders = orders.stream()
                .filter(order -> order.getPrice() > minPrice && order.getPrice() < maxPrice)
                .collect(Collectors.toList());
        if (foundOrders.size() > 0)
            return foundOrders;
        else
            return null;
    }

    public int getNumberOfOrders() {
        return this.orders.size();
    }

    public double getSumOfOrders() {
        double sum = orders.stream()
                .mapToDouble(Order::getPrice).sum();
        return sum;
    }
}