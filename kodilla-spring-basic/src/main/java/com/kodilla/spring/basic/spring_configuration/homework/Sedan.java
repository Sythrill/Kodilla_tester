package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Sedan implements Car {

    private LocalDateTime currentHour = TimeSetup.now();

    @Override
    public String getCarType() {
        return "Sedan";
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        int hour = currentHour.atZone(ZoneId.systemDefault()).getHour();
        if (hour <= 6 || hour >= 20) {
            return true;
        } else {
            return false;
        }
    }
}
