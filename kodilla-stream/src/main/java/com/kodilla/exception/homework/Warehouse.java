package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) {
        Order order = null;
        try {
            order = orders
                    .stream()
                    .filter(o -> o.getNumber().equals(number))
                    .findFirst().orElseThrow(OrderDoesntExistsException::new);
            System.out.println("Your order number: " + order.getNumber());
        } catch (OrderDoesntExistsException e) {
            System.out.println("Order with this number does not exists.");
        } finally {
            System.out.println("Thanks for searching.");
        }
        return order;
    }
}