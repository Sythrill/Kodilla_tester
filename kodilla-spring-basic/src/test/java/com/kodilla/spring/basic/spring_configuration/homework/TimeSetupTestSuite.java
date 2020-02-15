package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class TimeSetupTestSuite {

    @Test
    public void shouldCreateDifferentClocks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);
        Clock clock3 = context.getBean(Clock.class);
        Assertions.assertNotEquals(clock1, clock2);
        Assertions.assertNotEquals(clock1, clock3);
        Assertions.assertNotEquals(clock3, clock1);
    }
}