package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
    ShippingCenter bean = context.getBean(ShippingCenter.class);

    @Test
    public void shouldSendPackage() {
        String myPackage = bean.sendPackage("Mountain Hill 12, New York", 22.4);
        assertEquals("Package delivered to: Mountain Hill 12, New York", myPackage);
    }

    @Test
    public void shouldNotSendPackage() {
        String myPackage = bean.sendPackage("Mountain Hill 12, New York", 44.4);
        assertEquals("Package not delivered to: Mountain Hill 12, New York", myPackage);
    }
}