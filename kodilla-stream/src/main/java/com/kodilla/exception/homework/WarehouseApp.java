package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1234"));
        warehouse.addOrder(new Order("432"));
        warehouse.addOrder(new Order("9876"));
        warehouse.addOrder(new Order("567890"));

        warehouse.getOrder("1234");
        warehouse.getOrder("3333");
    }
}