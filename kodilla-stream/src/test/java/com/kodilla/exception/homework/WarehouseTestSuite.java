package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    Warehouse warehouse = new Warehouse();

    @Test
    public void getOrderTest() throws OrderDoesntExistsException {
        System.out.println("Test for method getOrder(). \n"
                + "given - order numbers 1234, 432, 9876, 567890\n"
                + "when - ask for order that exists\n"
                + "then - return order number\n");
        warehouse.addOrder(new Order("1234"));
        warehouse.addOrder(new Order("432"));
        warehouse.addOrder(new Order("9876"));
        warehouse.addOrder(new Order("567890"));
        Order order = warehouse.getOrder("1234");
        assertTrue(order instanceof Order);
    }

    @Test(expected = OrderDoesntExistsException.class)
    public void getOrderTest_withException() throws OrderDoesntExistsException {
        System.out.println("Test for exception in method getOrder(). \n"
        + "given - order numbers 1234, 432, 9876, 567890\n"
        + "when - ask for order that doesn't exists\n"
        + "then - throw OrderDoesntExistsException\n");
        warehouse.addOrder(new Order("1234"));
        warehouse.addOrder(new Order("432"));
        warehouse.addOrder(new Order("9876"));
        warehouse.addOrder(new Order("567890"));
        Order order = warehouse.getOrder("3");
        assertNull(order);
    }
}