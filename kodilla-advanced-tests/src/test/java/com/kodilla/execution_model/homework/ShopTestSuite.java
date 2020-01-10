package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    Order milk = new Order(3.45, new Date(2019,1,1), "Robert");
    Order eggs = new Order(6.99, new Date(2019,12,11), "Tomas");
    Order bread = new Order(2.45, new Date(2019, 2,22), "Robert");
    Order vine = new Order(45.99, new Date(2019, 3, 12), "Ann");
    Order oranges = new Order(7.49, new Date(2019,10,3), "Robert");

    @BeforeEach
    public void initializeOrders() {
        shop.addOrder(milk);
        shop.addOrder(eggs);
        shop.addOrder(bread);
        shop.addOrder(vine);
        shop.addOrder(oranges);
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @Test
    public void shouldAddOrdersToShop() {
        //When
        int numberOfOrders = this.shop.getNumberOfOrders();

        //Then
        assertEquals(5, numberOfOrders);
    }

    @Test
    public void shouldReturnExistingOrder() {
        //When
        Order result = this.shop.getOrder(2);

        //Then
        assertEquals("Robert", result.getName());
        assertEquals(2.45, result.getPrice());
        assertEquals(new Date(2019, 2,22), result.getOrderDate());
    }

    @Test
    public void shouldReturnOrdersFromGivenDates() {
        //When
        List<Order> foundOrders = this.shop.getOrdersByDate(new Date(2018,1,1), new Date(2019,3,30));

        //Then
        assertEquals(3, foundOrders.size());
    }

    @Test
    public void shouldReturnOrdersForGivenPrices() {
        //When
        List<Order> foundOrders = this.shop.getOrdersByPrice(3.00, 7.00);

        //Then
        assertEquals(2, foundOrders.size());
    }

    @Test
    public void shouldReturnSumOfAllOrders() {
        //When
        double sum = this.shop.getSumOfOrders();

        //Then
        assertEquals(66.37, sum, 0.01);
    }

    @Test
    public void shouldReturnNullForOrdersOutOfDateRange() {
        //When
        List<Order> foundOrders = this.shop.getOrdersByDate(new Date(2018,1,1), new Date(2018,3,30));

        //Then
        assertNull(foundOrders);
    }

    @Test
    public void shouldReturnNullForOrdersOutOfPriceRange() {
        //When
        List<Order> foundOrders = this.shop.getOrdersByPrice(0.00, 1.00);

        //Then
        assertNull(foundOrders);
    }
}