package com.kodilla.spring.basic.dependency_injection.homework;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {
    String address = "Mountain Hill 12, New York";
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
    ShippingCenter bean = context.getBean(ShippingCenter.class);

    @Test
    public void shouldSendPackage() {
        String myPackage = bean.sendPackage(address, 22.4);
        System.out.println("Delivery address: " + address + " package weight: 22.4");
        assertEquals("Package delivered to: " + address, myPackage);
    }

    @Test
    public void shouldNotSendPackage() {
        String myPackage = bean.sendPackage(address, 44.4);
        System.out.println("Delivery address: " + address + " package weight: 44.4");
        assertEquals("Package not delivered to: " + address, myPackage);
    }
}