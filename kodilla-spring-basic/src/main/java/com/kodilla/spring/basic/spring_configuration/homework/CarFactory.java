package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarFactory {
    private Car car;

    @Bean
    @Scope("prototype")
    public Car getTypeOfCar(String season) {
        switch (season) {
            case "winter":
                car = new Suv();
                break;
            case "summer":
                car = new Cabrio();
                break;
            case "spring":
            case "autumn":
                car = new Sedan();
                break;
            default:
                break;
        }
        return car;
    }

    @Bean
    @Scope("prototype")
    public boolean areLightsOn(Car car){
        return car.hasHeadlightsTurnedOn();
    }
}