package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    Warehouse warehouse = new Warehouse();

    @Test
    public void getOrderTest() throws OrderDoesntExistsException {

        warehouse.addOrder(new Order("1234"));
        warehouse.addOrder(new Order("432"));
        warehouse.addOrder(new Order("9876"));
        warehouse.addOrder(new Order("567890"));
        Order order = warehouse.getOrder("1234");
        assertTrue(order instanceof Order);
    }

    @Test(expected = OrderDoesntExistsException.class)
    public void getOrderTest_withException() throws OrderDoesntExistsException {

        warehouse.addOrder(new Order("1234"));
        warehouse.addOrder(new Order("432"));
        warehouse.addOrder(new Order("9876"));
        warehouse.addOrder(new Order("567890"));
        Order order = warehouse.getOrder("3");
        assertNull(order);
    }
}