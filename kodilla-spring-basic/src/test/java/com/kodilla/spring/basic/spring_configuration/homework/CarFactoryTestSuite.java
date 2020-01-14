package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

class CarFactoryTestSuite {

    @Test
    public void shouldReturnCorrectTypeOfCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car suv = (Car) context.getBean("getTypeOfCar", "winter");
        Car cabrio = (Car) context.getBean("getTypeOfCar", "summer");
        Car sedan1 = (Car) context.getBean("getTypeOfCar", "spring");
        Car sedan2 = (Car) context.getBean("getTypeOfCar", "autumn");
        String suvType = suv.getCarType();
        String cabrioType = cabrio.getCarType();
        String sedanType1 = sedan1.getCarType();
        String sedanType2 = sedan2.getCarType();
        Assertions.assertEquals("Suv", suvType);
        Assertions.assertEquals("Cabrio", cabrioType);
        Assertions.assertEquals("Sedan", sedanType1);
        Assertions.assertEquals("Sedan", sedanType2);
    }

    @Test
    public void shouldReturnLightsOff() {
        int now = LocalDateTime.now().getHour();
        if (now >= 20 || now <= 6) {
            String date = "2020-01-14T15:15:30Z";
            TimeSetup.useFixedClockAt(date);
        }

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car suv = (Car) context.getBean("getTypeOfCar", "winter");
        Boolean time = (Boolean) context.getBean("areLightsOn", suv);
        Assertions.assertFalse(time);
    }

    @Test
    public void shouldReturnLightsOn() {
        int now = LocalDateTime.now().getHour();
        if ( now > 6 && now < 20 ) {
            String date = "2020-01-14T20:15:30Z";
            TimeSetup.useFixedClockAt(date);
        }

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car suv = (Car) context.getBean("getTypeOfCar", "winter");
        Boolean time = (Boolean) context.getBean("areLightsOn", suv);
        Assertions.assertTrue(time);
    }
}